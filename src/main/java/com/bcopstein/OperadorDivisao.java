package com.bcopstein;

public class OperadorDivisao extends OperadorBinario {
    private String rep;

    public OperadorDivisao(ElementoDeExpressao opEsq, ElementoDeExpressao opDir) {
        super(opEsq, opDir);
        rep = opEsq.toString() + " / " + opDir.toString();
    }

    @Override
    public Integer valor() {
        return getOpEsq().valor() / getOpDir().valor();
    }

    @Override
    public String toString() {
        return rep;
    }
}
