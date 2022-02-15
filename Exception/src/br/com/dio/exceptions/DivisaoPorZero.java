package br.com.dio.exceptions;

public class DivisaoPorZero extends Exception{
    private int denominador;

    public DivisaoPorZero(String message, int denominador) {
        super(message);
        this.denominador = denominador;
    }
}
