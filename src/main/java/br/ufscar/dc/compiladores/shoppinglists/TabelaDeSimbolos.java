package br.ufscar.dc.compiladores.shoppinglists;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alain.djamba
 */

public class TabelaDeSimbolos {
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    // Inicialização da tabela de símbolos
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    // Inserção na tabela de símbolos
    public void inserir(String nome) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome));
    }
    
    // verificação da presença da string na tabela de símbolos
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
}
