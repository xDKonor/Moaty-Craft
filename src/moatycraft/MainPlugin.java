package moatycraft;

import moatycraft.commands.ItemCommand;
import moatycraft.generators.FlatGenerator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new FlatGenerator();
    }

    @Override
    public void onDisable() {
        System.out.println(this + " is Disabled!");
    }

    @Override
    public void onEnable() {
        getCommand("item").setExecutor(new ItemCommand());
        System.out.println(this + " is Enabled!");
    }
}