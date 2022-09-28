package br.ufscar.dc.compiladores.shoppinglists;

import org.antlr.v4.runtime.Token;
import br.ufscar.dc.compiladores.shoppinglists.TabelaDeSimbolos;

/**
 *
 * @author alain.djamba
 */

public class ShoppingSemantico extends ShoppingBaseVisitor<Void> {
    
    Escopos escopo = new Escopos();
    
    /* Verifica se já existe um item com o nome no escopo */
    @Override
    public Void visitNome(ShoppingParser.NomeContext ctx) {
        TabelaDeSimbolos escopoAtual = escopo.obterEscopoAtual();
        
        if(!escopoAtual.existe(ctx.getText())){
            escopoAtual.inserir(ctx.getText());
        } else {
            String mensagem = String.format("Item %s já existe na lista de compras", ctx.getText());
            ShoppingSemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        return null;
    }
    
    /* Verifica se valor é do tipo inteiro ou real */
    @Override
    public Void visitItem(ShoppingParser.ItemContext ctx) {
        if(ctx.valor().NUM_INT() == null && ctx.valor().NUM_REAL() == null){
            String mensagem = String.format("Item não é do tipo inteiro ou real");
            ShoppingSemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        return super.visitItem(ctx);
    }
    
}
