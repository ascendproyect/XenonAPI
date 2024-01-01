package net.ascend.core.api;

import net.ascend.core.bukkit.profile.Profile;
import net.ascend.core.bukkit.profile.notifications.Notification;
import net.ascend.core.bukkit.profile.squads.Squad;
import net.ascend.core.bukkit.punishment.Punishment;
import net.ascend.core.bukkit.rank.grant.Grant;
import net.ascend.core.bukkit.rank.rank.Rank;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

public class XenonAPI {

    public static XenonAPI INSTANCE;

    public Profile getProfile(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public String getTag(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isStaffChat(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isAdminChat(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public Rank getRank(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public List<Grant> getActiveGrants(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public List<Grant> getAllGrants(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isMuted(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isBanned(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isBlacklisted(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public List<Punishment> getActivePunishments(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isProfileDiscordSynced(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public String getProfileDiscordUserID(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public String getProfileDiscordName(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isProfileOnline(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public Squad getSquad(String squad_name) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public boolean isInSquad(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public String getSquadName(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public String getSquadRank(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public int getSquadOnline(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public int getSquadMembers(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }

    public List<Notification> getNotifications(UUID uuid) {
        throw new IllegalPluginAccessException("XenonAPI was not found");
    }
}

