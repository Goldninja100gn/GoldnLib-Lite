package dev.goldn.lib.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Map;
import java.util.HashMap;

import dev.goldn.lib.GoldnlibLiteMod;

public class PcdHealProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GoldnlibLiteMod.LOGGER.warn("Failed to load dependency world for procedure PcdHeal!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GoldnlibLiteMod.LOGGER.warn("Failed to load dependency x for procedure PcdHeal!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GoldnlibLiteMod.LOGGER.warn("Failed to load dependency y for procedure PcdHeal!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GoldnlibLiteMod.LOGGER.warn("Failed to load dependency z for procedure PcdHeal!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GoldnlibLiteMod.LOGGER.warn("Failed to load dependency entity for procedure PcdHeal!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				GoldnlibLiteMod.LOGGER.warn("Failed to load dependency cmdparams for procedure PcdHeal!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").isEmpty()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("effect give " + entity.getDisplayName().getString() + " minecraft:instant_health 1 252 true"));
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("effect give " + (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " minecraft:instant_health 1 252 true"));
		}
	}
}
