package yt.mak.tumkamod.custom.entity;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class TumkaMob extends Monster implements GeoEntity {

    public TumkaMob(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    private final ServerBossEvent bossEvent = (new ServerBossEvent(Component.literal("TUMKA BOSS"), ServerBossEvent.BossBarColor.RED, ServerBossEvent.BossBarOverlay.PROGRESS));

    @Override
    public void startSeenByPlayer(ServerPlayer player) {
        super.startSeenByPlayer(player);
        this.bossEvent.addPlayer(player);
    }
}