package com.conectECI.Model;

import java.sql.Date;

public class Necesidad {
    private String emailUser;
    private int categoryId;
    private String name;
    private String description;
    private String urgencia;
    private Date dateI;
    private String status;
    private Date dateM;
    public Necesidad(String nombre, String description){
        this.name= nombre;
        this.description= description;

    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public Date getDateI() {
        return dateI;
    }

    public void setDateI(Date dateI) {
        this.dateI = dateI;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateM() {
        return dateM;
    }

    public void setDateM(Date dateM) {
        this.dateM = dateM;
    }



}
