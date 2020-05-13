package com.bcopstein;

public class App{
    public static void main(String[] args){
        ElementoDeExpressao exp;
        exp = Calculadora.avalia("5+4-2+3");
        System.out.println(exp.toString()+" = "+exp.valor());
        exp = Calculadora.avalia("5+4-2+3-8+4");
        System.out.println(exp.toString()+" = "+exp.valor());
        exp = Calculadora.avalia("5*4+5");
        System.out.println(exp.toString()+" = "+exp.valor());
        exp = Calculadora.avalia("5*4+4/2");
        System.out.println(exp.toString()+" = "+exp.valor());
        exp = Calculadora.avalia("sete*nove+4/dois-oito*5");
        System.out.println(exp.toString()+" = "+exp.valor());
    }
}