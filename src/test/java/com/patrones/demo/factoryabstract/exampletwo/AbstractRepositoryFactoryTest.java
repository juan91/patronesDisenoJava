package com.patrones.demo.factoryabstract.exampletwo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AbstractRepositoryFactoryTest {

    @Test
    public void testRelacionalRepository_cuandoTipoEsRelacional() {
        AbstractRepositoryFactory repositoryFactory = RepositoryFactoryMaker.getRepositoryFactory(TipoRepository.RELACIONAL);

        CompraRepository compraRepository = repositoryFactory.getCompraRepository();
        ProductoRepository productoRepository = repositoryFactory.getProductoRepository();
        UsuarioRepository usuarioRepository = repositoryFactory.getUsuarioRepository();

        Assertions.assertThat(compraRepository.guardaCompra("compra sencilla")).isEqualTo("Guardando compra sencilla en una base de datos relacional");
        Assertions.assertThat(productoRepository.guardaProducto("producto elegante")).isEqualTo("Guardando producto elegante en una base de datos relacional");
        Assertions.assertThat(usuarioRepository.guardaUsuario("usuario importante")).isEqualTo("Guardando usuario importante en una base de datos relacional");
    }
}