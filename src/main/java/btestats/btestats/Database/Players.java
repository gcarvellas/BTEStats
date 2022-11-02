package btestats.btestats.Database;

import com.mongodb.client.MongoDatabase;

import java.util.Date;

public class Players {
    /*TODO Implement:
    1. Add block place, remove block place function (increments db object and adds 1)
    1.5 adding blocksPlaced and removed blocksPlaced will first go through a queue, and after ever minute (or the queue gets full), the DB insert will then happen. This is to avoid overloading the DB. Also, add shutdown event to flush queue into DB.
    2. db collection name is "Players", and an object will look like:
    {
        uuid: string,
        blocksPlaced: int,
        lastLogin: Date,
        loginStreak: int,
        hoursPlayed: int
    }
    Note: EVERY DB CALL MUST FIRST GO THROUGH VALIDATION
     */

    private MongoDatabase database;
    public Players(MongoDatabase database){
        this.database=database;
    }

    public void getPlayer(String uuid){

    }


}
