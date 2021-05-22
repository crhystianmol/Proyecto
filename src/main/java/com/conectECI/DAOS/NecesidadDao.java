package com.conectECI.DAOS;

import com.conectECI.Model.Necesidad;
import com.conectECI.Model.User;

import java.util.ArrayList;

public interface NecesidadDao {
    public void addNecesidad(Necesidad necesidad);

    public ArrayList<Necesidad> getNecesidad(String email);
}
