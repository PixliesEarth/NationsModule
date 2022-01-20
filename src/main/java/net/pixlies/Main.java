package net.pixlies;

import net.pixlies.modules.Module;

public class Main extends Module {
    public void onLoad() {
        System.out.println("Loaded this successfully");
    }

    public void onDrop() {
        System.out.println("Dropped this successfully");
    }
}
