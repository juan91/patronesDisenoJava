package com.patrones.demo.factoryabstract.examplethree.artdecofurniture;

import com.patrones.demo.factoryabstract.examplethree.CoffeTable;

public class ArtDecoCoffeTable implements CoffeTable {
    @Override
    public int numPatas() {
        return 5;
    }

    @Override
    public String color(String color) {
        return color;
    }
}
