package gloridifice.watersource.common.block;

import net.minecraft.world.level.block.DoorBlock;

public class CoconutTreeDoorBlock extends DoorBlock {
    public CoconutTreeDoorBlock(String name, Properties builder) {
        super(builder);
        this.setRegistryName(name);
    }
}
