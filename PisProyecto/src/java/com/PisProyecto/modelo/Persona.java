/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PisProyecto.modelo;

/**
 *
 * @author Luis Alberto Mero
 */
public class Persona {
    private int idpersona ;
    private String persona;
    private String curso;
    private String materia;
    private String rol;
    private String usuario;
    private String contrasenia;
    private int nota_aporte;
    private int nota_examen;

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getNota_aporte() {
        return nota_aporte;
    }

    public void setNota_aporte(int nota_aporte) {
        this.nota_aporte = nota_aporte;
    }

    public int getNota_examen() {
        return nota_examen;
    }

    public void setNota_examen(int nota_examen) {
        this.nota_examen = nota_examen;
    }
    
    
}
