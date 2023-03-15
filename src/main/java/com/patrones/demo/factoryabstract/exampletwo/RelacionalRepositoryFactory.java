package com.patrones.demo.factoryabstract.exampletwo;

import com.patrones.demo.factoryabstract.exampletwo.relacionalrepo.*;

public class RelacionalRepositoryFactory implements AbstractRepositoryFactory {
    @Override
    public CompraRepository getCompraRepository() {
        return new CompraRelacionalRepository();
    }

    @Override
    public ProductoRepository getProductoRepository() {
        return new ProductoRelacionalRepository();
    }

    @Override
    public UsuarioRepository getUsuarioRepository() {
        return new UsuarioRelacionalRepository();
    }
}