// Generated from br/ufscar/dc/compiladores/shoppinglists/Shopping.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.shoppinglists;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShoppingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPRAS=1, BEBIDAS=2, MERCEARIA=3, ACOUGUE=4, PADARIA=5, EMBALAGENS=6, 
		FRIO=7, LIMPEZA=8, TOTAL=9, NUM_INT=10, NUM_REAL=11, CADEIA=12, COMENTARIO=13, 
		WS=14, VIRGULA=15, DOISPONTOS=16, ERRO=17;
	public static final int
		RULE_lista_compras = 0, RULE_lista_bebidas = 1, RULE_lista_mercearia = 2, 
		RULE_lista_acougue = 3, RULE_lista_padaria = 4, RULE_lista_embalagens = 5, 
		RULE_lista_frio = 6, RULE_lista_limpeza = 7, RULE_total_compra = 8, RULE_item = 9, 
		RULE_nome = 10, RULE_valor = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"lista_compras", "lista_bebidas", "lista_mercearia", "lista_acougue", 
			"lista_padaria", "lista_embalagens", "lista_frio", "lista_limpeza", "total_compra", 
			"item", "nome", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compras'", "'bebidas'", "'mercearia'", "'a\u00E7ougue'", "'padaria'", 
			"'embalagens'", "'frio'", "'limpeza'", "'total'", null, null, null, null, 
			null, "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMPRAS", "BEBIDAS", "MERCEARIA", "ACOUGUE", "PADARIA", "EMBALAGENS", 
			"FRIO", "LIMPEZA", "TOTAL", "NUM_INT", "NUM_REAL", "CADEIA", "COMENTARIO", 
			"WS", "VIRGULA", "DOISPONTOS", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Shopping.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShoppingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Lista_comprasContext extends ParserRuleContext {
		public TerminalNode COMPRAS() { return getToken(ShoppingParser.COMPRAS, 0); }
		public Lista_bebidasContext lista_bebidas() {
			return getRuleContext(Lista_bebidasContext.class,0);
		}
		public Lista_merceariaContext lista_mercearia() {
			return getRuleContext(Lista_merceariaContext.class,0);
		}
		public Lista_acougueContext lista_acougue() {
			return getRuleContext(Lista_acougueContext.class,0);
		}
		public Lista_padariaContext lista_padaria() {
			return getRuleContext(Lista_padariaContext.class,0);
		}
		public Lista_embalagensContext lista_embalagens() {
			return getRuleContext(Lista_embalagensContext.class,0);
		}
		public Lista_frioContext lista_frio() {
			return getRuleContext(Lista_frioContext.class,0);
		}
		public Lista_limpezaContext lista_limpeza() {
			return getRuleContext(Lista_limpezaContext.class,0);
		}
		public Total_compraContext total_compra() {
			return getRuleContext(Total_compraContext.class,0);
		}
		public Lista_comprasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_compras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_compras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_compras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_compras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_comprasContext lista_compras() throws RecognitionException {
		Lista_comprasContext _localctx = new Lista_comprasContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lista_compras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(COMPRAS);
			setState(25);
			lista_bebidas();
			setState(26);
			lista_mercearia();
			setState(27);
			lista_acougue();
			setState(28);
			lista_padaria();
			setState(29);
			lista_embalagens();
			setState(30);
			lista_frio();
			setState(31);
			lista_limpeza();
			setState(32);
			total_compra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_bebidasContext extends ParserRuleContext {
		public TerminalNode BEBIDAS() { return getToken(ShoppingParser.BEBIDAS, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_bebidasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_bebidas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_bebidas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_bebidas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_bebidas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_bebidasContext lista_bebidas() throws RecognitionException {
		Lista_bebidasContext _localctx = new Lista_bebidasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista_bebidas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(BEBIDAS);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				item();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_merceariaContext extends ParserRuleContext {
		public TerminalNode MERCEARIA() { return getToken(ShoppingParser.MERCEARIA, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_merceariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_mercearia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_mercearia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_mercearia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_mercearia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_merceariaContext lista_mercearia() throws RecognitionException {
		Lista_merceariaContext _localctx = new Lista_merceariaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lista_mercearia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(MERCEARIA);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				item();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_acougueContext extends ParserRuleContext {
		public TerminalNode ACOUGUE() { return getToken(ShoppingParser.ACOUGUE, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_acougueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_acougue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_acougue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_acougue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_acougue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_acougueContext lista_acougue() throws RecognitionException {
		Lista_acougueContext _localctx = new Lista_acougueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_acougue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ACOUGUE);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				item();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_padariaContext extends ParserRuleContext {
		public TerminalNode PADARIA() { return getToken(ShoppingParser.PADARIA, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_padariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_padaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_padaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_padaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_padaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_padariaContext lista_padaria() throws RecognitionException {
		Lista_padariaContext _localctx = new Lista_padariaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_padaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(PADARIA);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				item();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_embalagensContext extends ParserRuleContext {
		public TerminalNode EMBALAGENS() { return getToken(ShoppingParser.EMBALAGENS, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_embalagensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_embalagens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_embalagens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_embalagens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_embalagens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_embalagensContext lista_embalagens() throws RecognitionException {
		Lista_embalagensContext _localctx = new Lista_embalagensContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_embalagens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(EMBALAGENS);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				item();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_frioContext extends ParserRuleContext {
		public TerminalNode FRIO() { return getToken(ShoppingParser.FRIO, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_frioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_frio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_frio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_frio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_frio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_frioContext lista_frio() throws RecognitionException {
		Lista_frioContext _localctx = new Lista_frioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista_frio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FRIO);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				item();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_limpezaContext extends ParserRuleContext {
		public TerminalNode LIMPEZA() { return getToken(ShoppingParser.LIMPEZA, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_limpezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_limpeza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterLista_limpeza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitLista_limpeza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitLista_limpeza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_limpezaContext lista_limpeza() throws RecognitionException {
		Lista_limpezaContext _localctx = new Lista_limpezaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista_limpeza);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LIMPEZA);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				item();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Total_compraContext extends ParserRuleContext {
		public TerminalNode TOTAL() { return getToken(ShoppingParser.TOTAL, 0); }
		public TerminalNode DOISPONTOS() { return getToken(ShoppingParser.DOISPONTOS, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Total_compraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total_compra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterTotal_compra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitTotal_compra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitTotal_compra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Total_compraContext total_compra() throws RecognitionException {
		Total_compraContext _localctx = new Total_compraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_total_compra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(TOTAL);
			setState(77);
			match(DOISPONTOS);
			setState(78);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(ShoppingParser.VIRGULA, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			nome();
			setState(81);
			match(VIRGULA);
			setState(82);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(ShoppingParser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(ShoppingParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(ShoppingParser.NUM_REAL, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShoppingListener ) ((ShoppingListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShoppingVisitor ) return ((ShoppingVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3\'\n"+
		"\3\r\3\16\3(\3\4\3\4\6\4-\n\4\r\4\16\4.\3\5\3\5\6\5\63\n\5\r\5\16\5\64"+
		"\3\6\3\6\6\69\n\6\r\6\16\6:\3\7\3\7\6\7?\n\7\r\7\16\7@\3\b\3\b\6\bE\n"+
		"\b\r\b\16\bF\3\t\3\t\6\tK\n\t\r\t\16\tL\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2"+
		"\f\r\2U\2\32\3\2\2\2\4$\3\2\2\2\6*\3\2\2\2\b\60\3\2\2\2\n\66\3\2\2\2\f"+
		"<\3\2\2\2\16B\3\2\2\2\20H\3\2\2\2\22N\3\2\2\2\24R\3\2\2\2\26V\3\2\2\2"+
		"\30X\3\2\2\2\32\33\7\3\2\2\33\34\5\4\3\2\34\35\5\6\4\2\35\36\5\b\5\2\36"+
		"\37\5\n\6\2\37 \5\f\7\2 !\5\16\b\2!\"\5\20\t\2\"#\5\22\n\2#\3\3\2\2\2"+
		"$&\7\4\2\2%\'\5\24\13\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3"+
		"\2\2\2*,\7\5\2\2+-\5\24\13\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/"+
		"\7\3\2\2\2\60\62\7\6\2\2\61\63\5\24\13\2\62\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\t\3\2\2\2\668\7\7\2\2\679\5\24\13\28\67\3"+
		"\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<>\7\b\2\2=?\5\24\13\2"+
		">=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2BD\7\t\2\2CE\5\24\13"+
		"\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\17\3\2\2\2HJ\7\n\2\2IK\5\24"+
		"\13\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\21\3\2\2\2NO\7\13\2\2O"+
		"P\7\22\2\2PQ\5\30\r\2Q\23\3\2\2\2RS\5\26\f\2ST\7\21\2\2TU\5\30\r\2U\25"+
		"\3\2\2\2VW\7\16\2\2W\27\3\2\2\2XY\t\2\2\2Y\31\3\2\2\2\t(.\64:@FL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}