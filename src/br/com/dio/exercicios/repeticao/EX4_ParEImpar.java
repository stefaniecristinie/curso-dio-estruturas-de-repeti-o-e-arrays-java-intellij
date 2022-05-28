package br.com.dio.exercicios.repeticao;

/*
O programa pede N números inteiros, calcula e mostra a quantidade de números pares e a quantidade de números ímpares.
*/

import java.util.Scanner;

public class EX4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;// quantPares = quantPares +1; Se o resto da divisão for igual a 0 quer dizer que esse número é par.
            else quantImpares++;

            count++;//count = count +1;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}
