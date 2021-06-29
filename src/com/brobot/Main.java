package com.brobot;

public class Main {

    public static void main(String[] args) {

        /**
         * Todos os testes devem sair o resultado no console igual ao exemplo a baixo
         * Examples:
         * System.out.println(funcaoPronta()) // "Ok"
         */

        System.out.println(funcaoPronta());

        /**
        * 1- Capitalize
        *
        * Write a function that accepts a string. The function should
        * capitalize the first letter of each word in the string then
        * return the capitalized string.
        *
        * Examples:
        * System.out.println(capitalize("a short sentence")) // "A Short Sentence"
        * System.out.println(capitalize("a lazy fox")) // "A Lazy Fox"
        * System.out.println(capitalize("look, it is working!")) // "Look, It Is Working!"
        */

        /**
        * 2- Longest Word
        *
        * Write a function that returns the longest word in the passed sentence.
        * If there are two or more words that are the same length, return
        * the first word from the string with that length. Ignore punctuation
        * and assume sentence will not be empty.
        *
        * Examples:
        * System.out.println(longestWord("Hello there")) // "Hello"
        * System.out.println(longestWord("My name is Adam")) // "name"
        * System.out.println(longestWord("fun&!! time")) // "time"
        */


        /**
        * 3 - Dado uma string e uma letra deve retornar a primeira posição da letra
        *
        * Exemple
        * System.out.println(acharPosicao("Lambada", "a")) // 1
        * System.out.println(acharPosicao("Lambada", "d")) // 5
        * System.out.println(acharPosicao("fusca", "f")) // 0
        * System.out.println(acharPosicao("aAaA", "A")) // 1
        */

        /**
        * 4 - Dado dois núremos deve comparar o primeiro número com o segundo.
        *
        * Exemple
        * System.out.println(quemEhMaior(10, 1)) // "Número [10] é maior do que número [1]"
        * System.out.println(quemEhMaior(-10, 1)) // "Número [-10] é menor do que número [1]"
        * System.out.println(quemEhMaior(0, 0)) // "Empate!"
        */

        /**
         *  5 - Exercícios com data
         *  5.1 - Pegar hora do Systema e retornar nos seguintes formatos:
         *  "YYYY-MM-DD HH:mm:ss"
         *  "DD/MM/YYYY"
         *  5.2 - Pegar o primeiro dia e o último dia do mês corrente
         */

        /**
         * 6 - Exercícios programação orientado a objeto
         * 6.1 - Cria as class de acordo com o diagrama na imagem "diagrama-de-classe.png"
         * Instanciar um objeto da classe Pessoa, preecher os atributos e chamar os métodos
         * 6.2 - Instanciar dois objetos da classe Cachorro e associar ao objeto da classe Pessoa
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
