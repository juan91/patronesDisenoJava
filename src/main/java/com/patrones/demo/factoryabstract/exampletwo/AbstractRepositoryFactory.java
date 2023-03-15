package com.patrones.demo.factoryabstract.exampletwo;

public interface AbstractRepositoryFactory {

        CompraRepository getCompraRepository();

        ProductoRepository getProductoRepository();

        UsuarioRepository getUsuarioRepository();


}
