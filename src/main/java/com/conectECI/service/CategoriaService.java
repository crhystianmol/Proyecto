package com.conectECI.service;

import com.conectECI.Exception.ConectException;
import com.conectECI.Model.Categoria;
import com.conectECI.Model.User;

import java.util.ArrayList;

public interface CategoriaService {
    public void addCategoria(Categoria categoria) throws ConectException;
    public Categoria getCategoria(String email);
    public ArrayList<Categoria> getCategorias(String emailUser);
    public void updateCategory(Categoria categoria);
}
