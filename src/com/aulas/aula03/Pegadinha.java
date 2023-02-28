package com.aulas.aula03;

public class Pegadinha {

    public static void main(String[] args) {
        //Tamanho: 32 bits - Intervalo de Valores: -2.147.483.648 a 2.147.483.647


//        int var1 = 2147483647;
//        int var2 = 1;
//
//        System.out.println(var1+var2);

        //Tamanho: 64 bits - Intervalo de Valores: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        long var3 = 2147483649L;
        int var4 = (int) var3;

        System.out.println(var4);

        //        int Oct31 = 031;
//        int Dec25 = 25;
//
//        System.out.println(Oct31 == Dec25);


    }
}
