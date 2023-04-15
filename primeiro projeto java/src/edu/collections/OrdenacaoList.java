package edu.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() //list <tipo> nomedalista = novo arraylist(lista de array)
        {{ //Duas chaves na criação da lista fez com que já cria-se os objetos gatos e sua inserção da lista.
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem Natural (Nome)\t---"); //uso da interface Comparable
        Collections.sort(meusGatos); //comparable - uso uma vez.
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem idade\t---"); //uso da interface comparator.
        Collections.sort(meusGatos, new ComparatorIdade()); // chamar a interface
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}


class Gato implements Comparable<Gato>{ //objeto Gato com uso da interface de comparação do tipo Objeto
    private String nome; //atributos
    private Integer idade;
    private String cor;

    public String getNome() { //necessário por conta do private.
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) { //interface de comparação do nome.
        return this.getNome().compareToIgnoreCase(gato.getNome()); //Por estar na classe de gato, é utilizado this
    }
    //Retorno inteiro para comparação.
    //0 = nomes iguais.
    //1 = maior que o comparado.
    //-1 = menor que o comparado.


}

class ComparatorIdade implements Comparator<Gato> { // interface de comparação da idade
    
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {//interface de comparação da cor

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor()); //por estar fora da classe gato... ao invés de usar 'this' é 'g1' que é o primeiro gato e o 'g2' segundo gato.
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {//interface de comparação por nome, sendo igual... Uso da cor, sendo iguais também... uso da idade

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        
        int cor = g1.getCor().compareTo(g2.getCor());
        if (cor != 0) return cor;

        return g1.getIdade().compareTo(g2.getIdade());
         
    }
}