package com.patrones.demo.factoryabstract.exampleone;

import com.patrones.demo.factory.IMobile;

public class Dell implements IMobile {
    @Override
    public void cost() {
        System.out.println("cost 20000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("100GB");
    }

    @Override
    public void batteryPower() {
        System.out.println("1000 MAp");
    }
}
