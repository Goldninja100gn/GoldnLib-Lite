
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dev.goldn.lib.init;

import dev.goldn.lib.procedures.PcdHealProcedure;
import dev.goldn.lib.procedures.PcdGMSProcedure;
import dev.goldn.lib.procedures.PcdGMSPProcedure;
import dev.goldn.lib.procedures.PcdGMCProcedure;
import dev.goldn.lib.procedures.PcdGMAProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GoldnlibLiteModProcedures {
	public static void load() {
		new PcdGMCProcedure();
		new PcdGMSProcedure();
		new PcdGMAProcedure();
		new PcdGMSPProcedure();
		new PcdHealProcedure();
	}
}
