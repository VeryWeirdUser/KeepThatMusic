package de.darkandblue.keepthatmusic.interfaces;

import net.minecraft.client.sound.Channel;
import net.minecraft.client.sound.SoundInstance;

public interface IMixinSoundSystem {
	Channel.SourceManager keepThatMusic$sourceManagerBySoundInstance(SoundInstance soundInstance);
}
