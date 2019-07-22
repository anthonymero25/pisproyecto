/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PisProyecto.Componente;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Alberto Mero
 */
@Named(value = "coneccion")
@Dependent
public class Coneccion {
    
        
        Connection Conect = null;

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //String str = "jdbc:mysql://localhost:3306/" + base + "?zeroDateTimeBehavior=convertToNull";
            Conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bancos_preguntas", "root", "root12345");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No hay Conexion!!");
        }
        return Conect;
    }
    
    
}
