package com.brobot;

public class Cachorro {

    private String nome;
    private int idade;

    private Pessoa pessoa;

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pessoa = null;
    }

    public String late() {
        return nome + " está latindo!!!";
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    @Override
    public String toString() {
        String mensagemPessoa = pessoa == null ? "não cadastrado" : pessoa.nomeCompleto();
        return "Cachorro [nome: " + nome + ", idade: " + idade + ", pessoa: " + mensagemPessoa + "]";
    }
}
