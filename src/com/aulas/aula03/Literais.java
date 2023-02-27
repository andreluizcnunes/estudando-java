package com.aulas.aula03;

public class Literais {

    public static void main(String[] args) {

        int varInteira = 20; // padrão;
        long varLong = 20l; // aqui deixamos explicito que é long

        float varFloat = 20.1f; // aqui deixamos explicito que é float
        double varDouble = 20.1; // padrão;

        // Double com notação científica
        // Quimica e Matematica trabalha muito com isso
        /*
        Notação científica, é também denominada por padrão ou notação em forma exponencial,
        é uma forma de escrever números que acomoda valores demasiadamente grandes ou pequenos
        para serem convenientemente escritos em forma convencional. O uso desta notação está
        baseado nas potências de 10.
         */
        double d1 = 123.4;

        double d2 = 1.234e2; // aplicando notação cientifica

        float f1 = 123.4f;

        // Hexadecimais, Octais, Binários

        int decVal = 26;
        int hexVal = 0x1a;
        int octVal = 032;
        int binVal = 0b11010; // apartir do java 7

        // Dica - curiosidade
        // separação de numeros

        long creditCarNumber = 1234_5678_9012_3456L;
        long cpf = 101_134_156_68L;
        float hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;


        // Não pode colocar underscore perto de ponto
        //float pi1 = 3_.1415F;
        //Não pode colocar underscore perto de ponto
        //float pi2 = 3._1415F;
        // Não pode colocar underscore perto de sufixos (L)
        //long cpf = 101_134_156_68_L;

        //identificador, não é literal
        //int x1 = _52;
        //OK (decimal literal)
        int x2 =5_2;
        // Não pode colocar underscore no final de um literal
        //int x3 = 52_;
        // OK (Decimal literal)
        int x4 = 5______2;

        // Não pode colocar underscore perto de prefixos (0x)
        //int x5 = 0_x52;
        // Não pode colocar underscore no começo de números
        //int x6 = 0x_52;
        // OK (hexadecimal literal)
        int x7 = 0x5_2;
        // Não pode colocar undercore no final de números
        //int x8 = 0x52_;
    }

}
