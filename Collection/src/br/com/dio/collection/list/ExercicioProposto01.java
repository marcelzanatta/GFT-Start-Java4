package br.com.dio.collection.list;

import java.util.*;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        for ( int i = 0 ; i<5 ; i++){
            System.out.println("Digite a temperatura: ");
            temperaturas.add(scan.nextDouble());
        }

        Iterator<Double> iterator = temperaturas.iterator();

        while (iterator.hasNext()){
            Double next = iterator.next();
            System.out.println(next);
        }

        Iterator<Double> iteratorMedia = temperaturas.iterator();

        Double soma = 0d;

        while (iteratorMedia.hasNext()){
            soma += iteratorMedia.next();
        }
        Double media = soma/temperaturas.size();

        System.out.println("valor da media semestral da temperatura é: " + media);

        Iterator<Double> iteratorAcimaMedia = temperaturas.iterator();

        Double aux = 0d;
        int countMes = 1;
         while (iteratorAcimaMedia.hasNext()){
             aux = iteratorAcimaMedia.next();
            if ( aux > media ){
                switch (countMes){
                    case (1):
                        System.out.println("Valor acima da média: "+ aux + " Mes: Janeiro" );
                        break;
                    case (2):
                        System.out.println("Valor acima da média: "+ aux + " Mes: Fevereiro" );
                        break;
                    case (3):
                        System.out.println("Valor acima da média: "+ aux + " Mes: Março" );
                        break;
                    case (4):
                        System.out.println("Valor acima da média: "+ aux + " Mes: Abril" );
                        break;
                    case (5):
                        System.out.println("Valor acima da média: "+ aux + " Mes: Maio" );
                        break;
                    case (6):
                        System.out.println("Valor acima da média: "+ aux + " Mes: Junhi" );
                        break;
                    default:
                        break;
                }

            }
            countMes++;
        }

    }
}

/*
public class ExercicioProposto01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Meses> controleTemperatura = new ArrayList<>();
        int i = 1;

        while ( i < 6 ) {
            System.out.println("Digite a temperatura para o mes " + i++);
            int temp = scan.nextInt();
            Meses.temperatura = temp;
        }

        Iterator<Meses> iterator = controleTemperatura.iterator();

        while(iterator.hasNext()){
            System.out.println("temperatura meses: ");
        }
    }
}

class Meses{
    public static int temperatura;
    public  String mes;


    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }
}
*/