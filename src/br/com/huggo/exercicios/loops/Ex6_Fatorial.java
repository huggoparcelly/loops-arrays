package br.com.huggo.exercicios.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.print("Qual numero você quer calcular o fatorial? ");
        numero = sc.nextInt();
        System.out.println("O fatorial de " + numero + " é: ");
        while(numero > 1) {
            fatorial *= numero;
            numero -= 1;
        }
        System.out.println(fatorial);
    }
}
