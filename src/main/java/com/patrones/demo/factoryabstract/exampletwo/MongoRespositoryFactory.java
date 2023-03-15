package com.patrones.demo.factoryabstract.exampletwo;

import com.patrones.demo.factoryabstract.exampletwo.mongorepo.CompraMongoRepository;
import com.patrones.demo.factoryabstract.exampletwo.mongorepo.ProductoMongoRepository;
import com.patrones.demo.factoryabstract.exampletwo.mongorepo.UsuarioMongoRepository;

public class MongoRespositoryFactory implements AbstractRepositoryFactory {
    @Override
    public CompraRepository getCompraRepository() {
        return new CompraMongoRepository();
    }

    @Override
    public ProductoRepository getProductoRepository() {
        return new ProductoMongoRepository();
    }

    @Override
    public UsuarioRepository getUsuarioRepository() {
        return new UsuarioMongoRepository();
    }
}