package com.patrones.demo.factoryabstract.exampleone;

import com.patrones.demo.factory.Lenovo;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        MobileFactory factory= new MobileFactory();
        var lmf= (LenovoMobileFactory)factory.createMobile("lenf");
        Lenovo ln= lmf.createLenovoMobile();
        ln.pictureCapacity();
        ln.batteryPower();

        var dell = (DellPortatilFactory) factory.createMobile("dell");
        var lnd = dell.createportatil();
        lnd.batteryPower();
        lnd.cost();
    }
}
