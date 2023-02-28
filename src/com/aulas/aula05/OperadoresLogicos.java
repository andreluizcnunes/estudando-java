package com.aulas.aula05;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println(resultado1);

        resultado1 = (valor1 == 1) || (valor2 == 2);
        System.out.println(resultado1);

        resultado1 = (valor1 == 1)^(valor2 == 2);
        System.out.println(resultado1);

        resultado1 = !(valor1 == 1);
        System.out.println(resultado1);
    }
}
