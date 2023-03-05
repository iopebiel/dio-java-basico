package edu.gabriel.segundasemana;

public class Operadores {
    
    public static void main(String[] args) {
        String nomeCompleto = "Gabriel"+"Roque"+"Iope"; //concatenação com adição em string
        
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; //Adição, depois concatenação
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; //Concatenação após a string. independente do tipo de dados que vem depois
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1"; //mesmo que o acima
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); //Adição separada por priorização dos parenteses e após ela, concatenação.
        System.out.println(concatenacao);
    }
}
