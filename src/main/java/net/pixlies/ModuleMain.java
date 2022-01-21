package net.pixlies;

import net.pixlies.modules.Module;

public class ModuleMain extends Module {

    @Override
    public void onLoad() {
        Main main = new Main();
        main.initialize(main);
        System.out.println("Loaded Nation Module");
    }

    @Override
    public void onDrop() {
        System.out.println("Dropped Nation Module");
    }
}
