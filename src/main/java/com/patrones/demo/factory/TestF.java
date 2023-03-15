package com.patrones.demo.factory;

public class TestF {

    public static void main(String[] args) {
        MobileFactory factory= new MobileFactory();

        var len = factory.createMobile("len");
        len.batteryPower();

        var sam= factory.createMobile("sam");
        sam.cost();
    }

}
