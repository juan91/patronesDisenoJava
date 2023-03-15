package com.patrones.demo.factoryabstract.exampletwo.relacionalrepo;

import com.patrones.demo.factoryabstract.exampletwo.UsuarioRepository;

public class UsuarioRelacionalRepository implements UsuarioRepository {


    @Override
    public String guardaUsuario(String usuario) {
        return String.format("usuario %s se guardo", usuario);
    }
}
