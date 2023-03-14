package edu.gabriel.segundasemana;

public class Operadores5 {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2)
            System.out.println("Ambas as condições são verdadeiras");

        if (condicao1 && 7 > 2)
        System.out.println("Ambas as condições são verdadeiras");

        if (condicao1 || condicao2)
            System.out.println("Apenas uma condição é verdadeira");
    }
}
