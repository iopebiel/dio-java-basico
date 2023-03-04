package edu.gabriel.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
    System.out.println("Boas vindas turma DIO");
    
    String PrimeiroNome = "Gabriel";
    String SegundoNome = "Iope";
    
    String nomeCompleto = nomeCompleto(PrimeiroNome, SegundoNome);
    System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String PrimeiroNome, String SegundoNome){
        return "Resultado do método: " + PrimeiroNome.concat(" ").concat(SegundoNome);
    }

}