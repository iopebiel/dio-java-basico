package edu.collections;

import java.util.Set;
import java.util.TreeSet;
import java.lang.reflect.GenericSignatureFormatError;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("\n--\tOrdem aleatória\t---");
        Set<Serie> minhasSeries = new LinkedHashSet<>() {{
            add(new Serie("Jane, the virgin", "Comédia", 30));
            add(new Serie("The 100", "Ficção", 60));
            add(new Serie("Black Mirror", "Ficção", 60));
        }};

        for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getDuracao())

        System.out.println("\n--\tOrdem de Inserção\t---");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>();


        System.out.println("\n--\tOrdem Natural (duracao)\t---"); 
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        System.out.println(minhasSeries2);

        System.out.println("\n--\tOrdem duracao\t---"); 



        System.out.println("\n--\tOrdem genero\t---");


        System.out.println("\n--\tOrdem Nome/Genero/Duracao\t---");

    }
}


class Serie implements CompareTo <Serie>{
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


    private String nome; 
    private String genero;
    private Integer duracao;


    public Serie(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracao() {
        return duracao;
    }


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao + 
                '}';
    }
    @Override
}

class ComparatorDuracao implements Comparator<Serie> {
    
    @Override
    public int compare(Serie g1, Serie g2) {
        return Integer.compare(g1.getDuracao(), g2.getDuracao());
    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie g1, Serie g2) {
        return g1.getGenero().compareToIgnoreCase(g2.getGenero()); 
    }
}

class ComparatorNomeGeneroDuracao implements Comparator<Serie> {

    @Override
    public int compare(Serie g1, Serie g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        
        int genero = g1.getGenero().compareTo(g2.getGenero());
        if (genero != 0) return genero;

        return g1.getDuracao().compareTo(g2.getDuracao());
         
    }
}