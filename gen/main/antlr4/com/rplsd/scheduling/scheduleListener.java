// Generated from /Users/mico/RPLSD/src/main/antlr4/com/rplsd/scheduling/schedule.g4 by ANTLR 4.7
package main.antlr4.com.rplsd.scheduling;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scheduleParser}.
 */
public interface scheduleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(scheduleParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(scheduleParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link scheduleParser#kelas}.
	 * @param ctx the parse tree
	 */
	void enterKelas(scheduleParser.KelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#kelas}.
	 * @param ctx the parse tree
	 */
	void exitKelas(scheduleParser.KelasContext ctx);
	/**
	 * Enter a parse tree produced by {@link scheduleParser#matkul}.
	 * @param ctx the parse tree
	 */
	void enterMatkul(scheduleParser.MatkulContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#matkul}.
	 * @param ctx the parse tree
	 */
	void exitMatkul(scheduleParser.MatkulContext ctx);
	/**
	 * Enter a parse tree produced by {@link scheduleParser#fitur}.
	 * @param ctx the parse tree
	 */
	void enterFitur(scheduleParser.FiturContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#fitur}.
	 * @param ctx the parse tree
	 */
	void exitFitur(scheduleParser.FiturContext ctx);
	/**
	 * Enter a parse tree produced by {@link scheduleParser#configuration}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration(scheduleParser.ConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#configuration}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration(scheduleParser.ConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link scheduleParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(scheduleParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(scheduleParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link scheduleParser#availibility}.
	 * @param ctx the parse tree
	 */
	void enterAvailibility(scheduleParser.AvailibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#availibility}.
	 * @param ctx the parse tree
	 */
	void exitAvailibility(scheduleParser.AvailibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link scheduleParser#constrain}.
	 * @param ctx the parse tree
	 */
	void enterConstrain(scheduleParser.ConstrainContext ctx);
	/**
	 * Exit a parse tree produced by {@link scheduleParser#constrain}.
	 * @param ctx the parse tree
	 */
	void exitConstrain(scheduleParser.ConstrainContext ctx);
}