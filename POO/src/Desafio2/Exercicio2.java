package Desafio2;


import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica

        double result = (100/A) * (B-A);

        System.out.printf("%.2f",result,"%" );


    }

}