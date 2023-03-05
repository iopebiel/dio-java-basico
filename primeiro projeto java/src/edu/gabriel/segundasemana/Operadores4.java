package edu.gabriel.segundasemana;

public class Operadores4 {
    public static void main(String[] args) {
        String nomeUm = "Gabriel";
        String nomeDois = "Gabriel";
        String nomeTres = new String("Gabriel");
        
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm.equals(nomeTres)); //Comparação de igualdade com objeto.

        int a = 1;
        int b = 2;

        boolean SimNao = a == b;

        if(a < b)
            System.out.println("Verdadeiro");
        
        System.out.println("a é igual a b? " + SimNao);

        SimNao = a > b;
        System.out.println("a é maior que b? " + SimNao);

        SimNao = a < b;
        System.out.println("a é menor que b? " + SimNao);
    }
}