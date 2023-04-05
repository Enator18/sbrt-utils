package net.enator18.sbrt.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;

@Mixin(MinecartItem.class)
public class CartItemMixin
{
    @Redirect(method = "useOnBlock", at = @At(value = "INVOKE", target = "net/minecraft/item/ItemStack.decrement (I)V"))
    public void doNothing(ItemStack stack, int amount)
    {
        return;
    }
}
