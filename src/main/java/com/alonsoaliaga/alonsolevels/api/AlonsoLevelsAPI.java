package com.alonsoaliaga.alonsolevels.api;

import net.zerotoil.dev.cyberlevels.CyberLevels;
import org.bukkit.Bukkit;

import java.util.UUID;

public class AlonsoLevelsAPI {
    public static void addExperience(UUID uuid , long exp) {
        // Add experience to a player
        CyberLevels.instance.levelCache().playerLevels().get(Bukkit.getPlayer(uuid)).addExp((double)exp, CyberLevels.instance.levelCache().doCommandMultiplier());
    }
}
