package com.patrones.demo.factoryabstract.exampleone;

import com.patrones.demo.factory.Samsung;

public class SamsungMobileFactory extends MobileFactory {

    Samsung createSamsungMobile(){
        return new Samsung();
    }
}