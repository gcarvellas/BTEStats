package btestats.btestats;

import org.bukkit.plugin.java.JavaPlugin;

public final class BTEStats extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        /* TODO
            1. load config
            2. start API/Router
            3. Start Mongo/MongoConnection
            4. Instantiate DB classes
            5. Instantiate and Register commands

         */

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        /* TODO
           1. close mongo connection
           2. shutdown api
         */
    }
}
