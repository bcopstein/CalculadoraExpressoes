package com.bcopstein;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ElementoDeExpressaoTest {
    @ParameterizedTest
    @CsvSource({"5+4-2+3,10","5+4-2+3-8+4,6","8*3-4,20","9*4/2,18"})
    public void testaExpressoes(String expressao,int rEsp){
        ElementoDeExpressao exp = Calculadora.avalia(expressao);
        assertEquals(rEsp, exp.valor(),0.0001);
    }
    
}