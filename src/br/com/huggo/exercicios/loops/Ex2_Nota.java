package br.com.huggo.exercicios.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota inserida com sucesso!");
    }
}
