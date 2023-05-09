package io.github.haykam821.dysmixia.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.LogoDrawer;

@Mixin(LogoDrawer.class)
public class LogoDrawerMixin {
	@Shadow
	@Mutable
	private boolean minceraft;

	@Inject(method = "<init>*", at = @At("TAIL"))
	public void forceMinceraft(CallbackInfo ci) {
		this.minceraft = true;
	}
}