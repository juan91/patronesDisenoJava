package com.patrones.demo.factoryabstract.examplethree;

import com.patrones.demo.factoryabstract.examplethree.factories.ArtDecoFurnitureFactory;
import com.patrones.demo.factoryabstract.examplethree.factories.ModernFurnitureFactory;
import com.patrones.demo.factoryabstract.examplethree.factories.VictorianFurnitureFactory;

public class TestFactFurniture {


    public static void main(String[] args) {
       var chairV = new Aplication(new VictorianFurnitureFactory());
       System.out.println(chairV.getFurnitureFactory().createChair().numPatas());
        System.out.println(chairV.getFurnitureFactory().createChair().tipoTela());

        var chairMod = new Aplication(new ModernFurnitureFactory());
        System.out.println(chairMod.getFurnitureFactory().createChair().tipoTela());
        System.out.println(chairMod.getFurnitureFactory().createSofa().tipoTela());
        System.out.println(chairMod.getFurnitureFactory().createCoffeTable().color("red"));


    }

}
