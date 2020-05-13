package com.bcopstein;

public class ValorInteiro extends ElementoDeExpressao{
    private Integer valor;

    public ValorInteiro(String valor){
        if (Character.isDigit(valor.charAt(0))){
            this.valor = Integer.parseInt(valor);
        }else{
            switch(valor.trim().toLowerCase()){
                case "zero":
                this.valor = 0;
                break;
                case "um":
                this.valor = 1;
                break;
                case "dois":
                this.valor = 2;
                break;
                case "tres":
                this.valor = 3;
                break;
                case "quatro":
                this.valor = 4;
                break;
                case "cinco":
                this.valor = 5;
                break;
                case "seis":
                this.valor = 6;
                break;
                case "sete":
                this.valor = 7;
                break;
                case "oito":
                this.valor = 8;
                break;
                case "nove":
                this.valor = 9;
                break;
                default:
                this.valor = 0;
            }
        }
    }

    @Override
    public Integer valor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor.toString();
    } 
}