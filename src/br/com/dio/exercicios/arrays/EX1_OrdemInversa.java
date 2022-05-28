package br.com.dio.exercicios.arrays;

/*
Criação de um vetor de 6 números inteiros que mostra na ordem inversa.
*/

public class EX1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length); Diz o tamanho.

        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {// while(count <= (vetor.length-1))
            System.out.print(vetor[count] + " ");//mostra a sequência normal.
            count++;
        }

        System.out.print("\nVetor: ");// \n para pular linha.
        for(int i = (vetor.length - 1); i >= 0; i --) {//vetor.lenght somente dá erro.
            System.out.print(vetor[i] + " ");
        }

    }
}
