package br.com.huggo.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

import java.util.Arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] numeros = {2, 3, 7, 4, -3, -1};

        System.out.println("Vetor na ordem inversa");

        for( int i = (numeros.length - 1); i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
