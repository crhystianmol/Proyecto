package com.conectECI.service.Impl;

import com.conectECI.DAOS.CategoriaDao;
import com.conectECI.Exception.ConectException;
import com.conectECI.Model.Categoria;
import com.conectECI.Model.User;
import com.conectECI.service.CategoriaService;
import com.google.inject.Inject;

import java.util.ArrayList;

public class CategoriaServiceImpl implements CategoriaService {
    @Inject
    private CategoriaDao categoriaDao;
    public void addCategoria(Categoria categoria) throws ConectException {
        categoriaDao.addCategoria(categoria);
    }


    public Categoria getCategoria(String email) {
        return null;
    }


    public ArrayList<Categoria> getUser() {
        return null;
    }
}
