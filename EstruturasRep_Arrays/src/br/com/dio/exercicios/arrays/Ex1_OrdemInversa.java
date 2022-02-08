/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/


package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6 };

        System.out.println("tamanho vetor" + vetor.length);
        for ( int i = vetor.length-1 ; i>-1; i--){
            System.out.print(" " + vetor[i]);
        }
    }
}
