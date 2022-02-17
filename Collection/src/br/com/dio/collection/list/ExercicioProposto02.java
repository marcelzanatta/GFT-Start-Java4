package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> investigation = new ArrayList<String>();

            System.out.println("Telefonou para a vítima? ");
            investigation.add(scan.next());

            System.out.println("Esteve no local do Crime? ");
            investigation.add(scan.next());

            System.out.println("Mora perto da vítima? ");
            investigation.add(scan.next());

            System.out.println("Devia dinheiro para a vítima? ");
            investigation.add(scan.next());

            System.out.println("Já trabalhou para a vítima? ");
            investigation.add(scan.next());

        Iterator<String> iterator = investigation.iterator();

        int respS = 0;
        int respN = 0;
        String aux;

        while (iterator.hasNext()){
            aux = iterator.next();
            System.out.println(aux + " ");

            if ( aux.contains("s")) {
                respS++;
                System.out.println("SIM++");
            }
        }

        switch (respS){
            case 2:
                System.out.println("Pessoa Suspeita!! ");
                break;
            case 3:
            case 4:
                System.out.println("Pessoa Cúmplice!!");
                break;
            case 5:
                System.out.println("Assasino!!");
                break;
            default:
                System.out.println("Se livrou, INOCENTE!!");
                break;
        }

    }
}
