package com.conectECI.beans;
import com.conectECI.Exception.ConectException;
import com.conectECI.Model.Categoria;
import com.conectECI.Model.Necesidad;
import com.conectECI.service.Impl.CategoriaServiceImpl;
import com.conectECI.service.Impl.NecesidadServiceImpl;
import com.conectECI.service.NecesidadService;
import org.apache.shiro.SecurityUtils;
import org.primefaces.PrimeFaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.IOException;
import java.sql.Date;

@ManagedBean(name="necesidadBean")
@SessionScoped
public class NecesidadBean extends BaseBean{
    private Necesidad necesidadUpdate;
    private String id;
    private String nombre;
    private int categoriaId;
    private String descripcion;
    private String mensaje;
    private Date dateI;
    private Date dateM;
    private String status;
    private String urgencia;
    private NecesidadService necesidadService;
    private String userEmail;
    private String mensajeUpdate;
    private int numberSoli;
    private String selectedOption;
    private String selectUrgencia;
    public String getSelectUrgencia() {
        return selectUrgencia;
    }
    public NecesidadBean (){
        necesidadService =super.getInjector().getInstance(NecesidadServiceImpl.class);

    }

    public void setSelectUrgencia(String selectUrgencia) {
        this.selectUrgencia = selectUrgencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getDateI() {
        return dateI;
    }

    public void setDateI(Date dateI) {
        this.dateI = dateI;
    }

    public Date getDateM() {
        return dateM;
    }

    public void setDateM(Date dateM) {
        this.dateM = dateM;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getMensajeUpdate() {
        return mensajeUpdate;
    }

    public void setMensajeUpdate(String mensajeUpdate) {
        this.mensajeUpdate = mensajeUpdate;
    }

    public int getNumberSoli() {
        return numberSoli;
    }

    public void setNumberSoli(int numberSoli) {
        this.numberSoli = numberSoli;
    }
    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }


    public void setInfo() throws ConectException, IOException {



        if(nombre != "" ){
            Necesidad necesidad = new Necesidad(nombre,descripcion);
            necesidad.setDateI(new Date(System.currentTimeMillis()));
            necesidad.setDateM(new Date(System.currentTimeMillis()));
            necesidad.setEmailUser(SecurityUtils.getSubject().getPrincipal().toString());
            necesidad.setStatus("Activo");
            necesidad.setUrgencia(selectedOption);
            setMensaje("Necesidad creada");
            necesidadService.addNecesidad(necesidad);

        }
        else{
            setMensaje("Nombre no valido");

        }
        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg5').hide();");
        PrimeFaces current1 = PrimeFaces.current();
        current1.executeScript("PF('dlg6').show();");


    }

    public void seleccion(Categoria categoriaUpdate){
        this.categoriaId=categoriaUpdate.getId();
        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg5').show();");

    }



}
