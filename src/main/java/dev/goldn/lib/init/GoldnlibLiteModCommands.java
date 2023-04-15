
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dev.goldn.lib.init;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import dev.goldn.lib.command.CmdGMSPCommand;
import dev.goldn.lib.command.CmdGMSCommand;
import dev.goldn.lib.command.CmdGMCCommand;
import dev.goldn.lib.command.CmdGMACommand;

public class GoldnlibLiteModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			CmdGMSCommand.register(dispatcher, commandBuildContext);
			CmdGMCCommand.register(dispatcher, commandBuildContext);
			CmdGMACommand.register(dispatcher, commandBuildContext);
			CmdGMSPCommand.register(dispatcher, commandBuildContext);
		});
	}
}
