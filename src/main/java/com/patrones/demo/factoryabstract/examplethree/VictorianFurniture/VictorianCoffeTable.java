package com.patrones.demo.factoryabstract.examplethree.VictorianFurniture;

import com.patrones.demo.factoryabstract.examplethree.CoffeTable;

public class VictorianCoffeTable implements CoffeTable {
    @Override
    public int numPatas() {
        return 4;
    }

    @Override
    public String color(String color) {
        return "color Victoria coffe table "+color;
    }


}
