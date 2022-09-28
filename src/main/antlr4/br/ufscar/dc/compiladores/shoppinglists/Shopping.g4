grammar Shopping;

/* Regras léxicas */

/* Regra léxica para iniciar lista de compras */
COMPRAS: 'compras';

/* Categorias dos items */
BEBIDAS: 'bebidas';
MERCEARIA: 'mercearia';
ACOUGUE: 'açougue';
PADARIA: 'padaria';
EMBALAGENS: 'embalagens';
FRIO: 'frio';
LIMPEZA: 'limpeza';

/* Regra léxica para iniciar o total da compra */
TOTAL: 'total';

/* Números inteiros e reais utilizado para indicar o valor de cada item */
NUM_INT	: ('0'..'9')+;
NUM_REAL : ('0'..'9')+ ('.' ('0'..'9')+)?;

/* Nome de cada item da lista de compras */
CADEIA : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | ' ')*;

fragment
ESC_SEQ	: '\\\'';
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();};
WS : ( ' ' | '\t' | '\r' | '\n') {skip();};

/* Pontuações */
VIRGULA: ',';
DOISPONTOS: ':';

ERRO: .;

/* Regras sintáticas */

lista_compras: 'compras' lista_bebidas lista_mercearia lista_acougue lista_padaria lista_embalagens lista_frio lista_limpeza total_compra <EOF>;
lista_bebidas: 'bebidas' item+;
lista_mercearia: 'mercearia' item+;
lista_acougue: 'açougue' item+;
lista_padaria: 'padaria' item+;
lista_embalagens: 'embalagens' item+;
lista_frio: 'frio' item+;
lista_limpeza: 'limpeza' item+;
total_compra: 'total' ':' valor;

item: nome ',' valor;
nome: CADEIA;
valor: NUM_INT | NUM_REAL;
