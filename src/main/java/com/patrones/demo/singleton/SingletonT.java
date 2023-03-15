package com.patrones.demo.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SingletonT {

	private static SingletonT instance=null; //lazy initialization
	
	private SingletonT(){
		System.out.println("Creating...");
	}
	
	public static SingletonT getInstance(){
		if (instance == null) {
			instance = new SingletonT();
		}
		return instance;
	}
	
	static void useSingleton(){
		SingletonT singleton = SingletonT.getInstance();
		System.out.println("Hashcode of Singleton Object: "+singleton.hashCode());
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(SingletonT::useSingleton);
		service.submit(SingletonT::useSingleton);
		service.shutdown();
	}	
}
