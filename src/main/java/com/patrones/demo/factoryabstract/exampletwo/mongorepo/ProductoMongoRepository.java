package com.patrones.demo.factoryabstract.exampletwo.mongorepo;

import com.patrones.demo.factoryabstract.exampletwo.ProductoRepository;

public class ProductoMongoRepository implements ProductoRepository {
    @Override
    public String guardaProducto(String producto) {
        return String.format("producto %s se guardo", producto);
    }
}
