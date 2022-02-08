/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int quantidadeNumInt = 0;
        int quantidadeNumPar = 0;
        int quantidadeNumImpar = 0;
        int numero;

        System.out.println("Digite a Quantidade de Numeros: ");
        quantidadeNumInt = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            if ( numero%2 == 0){
                quantidadeNumPar++;
            }else{
                quantidadeNumImpar++;
            }

            count++;

        }while(quantidadeNumInt>count);

        System.out.println("Quantidade de numeros par: " + quantidadeNumPar);
        System.out.println("Quantidade de numeros impar: " + quantidadeNumImpar);
    }
}
