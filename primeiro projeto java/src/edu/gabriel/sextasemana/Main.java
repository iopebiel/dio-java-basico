package edu.gabriel.sextasemana;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        Thread.dumpStack(); //Impressão da stack trace dentro do método c. Mostra o que estava aberto e executando. Pilhas de chamadas
           //Leitura de baixo para cima.
        System.out.println("Finalizou o método c.");
    }
}