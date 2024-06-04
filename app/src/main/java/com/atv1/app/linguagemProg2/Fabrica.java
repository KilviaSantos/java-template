package com.atv1.app.linguagemProg2;

/* Crie uma classe de execução chamada Fábrica*/

public class Fabrica {
    public static void criarFuncionarios() {

        /* Na classe Fábrica instancie três Funcionários*/
        LingP2_Funcionario funcionario1 = new
LingP2_Funcionario("José Santos", "Rua Alfa, 1", "(85)1111-1111", "1111111111", "11111111111", "01/01/2001");        
        funcionario1.tirarFerias();

        LingP2_Funcionario funcionario2 = new        
LingP2_Funcionario("Maria Silva", "Rua Beta, 2", "(85)2222-2222", "2222222222", "22222222222", "02/02/2002");
        funcionario2.faltar();

        LingP2_Funcionario funcionario3 = new
LingP2_Funcionario("João Bezerra", "Rua Ômega, 3", "(85)3333-3333", "3333333333", "333333333333", "03/03/2003");
        funcionario3.pedirDemissao();
    }
}
