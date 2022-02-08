/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];

        int cout = 0;
        while( cout < vetor.length ){
            System.out.print("Digite o Caracter: ");
            vetor[cout] = scan.next();
            cout++;
        }

        cout = 0;
        do{
            if( !(vetor[cout].equalsIgnoreCase("a") ||
                    vetor[cout].equalsIgnoreCase("e") ||
                    vetor[cout].equalsIgnoreCase("i") ||
                    vetor[cout].equalsIgnoreCase("o") ||
                    vetor[cout].equalsIgnoreCase("u"))
            ){
                System.out.print(" " + vetor[cout]);
            }
            cout++;
        }while (cout < vetor.length);


    }
}
