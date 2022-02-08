/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero ;
        System.out.println("Digite o numero: ");
        numero = scan.nextInt();

        int count = numero-1;

        while ( count >= 1){
           System.out.print(count + " X ");
             numero = numero * count--;
        }

        System.out.println("Resultado da fatoracao: " + numero);
    }
}
