package edu.gabriel.segundasemana;

public class TipoVariavel {

    public static void main(String[] args) {
        String nome = "Gabriel";
        double salarioMinimo = 2500.34;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = (short) numeroNormal; //não recomendado, precisão maior para uma menor 
        System.out.println(numeroNormal);
        
        System.out.println(nome+": " + salarioMinimo);

        
        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //constante

        //VALOR_DE_PI = 10.14; //Não efetua alteração

        System.out.println(VALOR_DE_PI);
    }
}
