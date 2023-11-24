
package dev.goldn.lib.command;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandBuildContext;

import dev.goldn.lib.procedures.PcdGMCProcedure;
import dev.goldn.lib.procedures.PcdGMCOtherProcedure;

import com.mojang.brigadier.CommandDispatcher;

public class CmdGMCCommand {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext) {
		dispatcher.register(Commands.literal("gmc")

				.then(Commands.argument("username", EntityArgument.player()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					Direction direction = entity.getDirection();

					PcdGMCOtherProcedure.execute(world, x, y, z, arguments);
					return 0;
				})).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					Direction direction = entity.getDirection();

					PcdGMCProcedure.execute(world, x, y, z, entity);
					return 0;
				}));
	}
}
