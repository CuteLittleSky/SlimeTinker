package io.github.sefiraat.slimetinker.items.tinkermaterials.setup;

import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterial;
import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("SpellCheckingInspection")
public final class TinkersMaterialsInfinity {

    private TinkersMaterialsInfinity() {
        throw new UnsupportedOperationException("Utility Class");
    }

    private static final Map<String, TinkerMaterial> CM_MAP = new HashMap<>();

    private static final TinkerMaterial IE_VOID = new TinkerMaterial(Ids.IE_VOID, SlimefunItem.getById("IE_VOID_INGOT").getItem(), "#5c5756")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE_DEEP)
        .setTraitToolHead(Traits.INFINITY_IE_VOID_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_VOID_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_VOID_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_VOID_LINKS)
        .setFormNugget("IE_VOID_DUST")
        .setFormIngot("IE_VOID_INGOT")
        .setFormBlock(Materials.BLOCK_CAST_IE_VOID.getItemId())
        .build();

    private static final TinkerMaterial IE_MAGSTEEL = new TinkerMaterial(Ids.IE_MAGSTEEL, SlimefunItem.getById("IE_MAGSTEEL").getItem(), "#730000")
        .setLiquidTexture(SkullTextures.ALLOY_BROWN)
        .setTraitToolHead(Traits.INFINITY_IE_MAGSTEEL_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_MAGSTEEL_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_MAGSTEEL_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_MAGSTEEL_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_IE_MAGSTEEL.getItemId())
        .setFormIngot("IE_MAGSTEEL")
        .setFormBlock(Materials.BLOCK_CAST_IE_MAGSTEEL.getItemId())
        .addAlloyRecipe(
            TinkersMaterialsCore.getCmMap().get(Ids.MAGNESIUM).getLiquidItemStack(2),
            TinkersMaterialsCore.getCmMap().get(Ids.STEEL).getLiquidItemStack(1)
        )
        .build();

    private static final TinkerMaterial IE_TITANIUM = new TinkerMaterial(Ids.IE_TITANIUM, SlimefunItem.getById("IE_TITANIUM").getItem(), "#adadad")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IE_TITANIUM_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_TITANIUM_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_TITANIUM_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_TITANIUM_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_IE_TITANIUM.getItemId())
        .setFormIngot("IE_TITANIUM")
        .setFormBlock(Materials.BLOCK_CAST_IE_TITANIUM.getItemId())
        .addAlloyRecipe(
            TinkersMaterialsCore.getCmMap().get(Ids.REINFORCED_ALLOY).getLiquidItemStack(1),
            TinkersMaterialsCore.getCmMap().get(Ids.DAMASCUS_STEEL).getLiquidItemStack(1),
            TinkersMaterialsCore.getCmMap().get(Ids.HARDENED_METAL).getLiquidItemStack(1)
        )
        .build();

    private static final TinkerMaterial IE_IRON_SINGULARITY = new TinkerMaterial(Ids.IE_IRON_SINGULARITY, SlimefunItem.getById("IE_IRON_SINGULARITY").getItem(), "#8c8c8c")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IE_IRON_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_IRON_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_IRON_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_IRON_SINGULARITY_LINKS)
        .setFormBlock("IE_IRON_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_GOLD_SINGULARITY = new TinkerMaterial(Ids.IE_GOLD_SINGULARITY, SlimefunItem.getById("IE_GOLD_SINGULARITY").getItem(), "#ffe138")
        .setLiquidTexture(SkullTextures.ALLOY_TAN)
        .setTraitToolHead(Traits.INFINITY_IE_GOLD_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_GOLD_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_GOLD_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_GOLD_SINGULARITY_LINKS)
        .setFormBlock("IE_GOLD_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_COPPER_SINGULARITY = new TinkerMaterial(Ids.IE_COPPER_SINGULARITY, SlimefunItem.getById("IE_COPPER_SINGULARITY").getItem(), "#c99732")
        .setLiquidTexture(SkullTextures.ALLOY_BROWN)
        .setTraitToolHead(Traits.INFINITY_IE_COPPER_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_COPPER_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_COPPER_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_COPPER_SINGULARITY_LINKS)
        .setFormBlock("IE_COPPER_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_LEAD_SINGULARITY = new TinkerMaterial(Ids.IE_LEAD_SINGULARITY, SlimefunItem.getById("IE_LEAD_SINGULARITY").getItem(), "#9043ba")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE)
        .setTraitToolHead(Traits.INFINITY_IE_LEAD_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_LEAD_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_LEAD_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_LEAD_SINGULARITY_LINKS)
        .setFormBlock("IE_LEAD_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_SILVER_SINGULARITY = new TinkerMaterial(Ids.IE_SILVER_SINGULARITY, SlimefunItem.getById("IE_SILVER_SINGULARITY").getItem(), "#d4d4d4")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IE_SILVER_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_SILVER_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_SILVER_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_SILVER_SINGULARITY_LINKS)
        .setFormBlock("IE_SILVER_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_ALUMINUM_SINGULARITY = new TinkerMaterial(Ids.IE_ALUMINUM_SINGULARITY, SlimefunItem.getById("IE_ALUMINUM_SINGULARITY").getItem(), "#b0b0b0")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IE_ALUMINUM_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_ALUMINUM_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_ALUMINUM_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_ALUMINUM_SINGULARITY_LINKS)
        .setFormBlock("IE_ALUMINUM_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_TIN_SINGULARITY = new TinkerMaterial(Ids.IE_TIN_SINGULARITY, SlimefunItem.getById("IE_TIN_SINGULARITY").getItem(), "#a89b9b")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IE_TIN_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_TIN_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_TIN_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_TIN_SINGULARITY_LINKS)
        .setFormBlock("IE_TIN_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_ZINC_SINGULARITY = new TinkerMaterial(Ids.IE_ZINC_SINGULARITY, SlimefunItem.getById("IE_ZINC_SINGULARITY").getItem(), "#9ba8a6")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IE_ZINC_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_ZINC_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_ZINC_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_ZINC_SINGULARITY_LINKS)
        .setFormBlock("IE_ZINC_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_MAGNESIUM_SINGULARITY = new TinkerMaterial(Ids.IE_MAGNESIUM_SINGULARITY, SlimefunItem.getById("IE_MAGNESIUM_SINGULARITY").getItem(), "#e8cef5")
        .setLiquidTexture(SkullTextures.ALLOY_PINK)
        .setTraitToolHead(Traits.INFINITY_IE_MAGNESIUM_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_MAGNESIUM_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_MAGNESIUM_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_MAGNESIUM_SINGULARITY_LINKS)
        .setFormBlock("IE_MAGNESIUM_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_DIAMOND_SINGULARITY = new TinkerMaterial(Ids.IE_DIAMOND_SINGULARITY, SlimefunItem.getById("IE_DIAMOND_SINGULARITY").getItem(), "#e8cef5")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE)
        .setFormBlock("IE_DIAMOND_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_MYTHRIL = new TinkerMaterial(Ids.IE_MYTHRIL, SlimefunItem.getById("IE_MYTHRIL").getItem(), "#4ebdc7")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.INFINITY_IE_MYTHRIL_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_MYTHRIL_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_MYTHRIL_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_MYTHRIL_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_IE_MYTHRIL.getItemId())
        .setFormIngot("IE_MYTHRIL")
        .setFormBlock(Materials.BLOCK_CAST_IE_MYTHRIL.getItemId())
        .build();

    private static final TinkerMaterial IE_ADAMANTITE = new TinkerMaterial(Ids.IE_ADAMANTITE, SlimefunItem.getById("IE_ADAMANTITE").getItem(), "#c93ec2")
        .setLiquidTexture(SkullTextures.ALLOY_TAN)
        .setTraitToolHead(Traits.INFINITY_IE_ADAMANTITE_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_ADAMANTITE_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_ADAMANTITE_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_ADAMANTITE_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_IE_ADAMANTITE.getItemId())
        .setFormIngot("IE_ADAMANTITE")
        .setFormBlock(Materials.BLOCK_CAST_IE_ADAMANTITE.getItemId())
        .build();

    private static final TinkerMaterial IE_MAGNONIUM = new TinkerMaterial(Ids.IE_MAGNONIUM, SlimefunItem.getById("IE_MAGNONIUM").getItem(), "#4a0446")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE)
        .setTraitToolHead(Traits.INFINITY_IE_MAGNONIUM_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_MAGNONIUM_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_MAGNONIUM_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_MAGNONIUM_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_IE_MAGNONIUM.getItemId())
        .setFormIngot("IE_MAGNONIUM")
        .setFormBlock(Materials.BLOCK_CAST_IE_MAGNONIUM.getItemId())
        .build();

    private static final TinkerMaterial IE_FORTUNE_SINGULARITY = new TinkerMaterial(Ids.IE_FORTUNE_SINGULARITY, SlimefunItem.getById("IE_FORTUNE_SINGULARITY").getItem(), "#f0d541")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE)
        .setTraitToolHead(Traits.INFINITY_IE_FORTUNE_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_FORTUNE_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_FORTUNE_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_FORTUNE_SINGULARITY_LINKS)
        .setFormGem("IE_FORTUNE_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_MAGIC_SINGULARITY = new TinkerMaterial(Ids.IE_MAGIC_SINGULARITY, SlimefunItem.getById("IE_MAGIC_SINGULARITY").getItem(), "#c941e8")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE)
        .setTraitToolHead(Traits.INFINITY_IE_MAGIC_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_MAGIC_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_MAGIC_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_MAGIC_SINGULARITY_LINKS)
        .setFormGem("IE_MAGIC_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_EARTH_SINGULARITY = new TinkerMaterial(Ids.IE_EARTH_SINGULARITY, SlimefunItem.getById("IE_EARTH_SINGULARITY").getItem(), "#44e34f")
        .setLiquidTexture(SkullTextures.ALLOY_GREEN)
        .setTraitToolHead(Traits.INFINITY_IE_EARTH_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_EARTH_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_EARTH_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_EARTH_SINGULARITY_LINKS)
        .setFormGem("IE_EARTH_SINGULARITY")
        .build();

    private static final TinkerMaterial IE_METAL_SINGULARITY = new TinkerMaterial(Ids.IE_METAL_SINGULARITY, SlimefunItem.getById("IE_METAL_SINGULARITY").getItem(), "#5b615b")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IE_METAL_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IE_METAL_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IE_METAL_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_METAL_SINGULARITY_LINKS)
        .setFormGem("IE_METAL_SINGULARITY")
        .build();

    private static final TinkerMaterial INFINITY = new TinkerMaterial(Ids.INFINITY, SlimefunItem.getById("IE_INFINITY_INGOT").getItem(), "#d1ebf0")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.INFINITY_INFINITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_INFINITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_INFINITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_INFINITY_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_INFINITY.getItemId())
        .setFormIngot("IE_INFINITY_INGOT")
        .setFormBlock(Materials.BLOCK_CAST_INFINITY.getItemId())
        .build();

    private static final TinkerMaterial IE_INFINITY_SINGULARITY = new TinkerMaterial(Ids.IE_INFINITY_SINGULARITY, SlimefunItem.getById("IE_INFINITY_SINGULARITY").getItem(), "#e8cef5")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.INFINITY_IE_INFINITY_SINGULARITY_HEAD)
        .setTraitArmorPlates(Traits.INFINITY_IE_INFINITY_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IE_INFINITY_SINGULARITY_LINKS)
        .setFormBlock("IE_INFINITY_SINGULARITY")
        .build();

    private static final TinkerMaterial REINFORCED_DRACONIUM = new TinkerMaterial(Ids.REINFORCED_DRACONIUM, Materials.INGOT_CAST_REINFORCED_DRACONIUM, "#9532a8")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE_DEEP)
        .setTraitToolHead(Traits.INFINITY_REINFORCED_DRACONIUM_HEAD)
        .setFormNugget(Materials.NUGGET_CAST_REINFORCED_DRACONIUM.getItemId())
        .setFormIngot(Materials.INGOT_CAST_REINFORCED_DRACONIUM.getItemId())
        .setFormBlock(Materials.BLOCK_CAST_REINFORCED_DRACONIUM.getItemId())
        .addAlloyRecipe(
            TinkersMaterialsCore.getCmMap().get(Ids.COBALT).getLiquidItemStack(1),
            TinkersMaterialsCore.getCmMap().get(Ids.DRACONIC).getLiquidItemStack(2),
            IE_MYTHRIL.getLiquidItemStack(2)
        )
        .build();

    static {
        CM_MAP.put(Ids.IE_VOID, IE_VOID);
        CM_MAP.put(Ids.IE_MAGSTEEL, IE_MAGSTEEL);
        CM_MAP.put(Ids.IE_TITANIUM, IE_TITANIUM);
        CM_MAP.put(Ids.IE_IRON_SINGULARITY, IE_IRON_SINGULARITY);
        CM_MAP.put(Ids.IE_GOLD_SINGULARITY, IE_GOLD_SINGULARITY);
        CM_MAP.put(Ids.IE_COPPER_SINGULARITY, IE_COPPER_SINGULARITY);
        CM_MAP.put(Ids.IE_LEAD_SINGULARITY, IE_LEAD_SINGULARITY);
        CM_MAP.put(Ids.IE_SILVER_SINGULARITY, IE_SILVER_SINGULARITY);
        CM_MAP.put(Ids.IE_ALUMINUM_SINGULARITY, IE_ALUMINUM_SINGULARITY);
        CM_MAP.put(Ids.IE_TIN_SINGULARITY, IE_TIN_SINGULARITY);
        CM_MAP.put(Ids.IE_ZINC_SINGULARITY, IE_ZINC_SINGULARITY);
        CM_MAP.put(Ids.IE_MAGNESIUM_SINGULARITY, IE_MAGNESIUM_SINGULARITY);
        CM_MAP.put(Ids.IE_DIAMOND_SINGULARITY, IE_DIAMOND_SINGULARITY);
        CM_MAP.put(Ids.IE_MYTHRIL, IE_MYTHRIL);
        CM_MAP.put(Ids.IE_ADAMANTITE, IE_ADAMANTITE);
        CM_MAP.put(Ids.IE_MAGNONIUM, IE_MAGNONIUM);
        CM_MAP.put(Ids.IE_FORTUNE_SINGULARITY, IE_FORTUNE_SINGULARITY);
        CM_MAP.put(Ids.IE_MAGIC_SINGULARITY, IE_MAGIC_SINGULARITY);
        CM_MAP.put(Ids.IE_EARTH_SINGULARITY, IE_EARTH_SINGULARITY);
        CM_MAP.put(Ids.IE_METAL_SINGULARITY, IE_METAL_SINGULARITY);
        CM_MAP.put(Ids.INFINITY, INFINITY);
        CM_MAP.put(Ids.IE_INFINITY_SINGULARITY, IE_INFINITY_SINGULARITY);
        CM_MAP.put(Ids.REINFORCED_DRACONIUM, REINFORCED_DRACONIUM);
    }

    public static Map<String, TinkerMaterial> getCmMap() {
        return CM_MAP;
    }
}
