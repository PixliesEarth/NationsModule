package net.pixlies;

import com.mongodb.client.MongoCollection;
import lombok.Getter;
import org.bson.Document;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static @Getter Main instance;
    private static @Getter MongoCollection<Document> nationCollection;

    public void initialize(Main main) {
        instance = main;

    }
}
