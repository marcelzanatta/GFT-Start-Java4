package br.com.dio.exceptions;

public class DivisaoNaoExataException extends Exception{
    private int numerador;
    private int denomidador;

    public DivisaoNaoExataException(String message, int numerador, int denomidador) {
        super(message);
        this.numerador = numerador;
        this.denomidador = denomidador;
    }
}
