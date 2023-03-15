package com.patrones.demo.singleton;

public class SingletonClonable implements Cloneable{

    public static SingletonClonable instance= new SingletonClonable();

    private SingletonClonable() {
        System.out.println("creating instance.....");
    }

    public static SingletonClonable getInstance() {
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException {
    	if(instance != null) { // si alguien quiere clonar la clase, se valida si ya existe la instancia de esta
			throw new CloneNotSupportedException("Can't create instance. Please use getInsance() to create it.");
		}
        return super.clone();
    }

    public static void main(String[] args) throws Exception{
        SingletonClonable s1 = SingletonClonable.getInstance();
        SingletonClonable s2 = SingletonClonable.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

        SingletonClonable s3 = (SingletonClonable) s2.clone();
        System.out.println("Hashcode of Object s3: " +s3.hashCode());

    }
}