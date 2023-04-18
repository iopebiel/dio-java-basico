package edu.collections;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {


    public static void main(String[] args) {
        double mediaSemestral = 0;
        
        try (Scanner scan = new Scanner(System.in)) {
            List<Double> mesTemperatura = new ArrayList<Double>();

            for (int i = 0; i < 6; i++)
            {
                System.out.println("Insira a média de temperatura do mês " + (i+1) + ":");
                double aux = scan.nextDouble();
                mediaSemestral += aux;
                mesTemperatura.add(aux);
            
            }   
            
            System.out.println("A média semestral é: " + (mediaSemestral/=6) + "ºC");

            for (int i = 0; i < 6; i++)
            {
                if (mesTemperatura.get(i) > mediaSemestral)
                {
                    System.out.print("A temperatura " + mesTemperatura.get(i) + "ºC e o mês de ");
                    switch (i + 1) {
                        case 1: System.out.print("Janeiro"); break;
                        case 2: System.out.print("fevereiro"); break;
                        case 3: System.out.print("Março"); break;
                        case 4: System.out.print("Abril"); break;
                        case 5: System.out.print("Maio"); break;
                        case 6: System.out.print("Junho"); break;
                    }
                    System.out.print(" (" + (i+1) + ") está acima da média\n");
                }   
            }
        }
        
    }


}