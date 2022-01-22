package net.pixlies.nations.commands.impl;

import net.pixlies.acf.BaseCommand;
import net.pixlies.acf.CommandHelp;
import net.pixlies.acf.annotation.*;

@CommandAlias("nation|n")
public class NationCommand extends BaseCommand {

    @Default
    @HelpCommand
    public void onHelp(CommandHelp help) {
        help.showHelp();
    }

    @Subcommand("create")
    @Description("Creates a nation")
    @Syntax("<+tag> NAME")
    public void onCreate() {

    }



}
