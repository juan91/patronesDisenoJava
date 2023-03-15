package com.patrones.demo.factoryabstract.examplethree.VictorianFurniture;

import com.patrones.demo.factoryabstract.examplethree.Chair;
import com.patrones.demo.factoryabstract.examplethree.Sofa;

public class VictorianSofa implements Sofa {

    @Override
    public int numPatas() {
        return 8;
    }

    @Override
    public String tipoTela() {
        return "victorian tipo tela 44ss";
    }
}
