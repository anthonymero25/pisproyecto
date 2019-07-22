/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PisProyecto.Controlador;

import com.PisProyecto.Componente.CRUD;
import com.PisProyecto.Componente.Coneccion;
import com.PisProyecto.modelo.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Luis Alberto Mero
 */
@Named(value = "loginBean")
@ApplicationScoped
public class LoginBean {

  private Persona perosna = new Persona();
  

    public Persona getPerosna() {
        return perosna;
    }

    public void setPerosna(Persona perosna) {
        this.perosna = perosna;
    }
  
    
    public void login(){
        CRUD cr;
        System.out.println("hola");
        try {
            cr = new CRUD();
//            cr.Iniciar_sesion(perosna);
            String a = cr.Iniciar_sesion(perosna);
            System.out.println("a :"+a);
        } catch (Exception e) {
            throw e;
        }
    }
    
    }
