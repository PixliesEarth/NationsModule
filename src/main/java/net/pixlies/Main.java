package net.pixlies;

import net.pixlies.modules.Module;

public class Main extends Module {

    @Override
    public void onLoad() {
        System.out.println("Loaded Nation Module");
    }

    @Override
    public void onDrop() {
        System.out.println("Dropped Nation Module");
    }
}
