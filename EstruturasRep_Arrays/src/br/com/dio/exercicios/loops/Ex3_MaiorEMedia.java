/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int media = 0;
        int maiorNumero = 0;

        for ( int i = 0; i < 5; i++){
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            media +=numero;

            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        /*
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);
         */
        System.out.println("Valor media: " + ( media/5 ));
        System.out.println("Maior numero: " + maiorNumero);
    }
}
