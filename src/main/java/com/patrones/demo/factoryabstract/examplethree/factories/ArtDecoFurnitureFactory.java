package com.patrones.demo.factoryabstract.examplethree.factories;

import com.patrones.demo.factoryabstract.examplethree.Chair;
import com.patrones.demo.factoryabstract.examplethree.CoffeTable;
import com.patrones.demo.factoryabstract.examplethree.FurnitureFactory;
import com.patrones.demo.factoryabstract.examplethree.Sofa;
import com.patrones.demo.factoryabstract.examplethree.artdecofurniture.ArtDecoChair;
import com.patrones.demo.factoryabstract.examplethree.artdecofurniture.ArtDecoCoffeTable;
import com.patrones.demo.factoryabstract.examplethree.artdecofurniture.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
