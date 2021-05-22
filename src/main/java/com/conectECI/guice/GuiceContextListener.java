package com.conectECI.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.conectECI.DAOS.CategoriaDao;
import com.conectECI.DAOS.NecesidadDao;
import com.conectECI.DAOS.UserDao;
import com.conectECI.myBatisDAO.MyBatisCategoriaDAO;
import com.conectECI.myBatisDAO.MyBatisNecesidadDAO;
import com.conectECI.myBatisDAO.MyBatisUserDAO;
import com.conectECI.service.CategoriaService;
import com.conectECI.service.Impl.CategoriaServiceImpl;
import com.conectECI.service.Impl.NecesidadServiceImpl;
import com.conectECI.service.Impl.UserServiceImpl;
import com.conectECI.service.NecesidadService;
import com.conectECI.service.UserService;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;



import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");

                // TODO Add service class associated to Stub implementation
                bind(UserService.class).to(UserServiceImpl.class);
                bind(UserDao.class).to(MyBatisUserDAO.class);
                bind(CategoriaService.class).to(CategoriaServiceImpl.class);
                bind(CategoriaDao.class).to(MyBatisCategoriaDAO.class);
                bind(NecesidadService.class).to(NecesidadServiceImpl.class);
                bind(NecesidadDao.class).to(MyBatisNecesidadDAO.class);
                //faltan mas bind
            }
        });

        servletContextEvent.getServletContext().setAttribute(Injector.class.getName(), injector);
    }
}