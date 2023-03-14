package edu.gabriel.terceirasemana.sistemasmarttv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        smartTv.MudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.desligar();

        System.out.println("TV ligada? " + smartTv.ligada);
    }
}
