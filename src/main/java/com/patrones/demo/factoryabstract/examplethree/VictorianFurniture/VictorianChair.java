package com.patrones.demo.factoryabstract.examplethree.VictorianFurniture;

import com.patrones.demo.factoryabstract.examplethree.Chair;

public class VictorianChair implements Chair {
    @Override
    public int numPatas() {
        return 3;
    }

    @Override
    public String tipoTela() {
        return "victoria tela silla ttt";
    }
}
