package com.patrones.demo.factoryabstract.exampletwo;

public class Main {

    public static void main(String [] arg) {

        var dbImpĺ = RepositoryFactoryMaker.getRepositoryFactory(TipoRepository.MONGO_DB);

        System.out.println(dbImpĺ.getCompraRepository().guardaCompra("movil"));

    }

}
