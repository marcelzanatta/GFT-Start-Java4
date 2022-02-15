package br.com.dio.exceptions;

public class TamanhoArrayDiferente extends Exception {
    private int[] numerador;
    private int[] denominador;

    public TamanhoArrayDiferente(String message, int[] numerador, int[] denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
