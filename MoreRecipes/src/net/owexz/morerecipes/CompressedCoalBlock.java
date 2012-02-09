package net.owexz.morerecipes;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CompressedCoalBlock extends GenericCubeCustomBlock
{
 
    public CompressedCoalBlock(Plugin plugin)
    {
        super(plugin, "CompressedCoal Block", new GenericCubeBlockDesign(plugin, "http://www.owexz.net/uploads/1/4/8/5/1485487/578122832.png", 16));
    }
}