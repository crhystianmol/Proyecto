package com.conectECI.DAOS;

import com.conectECI.Model.Categoria;


import java.util.ArrayList;

public interface CategoriaDao {
    public void addCategoria(Categoria categoria);
    public Categoria getCategoria(String email);
    public ArrayList<Categoria> getCategorias();
}
