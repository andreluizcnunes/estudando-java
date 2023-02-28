package com.aulas.aula07;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Contando com While de "+ i +" até " + max);

        while(i <= max){
            System.out.print(i+" ");
            i++;
        }

        System.out.println();

        i = 1;

        System.out.println("Contando com Do While de "+ i +" até " + max);

        do {
            System.out.print(i + " ");
            i++;
        }while (i <= 10);
    }
}
