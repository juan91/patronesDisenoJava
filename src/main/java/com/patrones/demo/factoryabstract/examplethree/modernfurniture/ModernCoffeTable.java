package com.patrones.demo.factoryabstract.examplethree.modernfurniture;

import com.patrones.demo.factoryabstract.examplethree.CoffeTable;

public class ModernCoffeTable implements CoffeTable {

    @Override
    public int numPatas() {
        return 5;
    }

    @Override
    public String color(String color) {
        return color;
    }
}
