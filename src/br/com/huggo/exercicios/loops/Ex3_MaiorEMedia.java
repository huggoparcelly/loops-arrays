package br.com.huggo.exercicios.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero;
        double soma = 0;
        double maior = 0;
        double media;


        for(int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextDouble();
            soma += numero;
            if(numero > maior) maior = numero;
        }

        media = soma / 5;

        System.out.println("A média dos numeros informados é: " + media);
        System.out.println("O maior número é: " + maior);

    }


}
