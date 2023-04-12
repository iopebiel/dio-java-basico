package edu.gabriel.quintasemana.Interface;


public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Resultado da soma: "+(operando1+operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Resultado da subtração: "+(operando1-operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Resultado da multiplação: "+operando1*operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Resultado da divisão: "+operando1/operando2);
    }
}
