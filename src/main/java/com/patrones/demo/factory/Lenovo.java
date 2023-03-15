package com.patrones.demo.factory;

public class Lenovo implements IMobile {

    @Override
    public void cost() {
        System.out.println("Lenovo Cost starts from 10000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Lenovo camera capacity starts from 10 MP");
    }

    @Override
    public void batteryPower() {
        System.out.println("Lenovo battery power starts from 2500 MAh");
    }
}