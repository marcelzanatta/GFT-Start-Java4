/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

package br.com.dio.exercicios.arrays;


import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[20];

        for ( int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100);
        }

        int count = 0;

        while ( count < vetor.length){
            System.out.println(" " + vetor[count] + " Posterior: "+ (vetor[count]+1));
            count++;
        }

        /*
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[20];
        int count = 0;
        while ( count < vetor.length){
            System.out.print("Digite o numero inteiro: ");
            vetor[count] = scan.nextInt();
            count++;
        }

        count =0;

        while ( count < vetor.length){
            System.out.print(" " + vetor[count]);
            count++;
        }
        */

    }
}
