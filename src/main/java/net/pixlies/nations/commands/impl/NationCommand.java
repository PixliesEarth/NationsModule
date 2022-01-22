package net.pixlies.nations.commands.impl;

import net.pixlies.acf.BaseCommand;
import net.pixlies.acf.CommandHelp;
import net.pixlies.acf.annotation.CommandAlias;
import net.pixlies.acf.annotation.Default;
import net.pixlies.acf.annotation.HelpCommand;

@CommandAlias("nation|nations|n|faction|factions|f|country|countries")
public class NationCommand extends BaseCommand {

    @Default
    @HelpCommand
    public void onHelp(CommandHelp help) {
        help.showHelp();
    }

}
