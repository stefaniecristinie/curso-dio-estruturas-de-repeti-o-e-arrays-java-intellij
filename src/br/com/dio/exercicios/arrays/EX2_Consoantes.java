package br.com.dio.exercicios.arrays;

/*
O programa vai ler um vetor de 6 caracteres e dizer quantas consoantes foram lidas.
*/

import java.util.Scanner;

public class EX2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") | // ! = negativação
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) { //foreach
            if ( consoante != null)//evitar que imprima null; != diferente.
                System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);

    }
}

