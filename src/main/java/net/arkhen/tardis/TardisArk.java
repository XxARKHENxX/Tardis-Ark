package net.arkhen.tardis;
//MAIN

import net.arkhen.tardis.block.ModBlocks;
import net.arkhen.tardis.item.ModItemGroups;
import net.arkhen.tardis.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TardisArk implements ModInitializer {
	public static final String MOD_ID = "tardis-ark"; //Se der erro é pelo - trocar por _

	// Este logger é usado para escrever texto no console e no arquivo de log.
	// É considerado uma prática recomendada usar seu ID de mod como o nome do logger.
	// Dessa forma, fica claro qual mod escreveu informações, avisos e erros.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Este código é executado assim que o Minecraft estiver em um estado pronto para mod-load.
		// No entanto, algumas coisas (como recursos) ainda podem não ser inicializadas.
		// Prossiga com cautela moderada.

		TardisArk.LOGGER.info("INICIANDO REGISTROS DO MOD " + TardisArk.MOD_ID);

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		LOGGER.info("TADIS OPERACIONAL!");
	}
}	