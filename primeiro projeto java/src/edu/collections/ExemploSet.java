package edu.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.util.Collections;

public class ExemploSet {
    
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        // sem get para trabalhar com posição. System.out.println("Exiba a posição da nota 5: ");

        System.out.println("\nConfira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); 
        Double soma = 0d;
        while(iterator.hasNext()){ 
            Double next = iterator.next();
            soma += next; 
        }    
        
        System.out.println("\nExiba a soma dos valores: " + soma);
        
        
        System.out.println("\nExiba a média das notas: " + (soma/notas.size())); 


        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
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
