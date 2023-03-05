package edu.gabriel.segundasemana;

public class Operadores2 {

    public static void main(String[] args){
        int numero = 5;

        System.out.println(- numero); //Conversão no print sem alteração da variável
        System.out.println(numero);

        numero = - numero; //Conversão
        System.out.println(numero);

        numero = numero * -1; //Mesma Conversão
        System.out.println(numero);

        System.out.println(numero++); //Impressão do número com incremento após a impressão
        System.out.println(numero);
        System.out.println(++numero); //incremento no número, depois impressão
        System.out.println(numero);

    }
}