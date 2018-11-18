// Generated from /Users/mico/RPLSD/src/main/antlr4/com/rplsd/scheduling/schedule.g4 by ANTLR 4.7
package main.antlr4.com.rplsd.scheduling;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scheduleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scheduleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scheduleParser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(scheduleParser.ScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link scheduleParser#kelas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKelas(scheduleParser.KelasContext ctx);
	/**
	 * Visit a parse tree produced by {@link scheduleParser#matkul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatkul(scheduleParser.MatkulContext ctx);
	/**
	 * Visit a parse tree produced by {@link scheduleParser#fitur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFitur(scheduleParser.FiturContext ctx);
	/**
	 * Visit a parse tree produced by {@link scheduleParser#configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration(scheduleParser.ConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link scheduleParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(scheduleParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link scheduleParser#availibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailibility(scheduleParser.AvailibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link scheduleParser#constrain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrain(scheduleParser.ConstrainContext ctx);
}