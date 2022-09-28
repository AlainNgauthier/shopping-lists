// Generated from br/ufscar/dc/compiladores/shoppinglists/Shopping.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.shoppinglists;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShoppingParser}.
 */
public interface ShoppingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_compras}.
	 * @param ctx the parse tree
	 */
	void enterLista_compras(ShoppingParser.Lista_comprasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_compras}.
	 * @param ctx the parse tree
	 */
	void exitLista_compras(ShoppingParser.Lista_comprasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_bebidas}.
	 * @param ctx the parse tree
	 */
	void enterLista_bebidas(ShoppingParser.Lista_bebidasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_bebidas}.
	 * @param ctx the parse tree
	 */
	void exitLista_bebidas(ShoppingParser.Lista_bebidasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_mercearia}.
	 * @param ctx the parse tree
	 */
	void enterLista_mercearia(ShoppingParser.Lista_merceariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_mercearia}.
	 * @param ctx the parse tree
	 */
	void exitLista_mercearia(ShoppingParser.Lista_merceariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_acougue}.
	 * @param ctx the parse tree
	 */
	void enterLista_acougue(ShoppingParser.Lista_acougueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_acougue}.
	 * @param ctx the parse tree
	 */
	void exitLista_acougue(ShoppingParser.Lista_acougueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_padaria}.
	 * @param ctx the parse tree
	 */
	void enterLista_padaria(ShoppingParser.Lista_padariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_padaria}.
	 * @param ctx the parse tree
	 */
	void exitLista_padaria(ShoppingParser.Lista_padariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_embalagens}.
	 * @param ctx the parse tree
	 */
	void enterLista_embalagens(ShoppingParser.Lista_embalagensContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_embalagens}.
	 * @param ctx the parse tree
	 */
	void exitLista_embalagens(ShoppingParser.Lista_embalagensContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_frio}.
	 * @param ctx the parse tree
	 */
	void enterLista_frio(ShoppingParser.Lista_frioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_frio}.
	 * @param ctx the parse tree
	 */
	void exitLista_frio(ShoppingParser.Lista_frioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#lista_limpeza}.
	 * @param ctx the parse tree
	 */
	void enterLista_limpeza(ShoppingParser.Lista_limpezaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#lista_limpeza}.
	 * @param ctx the parse tree
	 */
	void exitLista_limpeza(ShoppingParser.Lista_limpezaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#total_compra}.
	 * @param ctx the parse tree
	 */
	void enterTotal_compra(ShoppingParser.Total_compraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#total_compra}.
	 * @param ctx the parse tree
	 */
	void exitTotal_compra(ShoppingParser.Total_compraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(ShoppingParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(ShoppingParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(ShoppingParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(ShoppingParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShoppingParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(ShoppingParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShoppingParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(ShoppingParser.ValorContext ctx);
}