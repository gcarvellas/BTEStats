package btestats.btestats.Commands;

import btestats.btestats.Database.Players;
import com.mongodb.client.MongoDatabase;

public class GetPlayerStats {
    /* TODO Implement
    1. Get player object data from Player collection. Returns number of blocks placed and login streaks. Admins should be the only one that can see last login time.
     */

    private Players playerDB;

    public GetPlayerStats(Players playerDB){
        this.playerDB = playerDB;
    }
}
