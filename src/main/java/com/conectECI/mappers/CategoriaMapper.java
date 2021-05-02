package com.conectECI.mappers;

import com.conectECI.Model.Categoria;
import org.apache.ibatis.annotations.Param;


import java.sql.Date;
import java.util.ArrayList;

public interface CategoriaMapper {

    public void addCategoria(@Param("name") String name , @Param("description") String description , @Param("dateI")Date dateI, @Param("status") boolean status, @Param("dateM") Date dateM);
    public Categoria getCategoria(String email);
    public ArrayList<Categoria> getCategorias();
}
