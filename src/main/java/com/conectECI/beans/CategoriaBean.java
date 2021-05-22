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
    private String status;
    private CategoriaService categoriaService;
    private String userEmail;
    private String mensajeUpdate;
    private Categoria categoriaUpdate;



    private String selectedOption;



    public Date getDateI() {
        return dateI;
    }

    public Date getDateM() {
        return dateM;
    }

    public String getStatus() {
        return status;
    }


    public CategoriaBean (){
        categoriaService =super.getInjector().getInstance(CategoriaServiceImpl.class);

    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        this.userEmail= SecurityUtils.getSubject().getPrincipal().toString();
        return categoriaService.getCategorias(userEmail);
    }
    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public void setInfo() throws ConectException, IOException {

        if(nombre != "" ){
            setMensaje("Categoria creada");
            Categoria categoria = new Categoria(nombre,descripcion);
            categoria.setDateI(new Date(System.currentTimeMillis()));
            categoria.setDateM(new Date(System.currentTimeMillis()));
            categoria.setEmailUser(SecurityUtils.getSubject().getPrincipal().toString());
            System.out.print(SecurityUtils.getSubject().getPrincipal().toString());
            categoria.setStatus("Arctivo");
            categoriaService.addCategoria(categoria);


        }
        else{
            setMensaje("Nombre no valido");
        }
        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg4').show();");


    }

    public void seleccion(Categoria categoriaUpdate){
        this.categoriaUpdate=categoriaUpdate;
        this.nombre=categoriaUpdate.getName();
        this.descripcion=categoriaUpdate.getDescription();
        this.userEmail= SecurityUtils.getSubject().getPrincipal().toString();

        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg2').show();");

    }
    public void update(){
         if(nombre != "") {
             categoriaUpdate.setName(nombre);
             categoriaUpdate.setDescription(descripcion);
             categoriaUpdate.setStatus(selectedOption);
             categoriaService.updateCategory(categoriaUpdate);
             mensajeUpdate="Categoria Actualizada (^.^)";

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
