package com.conectECI.service.Impl;

import com.conectECI.DAOS.CategoriaDao;
import com.conectECI.DAOS.NecesidadDao;
import com.conectECI.Exception.ConectException;
import com.conectECI.Model.Necesidad;
import com.conectECI.service.NecesidadService;
import com.google.inject.Inject;

import java.util.ArrayList;

public class NecesidadServiceImpl implements NecesidadService {
    @Inject
    private NecesidadDao necesidadDao;

    @Override
    public void addNecesidad(Necesidad necesidad) throws ConectException {

    }

    @Override
    public ArrayList<Necesidad> getNecesidad(String emailUser) {
        return necesidadDao.getNecesidad(emailUser);
    }

    @Override
    public void updateNecesidad(Necesidad necesidad) {

    }
}
