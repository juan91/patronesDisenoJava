package com.patrones.demo.factoryabstract.exampletwo.relacionalrepo;

import com.patrones.demo.factoryabstract.exampletwo.CompraRepository;

public class CompraRelacionalRepository implements CompraRepository {


    @Override
    public String guardaCompra(String compra) {
        return "registro "+compra;
    }
}
