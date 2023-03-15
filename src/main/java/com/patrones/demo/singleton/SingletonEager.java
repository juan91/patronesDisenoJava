package com.patrones.demo.singleton;

public class SingletonEager {


    public static SingletonEager singletonEa= new SingletonEager();

    private SingletonEager(){
        System.out.println("creating instance.....");
        if (singletonEa != null) { //con esto no permitimos violar singleton através  inflexion
            throw new RuntimeException("no puede crear una nueva instancia, utilice getInstance()");
        }
    }

    public static SingletonEager getInstance() {
        return singletonEa;
    }

}
