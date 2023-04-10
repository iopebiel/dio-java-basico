package edu.gabriel.quintasemana;

public class Carro { //Classe carro
    String cor; //atributos e seu tipo de dado que ele representa.
    String modelo;
    int capacidadeTanque;
//metodo construtor, com o objeto carro vazio, sem informações
    Carro(){

    }


//metodo construtor, com valores iniciais a partir desse método. Uso de sobrecarga. Mesmo nome e parametros diferentes.
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


//metodos set e get

    void setCor(String cor) //setar/colocar um valor no atributo cor
    {
        this.cor = cor;
    }

    String getCor(){ //retornar o valor da cor.
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

//metodos de contrato

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
