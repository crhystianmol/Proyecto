package com.conectECI.myBatisDAO;

import com.conectECI.DAOS.NecesidadDao;
import com.conectECI.Model.Necesidad;
import com.conectECI.mappers.NecesidadMapper;
import com.conectECI.mappers.UserMapper;
import com.google.inject.Inject;

import java.util.ArrayList;

public class MyBatisNecesidadDAO implements NecesidadDao {
    @Inject
    private NecesidadMapper mapper;
    @Override
    public void addNecesidad(Necesidad necesidad) {
    mapper.addNecesidad(necesidad.getEmailUser(),necesidad.getCategoryId(),necesidad.getName(),necesidad.getDescription(),necesidad.getDateI(),necesidad.getStatus(),necesidad.getDateM(),necesidad.getUrgencia());
    }

    @Override
    public ArrayList<Necesidad> getNecesidad(String email) {
        return mapper.getNecesidad(email);
    }




}
