package com.conectECI.Model;

import java.sql.Date;

public class Categoria {
    private String id;
    private String name;
    private String description;
    private Date dateI;
    private boolean status;
    private Date dateM;

    public Categoria(){

    }
    public Categoria(String nombre, String description){
        this.name= nombre;
        this.description= description;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateI() {
        return dateI;
    }

    public void setDateI(Date dateI) {
        this.dateI = dateI;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDateM() {
        return dateM;
    }

    public void setDateM(Date dateM) {
        this.dateM = dateM;
    }


}
