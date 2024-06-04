package com.atv1.app.linguagemProg2;
/* Crie uma classe base para cadastrar Funcionários*/ 
/* Um funcionário deve possuir nome, endereço, telefone, rg, cpf, data de admissão*/

public class LingP2_Funcionario {
    private String nome;
    private String endereco;
    private String telefone;
    private String rg;
    private String cpf;
    private String dataAdmissao;

    public LingP2_Funcionario(String nome, String endereco, String telefone, String rg, String cpf, String dataAdmissao){

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;

    }

/* Um funcionário pode tirar férias, faltar e solicitar saída do emprego*/
/* Crie uma classe de execução chamada Fábrica*/
/* Na classe Fábrica instancie três Funcionários*/
/* Inicialize os valores de cada Funcionário criado*/

    public void ferias(){

        System.out.println(nome + "está em período de férias.");
    }

    public void falta(){

        System.out.println(nome + "está ausente do trabalho.");
    }

    public void pedidoDemissao(){

        System.out.println(nome + "pediu demissão.");
    }
}
