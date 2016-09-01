package cz.freemanovci.timedilator;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;

public class DilatorTE extends TileEntity{
	
	private int speed, range, rangeY;
	
	protected DilatorTE(int speed, int range, int rangeY){
		System.out.println("Accepted speed " + speed);
		this.speed = speed;
		this.range = range;
		this.rangeY = rangeY;
	}
	@Override
	public void updateEntity(){
		for(int x = -range; x <= range; x++){
			for(int z = -range; z <= range; z++){
				for(int y = -rangeY; y <= rangeY; y++){
					int searchX = (x+xCoord);
					int searchY = (y+yCoord);
					int searchZ = (z+zCoord);
					Block foundBlock = worldObj.getBlock(searchX, searchY, searchZ);
					foundBlock.updateTick(worldObj, searchX, searchY, searchZ, worldObj.rand);
					TileEntity found = worldObj.getTileEntity(searchX, searchY, searchZ);
					if(found != null && found.canUpdate() && found.getClass() != this.getClass() && !found.isInvalid()){
						for(int s = 0; s < speed; s++){
							found.updateEntity();
						}
					}
				}
			}
		}
	}
	
}
