package com.conectECI.mappers;

import com.conectECI.Model.Categoria;
import com.conectECI.Model.Necesidad;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.ArrayList;

public interface NecesidadMapper {
    public void addNecesidad(@Param("emailUser") String emailUser,@Param("categoryId") int categoryId, @Param("name") String name , @Param("description") String description ,  @Param("dateI") Date dateI, @Param("status") String status, @Param("dateM") Date dateM, @Param("urgencia") String urgencia);

    public ArrayList<Necesidad> getNecesidad(String userEmail);
    //public void updateCategory(@Param("id") int id, @Param("name") String name , @Param("description") String description ,@Param("emailUser") String emailUser, @Param("status") String status, @Param("dateM") Date dateM);
}