package fr.gcjojo.littlemod.biomes;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class BiomeRegistry {

    private static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> LMPlains_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.GRASS_BLOCK.getDefaultState(),
                    Blocks.DIRT.getDefaultState(),
                    Blocks.GRAVEL.getDefaultState()));

    private static final Biome LMPlains = createLMPlains();

    public static final RegistryKey<Biome> LMPlains_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("lm", "plains"));

    private static Biome createLMPlains() {
        // We specify what entities spawn and what features generate in the biome.
        // Aside from some structures, trees, rocks, plants and
        // custom entities, these are mostly the same for each biome.
        // Vanilla configured features for biomes are defined in DefaultBiomeFeatures.

        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(LMPlains_SURFACE_BUILDER);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.NONE)
                .depth(0.125F)
                .scale(0.05F)
                .temperature(0.9F)
                .downfall(0.9F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x8C76E4)
                        .waterFogColor(0x3A0533)
                        .fogColor(0x7CAEBA)
                        .skyColor(0x77AD93)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }

    public static void RegisterBiomes()
    {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("lm", "plains"), LMPlains_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, LMPlains_KEY.getValue(), LMPlains);


        OverworldBiomes.addContinentalBiome(LMPlains_KEY, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(LMPlains_KEY, OverworldClimate.COOL, 2D);
    }

}
