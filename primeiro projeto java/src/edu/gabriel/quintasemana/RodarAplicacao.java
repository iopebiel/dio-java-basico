package edu.gabriel.quintasemana;

public class RodarAplicacao {
    
    public static void main(String[] args) { //Metodo Executavel.
        Carro carro1 = new Carro(); //construtor padrão a partir do objeto vazio

        //Usando o construtor padrão e depois colocando valores nele.

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59); 
        
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));
        
        //Uso da sobrecarga no método construtor. Note que ão há uso dos gets, pois está tudo dentro do método construtor.

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

        
    }
}
