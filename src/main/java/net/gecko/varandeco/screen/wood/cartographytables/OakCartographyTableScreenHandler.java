package net.gecko.varandeco.screen.wood.cartographytables;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.item.component.MapPostProcessing;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;

public class OakCartographyTableScreenHandler extends AbstractContainerMenu {
	public static final int MAP_SLOT_INDEX = 0;
	public static final int MATERIAL_SLOT_INDEX = 1;
	public static final int RESULT_SLOT_INDEX = 2;
	private static final int field_30776 = 3;
	private static final int field_30777 = 30;
	private static final int field_30778 = 30;
	private static final int field_30779 = 39;
	private final ContainerLevelAccess context;
	long lastTakeResultTime;
	public final Container inventory = new SimpleContainer(2) {
		@Override
		public void setChanged() {
			OakCartographyTableScreenHandler.this.slotsChanged(this);
			super.setChanged();
		}
	};
	private final ResultContainer resultInventory = new ResultContainer() {
		@Override
		public void setChanged() {
			OakCartographyTableScreenHandler.this.slotsChanged(this);
			super.setChanged();
		}
	};

	public OakCartographyTableScreenHandler(int syncId, Inventory inventory) {
		this(syncId, inventory, ContainerLevelAccess.NULL);
	}

	public OakCartographyTableScreenHandler(int syncId, Inventory inventory, ContainerLevelAccess context) {
		super(MenuType.CARTOGRAPHY_TABLE, syncId);
		this.context = context;
		this.addSlot(new Slot(this.inventory, 0, 15, 15) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return stack.is(Items.FILLED_MAP);
			}
		});
		this.addSlot(new Slot(this.inventory, 1, 15, 52) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return stack.is(Items.PAPER) || stack.is(Items.MAP) || stack.is(Items.GLASS_PANE);
			}
		});
		this.addSlot(new Slot(this.resultInventory, 2, 145, 39) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}

			@Override
			public void onTake(Player player, ItemStack stack) {
				OakCartographyTableScreenHandler.this.slots.get(0).remove(1);
				OakCartographyTableScreenHandler.this.slots.get(1).remove(1);
				stack.getItem().onCraftedPostProcess(stack, player.level());
				context.execute((world, pos) -> {
					long l = world.getGameTime();
					if (OakCartographyTableScreenHandler.this.lastTakeResultTime != l) {
						world.playSound(null, pos, SoundEvents.UI_CARTOGRAPHY_TABLE_TAKE_RESULT, SoundSource.BLOCKS, 1.0F, 1.0F);
						OakCartographyTableScreenHandler.this.lastTakeResultTime = l;
					}
				});
				super.onTake(player, stack);
			}
		});

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (int i = 0; i < 9; i++) {
			this.addSlot(new Slot(inventory, i, 8 + i * 18, 142));
		}
	}

	@Override
	public boolean stillValid(Player player) {
		return stillValid(this.context, player, DecoBlocks.OAK_CARTOGRAPHY_TABLE);
	}

	@Override
	public void slotsChanged(Container inventory) {
		ItemStack itemStack = this.inventory.getItem(0);
		ItemStack itemStack2 = this.inventory.getItem(1);
		ItemStack itemStack3 = this.resultInventory.getItem(2);
		if (itemStack3.isEmpty() || !itemStack.isEmpty() && !itemStack2.isEmpty()) {
			if (!itemStack.isEmpty() && !itemStack2.isEmpty()) {
				this.updateResult(itemStack, itemStack2, itemStack3);
			}
		} else {
			this.resultInventory.removeItemNoUpdate(2);
		}
	}

	private void updateResult(ItemStack map, ItemStack item, ItemStack oldResult) {
		this.context.execute((world, pos) -> {
			MapItemSavedData mapState = MapItem.getSavedData(map, world);
			if (mapState != null) {
				ItemStack itemStack4;
				if (item.is(Items.PAPER) && !mapState.locked && mapState.scale < 4) {
					itemStack4 = map.copyWithCount(1);
					itemStack4.set(DataComponents.MAP_POST_PROCESSING, MapPostProcessing.SCALE);
					this.broadcastChanges();
				} else if (item.is(Items.GLASS_PANE) && !mapState.locked) {
					itemStack4 = map.copyWithCount(1);
					itemStack4.set(DataComponents.MAP_POST_PROCESSING, MapPostProcessing.LOCK);
					this.broadcastChanges();
				} else {
					if (!item.is(Items.MAP)) {
						this.resultInventory.removeItemNoUpdate(2);
						this.broadcastChanges();
						return;
					}

					itemStack4 = map.copyWithCount(2);
					this.broadcastChanges();
				}

				if (!ItemStack.matches(itemStack4, oldResult)) {
					this.resultInventory.setItem(2, itemStack4);
					this.broadcastChanges();
				}
			}
		});
	}

	@Override
	public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
		return slot.container != this.resultInventory && super.canTakeItemForPickAll(stack, slot);
	}

	@Override
	public ItemStack quickMoveStack(Player player, int slot) {
		ItemStack itemStack = ItemStack.EMPTY;
		Slot slot2 = this.slots.get(slot);
		if (slot2 != null && slot2.hasItem()) {
			ItemStack itemStack2 = slot2.getItem();
			itemStack = itemStack2.copy();
			if (slot == 2) {
				itemStack2.getItem().onCraftedPostProcess(itemStack2, player.level());
				if (!this.moveItemStackTo(itemStack2, 3, 39, true)) {
					return ItemStack.EMPTY;
				}

				slot2.onQuickCraft(itemStack2, itemStack);
			} else if (slot != 1 && slot != 0) {
				if (itemStack2.is(Items.FILLED_MAP)) {
					if (!this.moveItemStackTo(itemStack2, 0, 1, false)) {
						return ItemStack.EMPTY;
					}
				} else if (!itemStack2.is(Items.PAPER) && !itemStack2.is(Items.MAP) && !itemStack2.is(Items.GLASS_PANE)) {
					if (slot >= 3 && slot < 30) {
						if (!this.moveItemStackTo(itemStack2, 30, 39, false)) {
							return ItemStack.EMPTY;
						}
					} else if (slot >= 30 && slot < 39 && !this.moveItemStackTo(itemStack2, 3, 30, false)) {
						return ItemStack.EMPTY;
					}
				} else if (!this.moveItemStackTo(itemStack2, 1, 2, false)) {
					return ItemStack.EMPTY;
				}
			} else if (!this.moveItemStackTo(itemStack2, 3, 39, false)) {
				return ItemStack.EMPTY;
			}

			if (itemStack2.isEmpty()) {
				slot2.setByPlayer(ItemStack.EMPTY);
			}

			slot2.setChanged();
			if (itemStack2.getCount() == itemStack.getCount()) {
				return ItemStack.EMPTY;
			}

			slot2.onTake(player, itemStack2);
			this.broadcastChanges();
		}

		return itemStack;
	}

	@Override
	public void removed(Player player) {
		super.removed(player);
		this.resultInventory.removeItemNoUpdate(2);
		this.context.execute((world, pos) -> this.clearContainer(player, this.inventory));
	}
}