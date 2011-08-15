package moatycraft.generators;

import java.util.Random;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class FlatGenerator extends ChunkGenerator {

    @Override
    public boolean canSpawn(World world, int x, int z) {
        return true;
    }

    @Override
    public byte[] generate(World world, Random random, int x, int z) {
        byte[] result = new byte[32768];
        for (int z1 = 0; z1 < 16; z1++) {
            for (int x1 = 0; x1 < 16; x1++) {
                for (int y1 = 0; y1 < 128; y1++) {
                    if (y1 == 0) {
                        result[(x1 * 16 + z1) * 128 + y1] = (byte) Material.BEDROCK.getId();
                    }
                    if (y1 > 0 && y1 < 64) {
                        result[(x1 * 16 + z1) * 128 + y1] = (byte) Material.STONE.getId();
                    }
                    if (y1 == 64) {
                        result[(x1 * 16 + z1) * 128 + y1] = (byte) Material.GRASS.getId();
                    }
                }
            }
        }
        return result;
    }
}