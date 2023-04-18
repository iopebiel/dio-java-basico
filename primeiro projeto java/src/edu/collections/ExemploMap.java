package edu.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class ExemploMap {
    
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString()); //ordem aleatória.

        //tipo da chave e tipo de valor. Não existe o metodo add, se utiliza put. As chaves tem valor unico, os valores podem ser duplicados.

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.put("gol",15.2);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do Uno: " + carrosPopulares.get("uno"));

        System.out.println("\nExiba os modelos: ");

        Set<String> modelos = carrosPopulares.keySet(); //retorna uma collections com todas as chaves.
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();  //retorna uma collections com todos os consumos
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais econômico e seu consumo: "); 
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); //valor da chave que é mais eficiente, collections que recebe uma collections, uso do values. 
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); //retorna um set, elementos do tipo entry. Serve para manipulação dos dados.
        String modeloMaisEficiente = ""; //variavel de controle.

        for (Map.Entry<String, Double> entry : entries) { //para cada valor do set de entry
            if (entry.getValue().equals(consumoMaisEficiente)) //se o consumo dele for o mais eficiente.
                modeloMaisEficiente = entry.getKey(); //então atribue a sua chave ao modelo mais eficinte.
        }

        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("\nExiba o modelo menos econômico e seu consumo: "); 

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modulo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        double soma = 0;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()){ 
            Double next = iterator.next();
            soma += next; 
        } 

        System.out.println("\nExiba a soma dos consumos: " + soma);

        System.out.println("\nExiba a média de consumos desse dicionário: " + soma/carrosPopulares.size());

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){ 
            if (iterator1.next().equals(15.6)) iterator1.remove();
        } 
        System.out.println(carrosPopulares);

        System.out.println("\nExiba os carros  na ordem que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("\n Exiba os carros pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);

        System.out.println(carrosPopulares2.toString());

        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Verificar se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
