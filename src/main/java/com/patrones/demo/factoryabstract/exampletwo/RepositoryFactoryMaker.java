package com.patrones.demo.factoryabstract.exampletwo;

public class RepositoryFactoryMaker {
    public static AbstractRepositoryFactory getRepositoryFactory(TipoRepository tipo) {
        if (TipoRepository.MONGO_DB.equals(tipo)) {
            return new MongoRespositoryFactory();
        }
        return new RelacionalRepositoryFactory();
    }
}