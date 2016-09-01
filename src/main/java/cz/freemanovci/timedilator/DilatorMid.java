package cz.freemanovci.timedilator;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DilatorMid extends BlockContainer{

	protected DilatorMid() {
		super(Material.iron);
		this.setBlockName("time_dilator_mid");
		this.setCreativeTab(CreativeTabs.tabRedstone);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new DilatorTE(3,8,0);
	}

}
