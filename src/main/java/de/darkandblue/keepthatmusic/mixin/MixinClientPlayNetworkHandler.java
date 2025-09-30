package de.darkandblue.keepthatmusic.mixin;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.sound.MusicTracker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientPlayNetworkHandler.class)
public class MixinClientPlayNetworkHandler {
	@Redirect(method="onPlayerRespawn",at= @At(value = "INVOKE", target = "Lnet/minecraft/client/sound/MusicTracker;stop()V"))
	public void onPlayerRespawn(MusicTracker instance) {

	}
}
