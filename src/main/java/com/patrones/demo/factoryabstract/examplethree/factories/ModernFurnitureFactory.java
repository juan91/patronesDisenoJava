package com.patrones.demo.factoryabstract.examplethree.factories;

import com.patrones.demo.factoryabstract.examplethree.Chair;
import com.patrones.demo.factoryabstract.examplethree.CoffeTable;
import com.patrones.demo.factoryabstract.examplethree.FurnitureFactory;
import com.patrones.demo.factoryabstract.examplethree.Sofa;
import com.patrones.demo.factoryabstract.examplethree.modernfurniture.ModernChair;
import com.patrones.demo.factoryabstract.examplethree.modernfurniture.ModernCoffeTable;
import com.patrones.demo.factoryabstract.examplethree.modernfurniture.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
