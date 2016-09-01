package cz.freemanovci.timedilator;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DilatorBlockBase extends BlockContainer{
	
	int speed, range, rangeY;
	
	protected DilatorBlockBase(int speed, int range, int rangeY, String name){
		super(Material.iron);
		this.setBlockName(name);
		this.setBlockTextureName(("timedilator:"+name));
		this.setCreativeTab(CreativeTabs.tabRedstone);
		this.speed = speed;
		this.range = range;
		this.rangeY = rangeY;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta){
		System.out.println("Passing speed " + speed);
		return new DilatorTE(speed,range,rangeY);
	}
}
