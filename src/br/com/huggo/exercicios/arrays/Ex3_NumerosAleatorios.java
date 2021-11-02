package br.com.huggo.exercicios.arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus antecessores e sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        for(int i = 0; i < numeros.length; i++) {
            int numeroRandom = random.nextInt(100);
            numeros[i] = numeroRandom;
        }

        System.out.println("Numeros aleatórios:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\nAntecessores dos números aleatórios:");
        for (int numero: numeros) {
            System.out.print((numero - 1) + " ");
        }

        System.out.println("\nSucessores dos números aleatórios:");
        for (int numero: numeros) {
            System.out.print((numero + 1) + " ");
        }
    }
}
