package com.brobot;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private double peso;
    private double altura;

    private List<Cachorro> cachorros;

    public Pessoa(String nome, String sobrenome, int idade, double peso, double altura) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.cachorros = new ArrayList<Cachorro>();
    }

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double imc() {
        double calculo = (peso) / (altura * altura);
        return calculo;
    }

    public void adicionarCachorro(Cachorro cachorro) {
        cachorros.add(cachorro);
        cachorro.setPessoa(this);
    }

    public int getIdade() {
        return idade;
    }

    public List<Cachorro> getCachorros() {
        return cachorros;
    }
}
