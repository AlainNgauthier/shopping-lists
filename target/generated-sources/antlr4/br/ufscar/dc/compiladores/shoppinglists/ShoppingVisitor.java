// Generated from br/ufscar/dc/compiladores/shoppinglists/Shopping.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.shoppinglists;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShoppingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShoppingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_compras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_compras(ShoppingParser.Lista_comprasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_bebidas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_bebidas(ShoppingParser.Lista_bebidasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_mercearia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_mercearia(ShoppingParser.Lista_merceariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_acougue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_acougue(ShoppingParser.Lista_acougueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_padaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_padaria(ShoppingParser.Lista_padariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_embalagens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_embalagens(ShoppingParser.Lista_embalagensContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_frio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_frio(ShoppingParser.Lista_frioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#lista_limpeza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_limpeza(ShoppingParser.Lista_limpezaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#total_compra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotal_compra(ShoppingParser.Total_compraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(ShoppingParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(ShoppingParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShoppingParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(ShoppingParser.ValorContext ctx);
}