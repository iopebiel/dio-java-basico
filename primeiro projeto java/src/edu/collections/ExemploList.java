package edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>(); //inicialização da variável em lista.
        notas.add(7.0); //inserção de dados. tipo double: ou coloca .0 ou d para inteiros.
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); //Impressão das notas do Array/impressão na ordem da inserção. (toString opcional)

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5.0)); //indexof método para posição de um elemento dentro de uma lista

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0); //utilizado o método sobrecarregado com argumento: posição e elemento.
        System.out.println(notas); //impressão

        System.out.println("\nSubstituta a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //set método de substuição. e o indexOf para encontrar a posição do elemento 5.
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d)); //contains método para conferir se tem um elemento dentro da lista. Retorno de true ou false a partir de um objeto.

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
//        System.out.println(notas);
        for (Double nota : notas) System.out.println(nota); //for it. Outro método de impressão de lista.

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2)); //get método para passar a posição e é retornado o elemento. 
        System.out.println(notas.toString());
    
        System.out.println("\nExiba a menor nota: " + Collections.min(notas)); //Collection implementa a interface comparable de double que possibilita esse retorno de valor mais baixo.
    
        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); //variável iterator do tipo double, inicializado no inicio da lista.
        //iterator método para iterar na lista e ir navegando entre os elementos.
        Double soma = 0d; //variável de controle soma. Para realização de soma.
        while(iterator.hasNext()){ //laço com verificação de existência de próximo elemento.
            Double next = iterator.next(); //coloca o valor da próxima variável na variável next
            soma += next; //Adiciona o valor da variável na variável soma.
        }    
        
        System.out.println("\nExiba a soma dos valores: " + soma);
        
        
        System.out.println("\nExiba a média das notas: " + (soma/notas.size())); //realização da divisão da soma obtida pelo número de elementos na lista.


        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);
         

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){ 
            Double next = iterator1.next();
            if(next < 7) iterator1.remove(); 
        } 
        System.out.println(notas);

        System.out.println("\nApague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());


    }
}
