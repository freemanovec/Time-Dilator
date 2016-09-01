package cz.freemanovci.timedilator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="timedilator", version="0.0.1")
public class Main {
	@EventHandler
	public void init(FMLInitializationEvent event){
		//GameRegistry.registerBlock(new DilatorMid(), "time_dilator_mid");
		
		GameRegistry.registerBlock(new DilatorBlockBase(1,8,0,"time_dilator_slow"), "time_dilator_slow");
		GameRegistry.registerBlock(new DilatorBlockBase(3,8,0,"time_dilator_mid"), "time_dilator_mid");
		GameRegistry.registerBlock(new DilatorBlockBase(10,8,0,"time_dilator_fast"), "time_dilator_fast");
		
		GameRegistry.registerBlock(new DilatorBlockBase(1,8,5,"time_dilator_slow_tall"), "time_dilator_slow_tall");
		GameRegistry.registerBlock(new DilatorBlockBase(3,8,5,"time_dilator_mid_tall"), "time_dilator_mid_tall");
		GameRegistry.registerBlock(new DilatorBlockBase(10,8,5,"time_dilator_fast_tall"), "time_dilator_fast_tall");
		
		GameRegistry.registerTileEntity(DilatorTE.class, "time_dilator_te");
	}
}
