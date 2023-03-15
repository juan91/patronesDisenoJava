package com.patrones.demo.factoryabstract.examplethree.modernfurniture;

import com.patrones.demo.factoryabstract.examplethree.Chair;

public class ModernChair implements Chair {

    @Override
    public int numPatas() {
        return 5;
    }

    @Override
    public String tipoTela() {
        return "tela modern silla axz";
    }
}
