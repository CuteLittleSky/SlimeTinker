package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.Ids;

import java.util.HashMap;
import java.util.Map;

/**
 * 包含大部分 {@link Ids} 对应的中文
 */
public class IdMap {

    private IdMap() {
        throw new IllegalStateException("Utility class");
    }

    private static final Map<String, String> idMap = new HashMap<>();

    static {
        // Vanilla + Core Sf
        idMap.put(Ids.IRON, "铁");
        idMap.put(Ids.GOLD, "金");
        idMap.put(Ids.COPPER, "铜");
        idMap.put(Ids.SILVER, "银");
        idMap.put(Ids.TIN, "锡");
        idMap.put(Ids.MAGNESIUM, "镁");
        idMap.put(Ids.ALUMINUM, "铝");
        idMap.put(Ids.LEAD, "铅");
        idMap.put(Ids.ZINC, "锌");
        idMap.put(Ids.COAL, "煤");
        idMap.put(Ids.STEEL, "钢");
        idMap.put(Ids.DAMASCUS_STEEL, "大马士革钢");
        idMap.put(Ids.DURALUMIN, "硬铝");
        idMap.put(Ids.BRONZE, "青铜");
        idMap.put(Ids.ALUMINUM_BRONZE, "铝青铜");
        idMap.put(Ids.HARDENED_METAL, "硬化金属");
        idMap.put(Ids.CORINTHIAN_BRONZE, "科林斯青铜");
        idMap.put(Ids.SOLDER, "焊锡");
        idMap.put(Ids.BILLON, "银铜合金");
        idMap.put(Ids.BRASS, "黄铜");
        idMap.put(Ids.ALUMINUM_BRASS, "铝黄铜");
        idMap.put(Ids.NICKEL, "镍");
        idMap.put(Ids.COBALT, "钴");
        idMap.put(Ids.REINFORCED_ALLOY, "强化合金");
        idMap.put(Ids.STRING, "线");
        idMap.put(Ids.VINE, "藤蔓");
        idMap.put(Ids.CRIMSON_ROOTS, "绯红菌索");
        idMap.put(Ids.WARPED_ROOTS, "诡异菌索");
        idMap.put(Ids.WEEPING_VINES, "垂泪藤");
        idMap.put(Ids.TWISTING_VINES, "缠怨藤");
        idMap.put(Ids.SLIME, "粘液");
        idMap.put(Ids.LEATHER, "皮革");
        idMap.put(Ids.DIAMOND, "钻石");
        idMap.put(Ids.REDSTONE, "红石");
        idMap.put(Ids.REDSTONE_ALLOY, "红石合金");
        idMap.put(Ids.SILICON, "硅");
        idMap.put(Ids.FERROSILICON, "硅铁");
        idMap.put(Ids.BOOMERITE, "Boomer合金");
        idMap.put(Ids.SEFIRITE, "Sefi合金");
        idMap.put(Ids.LIQUID_CHRISTMAS, "圣诞礼物");
        idMap.put(Ids.CRINGLEIUM, "圣诞合金");
        idMap.put(Ids.FLOWING_FONDNESS, "喜爱");
        idMap.put(Ids.DETAILED_DEVOTION, "深爱");
        idMap.put(Ids.PURIFIED_PASSION, "热情");
        idMap.put(Ids.LIQUID_LOVE, "爱");
        idMap.put(Ids.NICEINIUM, "Nice");
        idMap.put(Ids.DRACONIC, "龙息");
        idMap.put(Ids.REINFORCED_DRACONIUM, "强化龙");

        // Mods
        idMap.put("QUARTZ", "石英");
        idMap.put("LAPIS_LAZULI", "青金石");
        idMap.put("MOD_PLATE", "强化合金板");
        idMap.put("EMERALD", "绿宝石");

        // Infinity Expansion (SlimefunGuguProject)
        idMap.put(Ids.IE_VOID, "虚空");
        idMap.put(Ids.INFINITY, "无尽");
        idMap.put(Ids.IE_FORTUNE_SINGULARITY, "时运奇点");
        idMap.put(Ids.IE_MAGIC_SINGULARITY, "魔法奇点");
        idMap.put(Ids.IE_EARTH_SINGULARITY, "地球奇点");
        idMap.put(Ids.IE_METAL_SINGULARITY, "金属奇点");
        idMap.put(Ids.IE_MAGSTEEL, "磁钢");
        idMap.put(Ids.IE_TITANIUM, "钛");
        idMap.put(Ids.IE_MYTHRIL, "秘银");
        idMap.put(Ids.IE_ADAMANTITE, "精金");
        idMap.put(Ids.IE_MAGNONIUM, "磁金");
        idMap.put(Ids.IE_COPPER_SINGULARITY, "铜奇点");
        idMap.put(Ids.IE_ZINC_SINGULARITY, "锌奇点");
        idMap.put(Ids.IE_TIN_SINGULARITY, "锡奇点");
        idMap.put(Ids.IE_ALUMINUM_SINGULARITY, "铝奇点");
        idMap.put(Ids.IE_SILVER_SINGULARITY, "银奇点");
        idMap.put(Ids.IE_MAGNESIUM_SINGULARITY, "镁奇点");
        idMap.put(Ids.IE_LEAD_SINGULARITY, "铅奇点");
        idMap.put(Ids.IE_GOLD_SINGULARITY, "金奇点");
        idMap.put(Ids.IE_IRON_SINGULARITY, "铁奇点");
        idMap.put(Ids.IE_DIAMOND_SINGULARITY, "钻石奇点");
        idMap.put(Ids.IE_INFINITY_SINGULARITY, "无尽奇点");

        // Slimefun Warfare
        idMap.put(Ids.SLIMESTEEL, "软钢");
        idMap.put(Ids.REINFORCED_SLIMESTEEL, "强化软钢");
        idMap.put(Ids.OSMIUM_SUPERALLOY, "锇高温合金");
        idMap.put(Ids.OSMIUM, "锇");
        idMap.put(Ids.SEGGANESSON, "塞格尼森");
        idMap.put(Ids.UNPATENTABLIUM, "非专利品");

        // LiteXpansion
        idMap.put(Ids.RUBBER, "橡胶");
        idMap.put(Ids.REFINED_IRON, "精炼铁");
        idMap.put(Ids.MIXED_METAL, "合金");
        idMap.put(Ids.ADVANCED_ALLOY, "高级合金");
        idMap.put(Ids.THORIUM, "钍");
        idMap.put(Ids.MAG_THOR, "镁钍合金");
        idMap.put(Ids.CARBON_MESH, "粗制碳板");
        idMap.put(Ids.SCRAP, "废料");
        idMap.put(Ids.IRIDIUM, "铱");

        // TranscEndence
        idMap.put(Ids.DAXI_STRENGTH, "超能力核心(S)");
        idMap.put(Ids.DAXI_ABSORPTION, "超能力核心(A)");
        idMap.put(Ids.DAXI_FORTITUDE, "超能力核心(F)");
        idMap.put(Ids.DAXI_SATURATION, "超能力核心(H)");
        idMap.put(Ids.DAXI_REGENERATION, "超能力核心(R)");

        // Networks
        idMap.put(Ids.MOLTEN_PRESENCE, "跨越维度的存在");
        idMap.put(Ids.REMOTININIUM, "古代远程访问");
        idMap.put(Ids.ULTIMANINIUM, "终极远程访问");
    }

    public static Map<String, String> getMap() {
        return idMap;
    }
}
