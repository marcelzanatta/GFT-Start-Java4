/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matriz = new int[4][4];

        for ( int i = 0; i < Matriz.length; i++){
            for ( int j = 0; j < Matriz.length; j++){
                Matriz[i][j] = random.nextInt(9);
            }
        }
        for ( int i = 0; i < Matriz.length; i++){
            for ( int j = 0; j < Matriz.length; j++){
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
