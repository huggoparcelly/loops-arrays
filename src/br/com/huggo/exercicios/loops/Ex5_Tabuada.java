package br.com.huggo.exercicios.loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int multiplicador;
        int resultado;

        System.out.print("Qual número você deseja ver a tabuada? ");
        numero = sc.nextInt();

        System.out.println("Tabuada de " + numero);
        for(int i = 0; i < 10; i++) {
            multiplicador = i + 1;
            resultado = numero * multiplicador;
            System.out.println(numero + " X " + multiplicador + " = " + resultado);
        }
    }
}
