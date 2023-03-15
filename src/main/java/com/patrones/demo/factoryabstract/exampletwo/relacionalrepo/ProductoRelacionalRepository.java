package com.patrones.demo.factoryabstract.exampletwo.relacionalrepo;

import com.patrones.demo.factoryabstract.exampletwo.ProductoRepository;

public class ProductoRelacionalRepository implements ProductoRepository {
    @Override
    public String guardaProducto(String producto) {
        return String.format("producto %s se guardo", producto);
    }
}
