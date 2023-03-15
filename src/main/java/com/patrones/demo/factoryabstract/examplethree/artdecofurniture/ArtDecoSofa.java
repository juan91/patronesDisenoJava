package com.patrones.demo.factoryabstract.examplethree.artdecofurniture;

import com.patrones.demo.factoryabstract.examplethree.Sofa;

public class ArtDecoSofa implements Sofa {

    @Override
    public int numPatas() {
        return 2;
    }

    @Override
    public String tipoTela() {
        return "artdeco tipo tela asdv";
    }
}
