package com.patrones.demo.factoryabstract.exampleone;

import com.patrones.demo.factory.Lenovo;

public class LenovoMobileFactory extends MobileFactory {

    Lenovo createLenovoMobile(){
        return new Lenovo();
    }
}