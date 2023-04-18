package edu.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Comparator;


public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("\n--\tOrdem aleatória\t---");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Jane, the virgin", "Comédia", 30));
            add(new Serie("The 100", "Ficção", 60));
            add(new Serie("Black Mirror", "Ficção", 60));
        }};

        for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getDuracao());

        System.out.println("\n--\tOrdem de Inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Jane, the virgin", "Comédia", 30));
            add(new Serie("The 100", "Ficção", 60));
            add(new Serie("Black Mirror", "Ficção", 60));
        }};

        for(Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getDuracao());


        System.out.println("\n--\tOrdem Natural(Duração/nome)\t---"); 
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for(Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getDuracao()); //o tempo igual não deixa impressão porque o treeset não deixa.


        System.out.println("\n--\tOrdem Nome/Genero/Duracao\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroDuracao());
        minhasSeries3.addAll(minhasSeries);
        
        for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getDuracao()); //o tempo igual não deixa impressão porque o treeset não deixa.

    }
}


class Serie implements Comparable <Serie>{
 

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((duracao == null) ? 0 : duracao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (duracao == null) {
            if (other.duracao != null)
                return false;
        } else if (!duracao.equals(other.duracao))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int duracao = Integer.compare(this.getDuracao(), serie.getDuracao());
        if(duracao != 0) return duracao;

        return this.getNome().compareTo(serie.getNome());
    }

    

}

class ComparatorNomeGeneroDuracao implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        if (nome != 0) return nome;
        
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if (genero != 0) return genero;

        return s1.getDuracao().compareTo(s2.getDuracao());
    }
}
