package com.brobot;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
        System.out.println("\nExercício 1");
        System.out.println(capitalize("a short sentence")); // "A Short Sentence"
        System.out.println(capitalize("a lazy fox")); // "A Lazy Fox"
        System.out.println(capitalize("look, it is working!")); // "Look, It Is Working!"

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
        System.out.println("\nExercício 2");
        System.out.println(longestWord("Hello there")); // "Hello"
        System.out.println(longestWord("My name is Adam")); // "name"
        System.out.println(longestWord("fun&!! time")); // "time"


        /**
         * 3 - Dado uma string e uma letra, deve-se retornar a posição da primeira incidência desta letra
         *
         * Exemplo
         */
        System.out.println("\nExercício 3");
        System.out.println(acharPosicao("Lambada", "a")); // 1
        System.out.println(acharPosicao("Lambada", "d")); // 5
        System.out.println(acharPosicao("fusca", "f")); // 0
        System.out.println(acharPosicao("aAaA", "A")); // 1

        /**
         * 4 - Dado dois números, deve-se comparar o primeiro número com o segundo.
         *
         * Exemplo
         */
        System.out.println("\nExercício 4");
        System.out.println(quemEhMaior(10, 1)); // "Número [10] é maior do que número [1]"
        System.out.println(quemEhMaior(-10, 1)); // "Número [-10] é menor do que número [1]"
        System.out.println(quemEhMaior(0, 0)); // "Empate!"

        /**
         *  5 - Exercícios com data
         *
         *  5.1 - Pegar hora do sistema e retornar nos seguintes formatos:
         *  "YYYY-MM-DD HH:mm:ss"
         *  "DD/MM/YYYY"
         *
         *  5.2 - Pegar o primeiro dia e o último dia do mês corrente
         */

        // 5.1
        System.out.println("\nExercício 5.1");
        System.out.println(dataAtualFormatada("YYYY-MM-dd HH:mm:ss"));
        System.out.println(dataAtualFormatada("dd/MM/YYYY"));

        // 5.2
        System.out.println("\nExercício 5.2");
        primeiroEUltimoDiaMes();

        /**
         * 6 - Exercícios de programação orientada a objeto
         *
         * Instruções: 
         *
         * 1) Criar as classes de acordo com o diagrama na imagem "diagrama-de-classes.png".
         * 2) Instanciar um objeto da classe Pessoa, preechendo os atributos e chamando os métodos.
         * 3) Instanciar dois objetos da classe Cachorro e associar ao objeto da classe Pessoa.
         */

        System.out.println("\nExercício 6");
        Pessoa p = new Pessoa("Alex", "Green", 20, 85, 1.75);
        Cachorro c1 = new Cachorro("Nina", 4);
        Cachorro c2 = new Cachorro("Toby", 5);

        p.adicionarCachorro(c1);
        p.adicionarCachorro(c2);

        System.out.println("Pessoa: " + p.nomeCompleto() + ", idade: " + p.getIdade());
        System.out.print("IMC da pessoa: " + p.imc());

        System.out.println();
        System.out.println();

        System.out.println("Cachorros de " + p.nomeCompleto());
        System.out.println();

        List<Cachorro> cachorros = p.getCachorros();
        for (Cachorro cachorro : cachorros) {
            System.out.println(" -> " + cachorro);
            System.out.println("    " + cachorro.late());
            System.out.println();
        }
    }

    private static String funcaoPronta() {
        return "Ok";
    }

    private static String capitalize(String str) {
        if (str == null) {
            return null;
        }

        char[] charArray = str.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);

        for (int i = 1; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i - 1])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }


    private static String longestWord(String phrase) {
        String[] word = phrase.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        String str = " ";

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > str.length())
                str = word[i];
        }
        return str;
    }

    private static int acharPosicao(String str1, String str2) {
        return str1.indexOf(str2);
    }

    private static String quemEhMaior(int x, int y) {
        if (x > y) {
            return "Número [" + x + "] é maior que número [" + y + "]";
        } else if (x < y) {
            return "Número [" + x + "] é menor que número [" + y + "]";
        } else {
            return "Empate!";
        }
    }

    private static String dataAtualFormatada(String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);

        Calendar calendar = Calendar.getInstance();
        Date dataAtual = calendar.getTime();

        return sdf.format(dataAtual);
    }

    private static void primeiroEUltimoDiaMes() {
        Calendar calendar = Calendar.getInstance();

        int primeiroDia = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        int ultimoDia = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("\nPrimeiro dia do mês: " + primeiroDia + ", ultimo dia do mês: " + ultimoDia);
    }
}
