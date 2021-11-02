package br.com.huggo.exercicios.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Objects;
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] caracteres = new String[6];

        int quantidadeConsoantes = 0;

        for(int i = 0; i < caracteres.length; i++) {
            System.out.print("Digite uma letra: ");
            String letra = sc.next();
            caracteres[i] = letra;
        }

        System.out.println("As consoantes foram: ");
        for (String caracter : caracteres) {
            if (!(caracter.equalsIgnoreCase("a") ||
                    caracter.equalsIgnoreCase("e") ||
                    caracter.equalsIgnoreCase("i") ||
                    caracter.equalsIgnoreCase("o") ||
                    caracter.equalsIgnoreCase("u"))
            ) {
                quantidadeConsoantes += 1;
                System.out.print(caracter + " ");
            }
        }

        System.out.println("\nUm total de " + quantidadeConsoantes + " consoantes!");
    }
}
