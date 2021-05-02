package com.conectECI.beans;


import com.conectECI.Exception.ConectException;
import com.conectECI.Model.Categoria;
import com.conectECI.service.CategoriaService;
import com.conectECI.service.Impl.CategoriaServiceImpl;
import com.conectECI.service.UserService;
import org.apache.shiro.SecurityUtils;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.sql.Date;

@ManagedBean(name="categoriaBean")
@SessionScoped
public class CategoriaBean extends BaseBean {



    private String nombre;
    private String descripcion;
    private String mensaje;
    private Date dateI;
    private Date dateM;
    private boolean status;
    private CategoriaService categoriaService;

    public Date getDateI() {
        return dateI;
    }

    public Date getDateM() {
        return dateM;
    }

    public boolean isStatus() {
        return status;
    }


    public CategoriaBean (){
        categoriaService =super.getInjector().getInstance(CategoriaServiceImpl.class);

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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



    public void setInfo() throws ConectException {
        if(nombre != ""){
            Categoria categoria = new Categoria(nombre,descripcion);
            categoria.setDateI(new Date(System.currentTimeMillis()));
            categoria.setDateM(new Date(System.currentTimeMillis()));
            categoria.setStatus(true);
            categoriaService.addCategoria(categoria);
            mensaje="Categoria creada";
        }
        mensaje="Nombre no valido";

    }

}
