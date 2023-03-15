package com.patrones.demo.factoryabstract.examplethree;

import com.patrones.demo.factoryabstract.examplethree.FurnitureFactory;

public class Aplication {


    private FurnitureFactory furnitureFactory;

    public Aplication(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public FurnitureFactory getFurnitureFactory() {
        return furnitureFactory;
    }


}
