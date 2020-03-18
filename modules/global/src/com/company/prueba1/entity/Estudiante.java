package com.company.prueba1.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PRUEBA1_ESTUDIANTE")
@Entity(name = "prueba1_Estudiante")
public class Estudiante extends StandardEntity {
    private static final long serialVersionUID = 8831691915023154582L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    protected String nombre;

    @Column(name = "APELLIDO")
    protected String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}