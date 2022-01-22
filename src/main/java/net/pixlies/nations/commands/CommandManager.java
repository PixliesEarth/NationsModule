package net.pixlies.nations.commands;

import com.google.common.collect.ImmutableList;
import net.pixlies.Main;
import net.pixlies.acf.BaseCommand;
import net.pixlies.nations.commands.impl.NationCommand;

public class CommandManager {

    private final ImmutableList<BaseCommand> commands = ImmutableList.of(
            // NATIONS
            new NationCommand()
    );

    public void registerAllCommands() {
        commands.forEach(command -> Main.getInstance().getCommandManager().register(command));
    }

}
