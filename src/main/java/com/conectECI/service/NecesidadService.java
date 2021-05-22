package com.conectECI.service;

import com.conectECI.Exception.ConectException;
import com.conectECI.Model.Categoria;
import com.conectECI.Model.Necesidad;

import java.util.ArrayList;

public interface NecesidadService {
    public void addNecesidad(Necesidad necesidad) throws ConectException;
    public ArrayList<Necesidad> getNecesidad(String emailUser);
    public void updateNecesidad(Necesidad necesidad);
}
