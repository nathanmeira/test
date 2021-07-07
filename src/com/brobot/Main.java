package com.brobot;

public class Main {

    public static void main(String[] args) {

        /**
         * Todos os exercícios devem printar o resultado no console igual ao exemplo abaixo:
         */

        System.out.println(funcaoPronta()); // "Ok"

        /**
        * 1 - Capitalize
        *
        * Write a function that accepts a string. The function should
        * capitalize the first letter of each word in the string then
        * return the capitalized string.
        *
        * Examples:
        */
        
        // System.out.println(capitalize("a short sentence")) // "A Short Sentence"
        // System.out.println(capitalize("a lazy fox")) // "A Lazy Fox"
        // System.out.println(capitalize("look, it is working!")) // "Look, It Is Working!"

        /**
        * 2 - Longest Word
        *
        * Write a function that returns the longest word in the passed sentence.
        * If there are two or more words that are the same length, return
        * the first word from the string with that length. Ignore punctuation
        * and assume sentence will not be empty.
        *
        * Examples:
        */
        
        // System.out.println(longestWord("Hello there")) // "Hello"
        // System.out.println(longestWord("My name is Adam")) // "name"
        // System.out.println(longestWord("fun&!! time")) // "time"


        /**
        * 3 - Dado uma string e uma letra, deve-se retornar a posição da primeira incidência desta letra
        *
        * Exemplo
        */
        
        // System.out.println(acharPosicao("Lambada", "a")) // 1
        // System.out.println(acharPosicao("Lambada", "d")) // 5
        // System.out.println(acharPosicao("fusca", "f")) // 0
        // System.out.println(acharPosicao("aAaA", "A")) // 1

        /**
        * 4 - Dado dois números, deve-se comparar o primeiro número com o segundo.
        *
        * Exemplo
        */
        
        // System.out.println(quemEhMaior(10, 1)) // "Número [10] é maior do que número [1]"
        // System.out.println(quemEhMaior(-10, 1)) // "Número [-10] é menor do que número [1]"
        // System.out.println(quemEhMaior(0, 0)) // "Empate!"

        /**
         *  5 - Exercícios com data
         *
         *  5.1 - Pegar hora do sistema e retornar nos seguintes formatos:
         *  "YYYY-MM-DD HH:mm:ss"
         *  "DD/MM/YYYY"
         *
         *  5.2 - Pegar o primeiro dia e o último dia do mês corrente
         */

        /**
         * 6 - Exercícios de programação orientada a objeto
         *
         * Instruções: 
         *
         * 1) Criar as classes de acordo com o diagrama na imagem "diagrama-de-classes.png".
         * 2) Instanciar um objeto da classe Pessoa, preechendo os atributos e chamando os métodos.
         * 3) Instanciar dois objetos da classe Cachorro e associar ao objeto da classe Pessoa.
         */
    }

    private static String funcaoPronta() {
        return "Ok";
    }

    private static String capitalize(String str) {
        return null;
    }

    private static String longestWord(String phrase) {
        return null;
    }
}
