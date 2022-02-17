package br.com.dio.collection.set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add( new LinguagemFavorita("c++", 1985, "notePad"));
        minhasLinguagensFavoritas.add( new LinguagemFavorita("c#", 1998, "VisualStudio"));
        minhasLinguagensFavoritas.add( new LinguagemFavorita("bava", 2002, "IntelliJ"));

        Set<LinguagemFavorita> minhasLinguagens1 = new LinkedHashSet<>(minhasLinguagensFavoritas);

        System.out.println(" ---- Ordem de inserção 1 ---- ");
        System.out.println(minhasLinguagens1);
        System.out.println("");

        for (LinguagemFavorita linguagem:
                minhasLinguagens1)
            System.out.println(linguagem); {
            
        }
        System.out.println("");

        System.out.println(" ---- Ordem natural ---- ");

        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(new ComparatorNome());
        minhasLinguagens2.addAll ( minhasLinguagensFavoritas );
        System.out.println(minhasLinguagens2);
        System.out.println("");

        for (LinguagemFavorita linguagem:
                minhasLinguagens2)
            System.out.println(linguagem); {

        }
        System.out.println("");
        System.out.println(" ---- Orden IDE ---- ");

        Set<LinguagemFavorita> minhasLinguagem3 = new TreeSet<>(new ComparatorIDE());
        minhasLinguagem3.addAll( minhasLinguagensFavoritas);
        System.out.println(minhasLinguagem3);
        System.out.println("");

        for (LinguagemFavorita linguagem:
                minhasLinguagem3)
            System.out.println(linguagem); {

        }
        System.out.println("");

        System.out.println(" ---- Ano de criação e nome ---- ");

        Set<LinguagemFavorita> minhasLinguagem4 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagem4.addAll( minhasLinguagensFavoritas);
        System.out.println(minhasLinguagem4);
        System.out.println("");

        for (LinguagemFavorita linguagem:
                minhasLinguagem4)
            System.out.println(linguagem); {

        }

        System.out.println("");
        System.out.println(" ---- Nome, ano de criação e IDE ---- ");

        Set<LinguagemFavorita> minhasLinguagem5 = new TreeSet<>(new ComparatorNomeAnoIde());
        minhasLinguagem5.addAll( minhasLinguagensFavoritas);
        System.out.println(minhasLinguagem5);
        System.out.println("");

        for (LinguagemFavorita linguagem:
                minhasLinguagem5)
            System.out.println(linguagem); {

        }

    }
}

class LinguagemFavorita {
    public String nome;
    public Integer anoCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoCriacao == that.anoCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
}

class ComparatorNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int nome = l1.getNome().compareToIgnoreCase( l2.getNome() );
        return nome;
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int nome = l1.getIde().compareToIgnoreCase( l2.getIde() );
        return nome;
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if ( ano != 0 ) return ano;

        int nome = l1.getNome().compareToIgnoreCase( l2.getNome() );
        return nome;
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int nome = l1.getNome().compareToIgnoreCase( l2.getNome() );
        if ( nome != 0) return nome;

        int ano = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if ( ano != 0 ) return ano;

        return l1.getIde().compareToIgnoreCase( l2.getIde() );

    }
}

