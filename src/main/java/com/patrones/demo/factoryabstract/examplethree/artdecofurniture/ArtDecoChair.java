package com.patrones.demo.factoryabstract.examplethree.artdecofurniture;

import com.patrones.demo.factoryabstract.examplethree.Chair;

public class ArtDecoChair implements Chair {

    @Override
    public int numPatas() {
        return 4;
    }

    @Override
    public String tipoTela() {
        return "AB";
    }
}
