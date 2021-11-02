package br.com.huggo.exercicios.loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int pares = 0;
        int impares = 0;
        int numero;

        System.out.print("Quantos numeros você quer digitar? ");
        quantidadeNumeros = sc.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o " + (i+1) + " numero: ");
            numero = sc.nextInt();
            if(numero % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        }

        System.out.println("A quantidade de numeros pares é: " + pares);
        System.out.println("A quantidade de numeros impares é: " + impares);
    }
}
