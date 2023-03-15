package com.patrones.demo.factoryabstract.exampletwo.mongorepo;

import com.patrones.demo.factoryabstract.exampletwo.UsuarioRepository;

public class UsuarioMongoRepository implements UsuarioRepository {


    @Override
    public String guardaUsuario(String usuario) {
        return String.format("usuario %s se guardo", usuario);
    }
}
