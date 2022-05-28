package br.com.dio.exercicios.arrays;

/*
O programa vai ler 20 números inteiros aleatórios (entre 0 e 100) e armazenar num vetor.
Ao final mostra os números, seus antecessores e sucessores.
*/

import java.util.Random;

public class EX3_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();//gera números aleatórios.

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);//bound = limite.
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {//foreach
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
