package com.patrones.demo.factoryabstract.exampleone;

public class DellPortatilFactory extends MobileFactory{

    Dell createportatil() {
        return new Dell();
    }
}
