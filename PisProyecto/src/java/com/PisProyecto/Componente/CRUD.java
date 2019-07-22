/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PisProyecto.Componente;

import com.PisProyecto.modelo.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Alberto Mero
 */
public class CRUD {
    Coneccion c = new Coneccion();
    Connection conect = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps;
    Coneccion con = new Coneccion();
    
    
    public String Iniciar_sesion(Persona per) {
        String valor = null;
        System.out.println("kk");
        try {
            conect = con.Conexion();
            conect.setAutoCommit(false);
            CallableStatement pro = conect.prepareCall(
                    "{ call persona_general(?,?,?) }");
            pro.setString(1, per.getUsuario());
            pro.setString(2, per.getContrasenia());
            pro.registerOutParameter("salida", Types.VARCHAR);
//            pro.executeUpdate();
            pro.execute();
            valor = pro.getString("salida");
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
    
}
