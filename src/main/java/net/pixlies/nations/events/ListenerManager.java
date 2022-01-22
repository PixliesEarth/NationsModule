package net.pixlies.nations.events;

import com.google.common.collect.ImmutableList;
import net.pixlies.Main;
import org.bukkit.event.Listener;

public class ListenerManager {

    private static final Main instance = Main.getInstance();

    private final ImmutableList<Listener> listeners = ImmutableList.of(
            // ADD LISTENERS
    );

    public void registerAllListeners() {
        listeners.forEach(listener -> instance.getServer().getPluginManager().registerEvents(listener, instance));
    }

}
