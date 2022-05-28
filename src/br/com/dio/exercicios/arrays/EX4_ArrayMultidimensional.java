package br.com.dio.exercicios.arrays;

/*
Gera e imprime uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class EX4_ArrayMultidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];//4x4

        for(int i = 0; i < M.length; i++) {//linha
            for( int j = 0; j < M[i].length; j++) {//coluna
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) {//cada linha é 1 array.
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}

