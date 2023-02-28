package com.aulas.aula06;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

        if(idade <= 19){
            System.out.println("Jovem");
        }else if(idade >= 20 && idade <= 59){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
