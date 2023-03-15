package com.patrones.demo.factoryabstract.examplethree.factories;

import com.patrones.demo.factoryabstract.examplethree.Chair;
import com.patrones.demo.factoryabstract.examplethree.CoffeTable;
import com.patrones.demo.factoryabstract.examplethree.FurnitureFactory;
import com.patrones.demo.factoryabstract.examplethree.Sofa;
import com.patrones.demo.factoryabstract.examplethree.VictorianFurniture.VictorianChair;
import com.patrones.demo.factoryabstract.examplethree.VictorianFurniture.VictorianCoffeTable;
import com.patrones.demo.factoryabstract.examplethree.VictorianFurniture.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
