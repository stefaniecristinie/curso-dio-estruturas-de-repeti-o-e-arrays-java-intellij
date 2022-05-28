package br.com.dio.exercicios.repeticao;

/*
Gerador de tabuada: gera a tabuada de qualquer número inteiro entre 1 a 10.
Saída:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class EX5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i <= 10; i++) {//i = i + 1;
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
