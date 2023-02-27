package com.aulas.aula03;

public class EscapeChar {
    public static void main(String[] args) {
        /**
        \t -> tab - Mais utilizados
        \b -> backspace
        \n -> nova linha - Mais utilizados
        \r -> retorno de carro - Mais utilizados
        \f -> avanço de página
        \' -> aspas simples - Mais utilizados
        \" -> aspas duplas - Mais utilizados
        \\ -> barra invertida - Mais utilizados
         \ddd -> constante octal
         \ uxxxx -> constante hexadecimal
         */


        //exemplos
        System.out.println("\"Hello, World!\"");
        System.out.print("\"Hello, World!\"\n");
        //1/4
        System.out.println("1\\4");
    }
}
