package br.ufscar.dc.compiladores.shoppinglists;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author alain.djamba
 */
public class ShoppingSemanticoUtils {
    
    public static List<String> errosSemanticos = new ArrayList<>();
    
    // adiçao do erro semântico na lista de erros
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
}
