package com.patrones.demo.factoryabstract.exampletwo.mongorepo;

import com.patrones.demo.factoryabstract.exampletwo.CompraRepository;

public class CompraMongoRepository implements CompraRepository {


    @Override
    public String guardaCompra(String compra) {
        return "resitro "+compra;
    }
}
