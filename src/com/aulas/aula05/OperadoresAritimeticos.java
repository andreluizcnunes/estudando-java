package com.aulas.aula05;

public class OperadoresAritimeticos {

    public static void main(String[] args) {

        // Operadores aritiméticos
        // +(soma) -(subtração) *(multiplicação) /(divisão)
        // %(MOD) ++(incremento) --(decremento)

        // ordem de precedência
        // * / depois + -

        int ordem = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println("Resultado da Ordem: "+ ordem);

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = 2 - 1;
        System.out.println(resultado);

        resultado = 2 * 1;
        System.out.println(resultado);

        resultado = 2 / 1;
        System.out.println(resultado);

        resultado++; // ++resultado
        System.out.println(resultado);

        resultado--; // --resuultado
        System.out.println(resultado);

        resultado = 10 % 2;
        System.out.println(resultado);
    }
}
