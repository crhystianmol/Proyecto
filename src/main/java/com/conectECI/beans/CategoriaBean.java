package com.conectECI.beans;


import com.conectECI.Exception.ConectException;
import com.conectECI.Model.Categoria;
import com.conectECI.Model.User;
import com.conectECI.service.CategoriaService;
import com.conectECI.service.Impl.CategoriaServiceImpl;
import com.conectECI.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.primefaces.PrimeFaces;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

@ManagedBean(name="categoriaBean")
@SessionScoped
public class CategoriaBean extends BaseBean {

    private String id;
    private String nombre;
    private String descripcion;
    private String mensaje;
    private Date dateI;
    private Date dateM;
    private boolean status;
    private String rta;
    private CategoriaService categoriaService;
    private String mensajeUpdate;
    private Categoria categoriaUpdate;



    public Date getDateI() {
        return dateI;
    }

    public Date getDateM() {
        return dateM;
    }

    public boolean getStatus() {
        return status;
    }


    public CategoriaBean (){
        categoriaService =super.getInjector().getInstance(CategoriaServiceImpl.class);

    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRta(String rta) {
        this.rta = rta;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getMensaje() {
        return mensaje;
    }
    public String getMensajeUpdate() {
        return mensajeUpdate;
    }
    public ArrayList<Categoria> getCategorias(){
        return categoriaService.getCategorias();
    }
    public void checkStatus(){
        if (rta=="true"){
            status=true;
        }else if(rta=="false"){
            status=false;
        }else{
            rta="";
        }
    }

    public void setInfo() throws ConectException, IOException {

        if(nombre != "" ){
            Categoria categoria = new Categoria(nombre,descripcion);
            categoria.setDateI(new Date(System.currentTimeMillis()));
            categoria.setDateM(new Date(System.currentTimeMillis()));
            categoria.setStatus(true);
            categoriaService.addCategoria(categoria);
            mensaje="Categoria creada";

        }
        else{
            mensaje="Nombre no valido";
        }
        FacesContext.getCurrentInstance().getExternalContext().redirect("crearCategoria.xhtml");

    }

    public void seleccion(Categoria categoriaUpdate){
        this.categoriaUpdate=categoriaUpdate;
        this.nombre=categoriaUpdate.getName();
        this.descripcion=categoriaUpdate.getDescription();
        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg2').show();");

    }
    public void update(){
         if(nombre != "") {
             categoriaUpdate.setName(nombre);
             categoriaUpdate.setDescription(descripcion);
             categoriaService.updateCategory(categoriaUpdate);
             mensajeUpdate = "Categoria Actualizada";
             PrimeFaces current = PrimeFaces.current();
             current.executeScript("PF('dlg2').hide();");
         }
         else{
             mensajeUpdate="Informacion Errada (^.^) ";
         }
        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg3').show();");

    }

}
