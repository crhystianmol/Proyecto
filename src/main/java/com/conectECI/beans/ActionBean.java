package com.conectECI.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
@ManagedBean(name="actionBean")
@SessionScoped
public class ActionBean {
    public void crearCategoria() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("crearCategoria.xhtml");
    }
    public void actualizarCategoria() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("actualizarCategoria.xhtml");
    }
    public void registrarNecesidad() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("registrarNecesidad.xhtml");
    }
    public void menu() throws IOException {
        System.out.println("menu");
        FacesContext.getCurrentInstance().getExternalContext().redirect("menu.xhtml");
    }

}