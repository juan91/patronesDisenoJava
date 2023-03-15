package com.patrones.demo.factoryabstract.exampleone;

public interface IMobileFactory {

    IMobileFactory createMobile(String type);
}