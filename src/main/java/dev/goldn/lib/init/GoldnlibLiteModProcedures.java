
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dev.goldn.lib.init;

import dev.goldn.lib.procedures.PcdHealProcedure;
import dev.goldn.lib.procedures.PcdHealOtherProcedure;
import dev.goldn.lib.procedures.PcdGMSProcedure;
import dev.goldn.lib.procedures.PcdGMSPProcedure;
import dev.goldn.lib.procedures.PcdGMSPOtherProcedure;
import dev.goldn.lib.procedures.PcdGMSOtherProcedure;
import dev.goldn.lib.procedures.PcdGMCProcedure;
import dev.goldn.lib.procedures.PcdGMCOtherProcedure;
import dev.goldn.lib.procedures.PcdGMAProcedure;
import dev.goldn.lib.procedures.PcdGMAOtherProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GoldnlibLiteModProcedures {
	public static void load() {
		new PcdGMCProcedure();
		new PcdGMSProcedure();
		new PcdGMAProcedure();
		new PcdGMSPProcedure();
		new PcdHealProcedure();
		new PcdHealOtherProcedure();
		new PcdGMSOtherProcedure();
		new PcdGMCOtherProcedure();
		new PcdGMAOtherProcedure();
		new PcdGMSPOtherProcedure();
	}
}
