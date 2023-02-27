package com.aulas.aula03;

public class VariaveisPrimitivas {
    public static void main(String[] args) {

        // Inteiros começa - com 8 bits a 64 bits
        byte varByte = 20; //Tamanho: 8 bits - Intervalo de Valores: -128 a 127
        short varShort = 20; //Tamanho: 16 bits - Intervalo de Valores: -32.768 a 32.767
        int varInt = 20; //Tamanho: 32 bits - Intervalo de Valores: -2.147.483.648 a 2.147.483.647
        long varLong = 20; //Tamanho: 64 bits - Intervalo de Valores: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // Ponto Flutuante - com 32 bits a 64 bits
        // o mais utilizado é  Double.
        float varFloat = 100.30f; //Tamanho: 32 bits
        double varDouble = 100.30; // Tamanho: 64 bits

        // Caracter - pode ser um inteir também Tabela ASCII
        char varChar = 'a';
        char o = 111;
        char i = 105;

        System.out.println(""+ o + i);

        // outros caracteres podemos usar o Unicode - exemplo arabe, japão, china e etc...
        char a = '\u0041';
        System.out.println(""+a);

        // Boolean - true ou false

        boolean verdadeiro = true;
        boolean falso = false;
    }
}
