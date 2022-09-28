package br.ufscar.dc.compiladores.shoppinglists;

/**
 *
 * @author alain.djamba
 */

public class GeradorPDF extends ShoppingBaseVisitor<Void> {
    
    public static StringBuilder pdf = new StringBuilder();
    TabelaDeSimbolos tds = new TabelaDeSimbolos();
    
    @Override
    public Void visitLista_compras(ShoppingParser.Lista_comprasContext ctx) {
        pdf.append("Lista de Compras").append("\n").append("\n");
        
        visitLista_bebidas(ctx.lista_bebidas());
        visitLista_mercearia(ctx.lista_mercearia());
        visitLista_acougue(ctx.lista_acougue());
        visitLista_padaria(ctx.lista_padaria());
        visitLista_embalagens(ctx.lista_embalagens());
        visitLista_frio(ctx.lista_frio());
        visitLista_limpeza(ctx.lista_limpeza());
        visitTotal_compra(ctx.total_compra());
        
        return null; 
    }
    
    @Override
    public Void visitLista_bebidas(ShoppingParser.Lista_bebidasContext ctx) {
        pdf.append("Bebidas:").append("\n");
        ctx.item().forEach(item -> {
            visitItem(item);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_mercearia(ShoppingParser.Lista_merceariaContext ctx) {
        pdf.append("Mercearia:").append("\n");
        ctx.item().forEach(item -> {
            visitItem(item);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_acougue(ShoppingParser.Lista_acougueContext ctx) {
        pdf.append("Açougue:").append("\n");
        ctx.item().forEach(item -> {
            visitItem(item);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_padaria(ShoppingParser.Lista_padariaContext ctx) {
        pdf.append("Padaria:").append("\n");
        ctx.item().forEach(item -> {
            visitItem(item);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_embalagens(ShoppingParser.Lista_embalagensContext ctx) {
        pdf.append("Higiene:").append("\n");
        ctx.item().forEach(item -> {
            visitItem(item);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_frio(ShoppingParser.Lista_frioContext ctx) {
        pdf.append("Alimentação:").append("\n");
        ctx.item().forEach(item -> {
            visitItem(item);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_limpeza(ShoppingParser.Lista_limpezaContext ctx) {
        pdf.append("Limpeza:").append("\n");
        ctx.item().forEach(item -> {
            visitItem(item);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitItem(ShoppingParser.ItemContext ctx) {
        pdf.append(ctx.nome().getText() + ", " + ctx.valor().getText()).append("\n");
        return null; 
    }
    
    @Override
    public Void visitTotal_compra(ShoppingParser.Total_compraContext ctx) {
        pdf.append("Total da compra: " + ctx.valor().getText()).append("\n");
        return null; 
    }
    
}
