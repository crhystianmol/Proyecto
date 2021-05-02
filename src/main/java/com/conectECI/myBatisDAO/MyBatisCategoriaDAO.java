package com.conectECI.myBatisDAO;

import com.conectECI.DAOS.CategoriaDao;

import com.conectECI.Model.Categoria;

import com.conectECI.mappers.CategoriaMapper;

import com.google.inject.Inject;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.ArrayList;

public class MyBatisCategoriaDAO implements CategoriaDao {
    @Inject
    private CategoriaMapper mapper;
    public MyBatisCategoriaDAO(){
        System.out.println("creo MyBatis");
    }
    public void addCategoria(Categoria categoria) {
        mapper.addCategoria(categoria.getName(),categoria.getDescription(),categoria.getDateI(),categoria.getStatus(),categoria.getDateM());
    }

    public Categoria getCategoria(String email) {
        return null;
    }

    @Override
    public ArrayList<Categoria> getCategorias() {
        return null;
    }

    public ArrayList<Categoria> getCategoria() {
        return mapper.getCategorias();
    }
}