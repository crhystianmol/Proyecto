package com.conectECI.beans;

import com.conectECI.Model.User;
import com.conectECI.service.Impl.UserServiceImpl;
import com.conectECI.service.UserService;
import com.google.inject.Inject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;

import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.security.BasicPermission;
import java.util.ArrayList;

@ManagedBean(name="userBean")
@SessionScoped
public class UserBeans extends BaseBean {


    private String email;
    private String password;


    private UserService  userService;

    public UserBeans (){
        userService =super.getInjector().getInstance(UserServiceImpl.class);
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void login(){
        try {
            Subject currentUser = SecurityUtils.getSubject();
            String hex = new Sha256Hash(password).toHex();
            System.out.println("password:");
            System.out.println(hex);
            UsernamePasswordToken token = new UsernamePasswordToken(email, hex);
            token.setRememberMe(true);
            currentUser.login(token);
            FacesContext.getCurrentInstance().getExternalContext().redirect("menu.xhtml");
        }
        catch(Exception e) {
            e.printStackTrace();
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Error","Revise sus credenciales, no fue posible iniciar sesión") );

        }
    }
    public void isLogin() throws IOException {
        if(SecurityUtils.getSubject().getPrincipal()!= null){
            FacesContext.getCurrentInstance().getExternalContext().redirect("menu.xhtml");
        }
    }
    public void logout() throws IOException {
        SecurityUtils.getSubject().logout();
        FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<User> getUsers(){
        return userService.getUser();
    }
}
