package io.github.sefiraat.slimetinker.managers;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

@SuppressWarnings("SpellCheckingInspection")
public final class SupportedPluginsManager {

    private SupportedPluginsManager() {
        throw new IllegalStateException("Utility class");
    }

    public static final boolean INFINITY_EXPANSION;
    public static final boolean SLIMEFUN_WARFARE;
    public static final boolean LITEXPANSION;
    public static final boolean TRANSCENDENCE;
    public static final boolean NETWORKS;

    public static Plugin TRANSCENDENCE_PLUGIN;

    public static final String CORE_NOTE = ThemeUtils.MAIN + "粘液匠魂(SlimeTinker)";
    public static final String INFINITY_EXPANSION_NOTE = ThemeUtils.ADD_INFINITY + "无尽科技2(InfinityExpansion2)";
    public static final String SLIMEFUN_WARFARE_NOTE = ThemeUtils.ADD_SLIMEFUN_WARFARE + "战争工艺(SlimefunWarfare)";
    public static final String LITEXPANSION_NOTE = ThemeUtils.ADD_LITEXPANSION + "工业(LiteXpansion)";
    public static final String TRANSCENDENCE_NOTE = ThemeUtils.ADD_TRANSCENDENCE + "末地科技(TranscEndence)";
    public static final String NETWORKS_NOTE = ThemeUtils.ADD_NETWORKS + "网络(Networks)";

    static {
        PluginManager pluginManager = SlimeTinker.getInstance().getServer().getPluginManager();
        INFINITY_EXPANSION = pluginManager.isPluginEnabled("InfinityExpansion2");
        SLIMEFUN_WARFARE = pluginManager.isPluginEnabled("SlimefunWarfare");
        LITEXPANSION = pluginManager.isPluginEnabled("LiteXpansion");
        TRANSCENDENCE = pluginManager.isPluginEnabled("TranscEndence");
        NETWORKS = pluginManager.isPluginEnabled("Networks");

        if (TRANSCENDENCE) {
            TRANSCENDENCE_PLUGIN = pluginManager.getPlugin("TranscEndence");
        }
    }

    public static boolean isInfinityExpansion() {
        return INFINITY_EXPANSION;
    }

    public static boolean isSlimefunWarfare() {
        return SLIMEFUN_WARFARE;
    }

    public static boolean isLitexpansion() {
        return LITEXPANSION;
    }

    public static boolean isTranscendence() {
        return TRANSCENDENCE;
    }

    public static boolean isNetworks() {
        return NETWORKS;
    }
}
