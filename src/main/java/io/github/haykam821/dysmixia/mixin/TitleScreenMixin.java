package io.github.haykam821.dysmixia.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.TitleScreen;

@SuppressWarnings("target")
@Mixin(value = TitleScreen.class, remap = false)
public class TitleScreenMixin {
	@Shadow
	@Mutable
	private boolean field_17776;

	@Inject(method = "<init>*", at = @At("TAIL"))
	public void forceMinceraft(CallbackInfo ci) {
		this.field_17776 = true;
	}
}