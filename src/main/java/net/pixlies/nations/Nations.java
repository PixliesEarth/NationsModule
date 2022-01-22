package net.pixlies.nations;

import net.pixlies.modules.Module;
import net.pixlies.nations.commands.CommandManager;
import net.pixlies.nations.events.ListenerManager;
import net.pixlies.nations.handlers.HandlerManager;
import net.pixlies.nations.handlers.RegisterHandlerManager;

public class Nations extends Module {

    private static Nations instance;
    private HandlerManager handlerManager;

    @Override
    public void onLoad() {
        instance = this;
        handlerManager = new HandlerManager();
        new RegisterHandlerManager().registerAllHandlers();
        new ListenerManager().registerAllListeners();
        new CommandManager().registerAllCommands();
    }

    @Override
    public void onDrop() {
        instance = null;
        handlerManager = null;
    }

    public HandlerManager getHandlerManager() {
        return handlerManager;
    }

    public static Nations getNationsInstance() {
        return instance;
    }

}
