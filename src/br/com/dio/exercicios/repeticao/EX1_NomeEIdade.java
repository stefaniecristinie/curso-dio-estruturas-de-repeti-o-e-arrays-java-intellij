package br.com.dio.exercicios.repeticao;

import java.util.Scanner;

public class EX1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//alt + enter para importar

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();// Para perguntar
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();// Para perguntar
        }

        System.out.println("Continua aqui...");
    }
}

