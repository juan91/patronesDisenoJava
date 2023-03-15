package com.patrones.demo.factory;

public class Samsung implements IMobile {

    @Override
    public void cost() {
        System.out.println("Samsung Cost starts from 6000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Samsung camera capacity starts from 4 MP");
    }

    @Override
    public void batteryPower() {
        System.out.println("Samsung battery power starts from 1200 MAh");
    }
}