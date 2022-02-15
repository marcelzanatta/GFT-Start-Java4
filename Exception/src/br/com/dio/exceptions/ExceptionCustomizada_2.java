package br.com.dio.exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};


        for (int i = 0; i < denominador.length; i++) {

                try{
                    if( denominador[i]== 0)
                        throw new DivisaoPorZero("Valor do denominador igual a 0", denominador[i]);

                    if ( numerador.length != denominador.length)
                        throw new TamanhoArrayDiferente("Tamanho dos vetores diferentes", numerador, denominador);

                    if (numerador[i] %2 != 0)
                        throw new DivisaoNaoExataException("Divisao impar/par", numerador[i], denominador[i]);
                            int resultado = numerador[i] / denominador[i];

                    System.out.println(resultado);

                } catch (DivisaoNaoExataException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,e.getMessage());
                } catch (DivisaoPorZero e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }catch (TamanhoArrayDiferente e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

        }
        System.out.println("O programa continua...");
    }
}