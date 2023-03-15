package com.patrones.demo.factoryabstract.examplethree.modernfurniture;

import com.patrones.demo.factoryabstract.examplethree.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public int numPatas() {
        return 12;
    }

    @Override
    public String tipoTela() {
        return "moder tela sofa opp";
    }
}
