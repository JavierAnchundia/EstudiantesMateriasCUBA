package com.company.prueba1.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "PRUEBA1_MATERIA")
@Entity(name = "prueba1_Materia")
public class Materia extends StandardEntity {
    private static final long serialVersionUID = -4458295197154814404L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false, unique = true)
    protected String nombre;

    @NotNull
    @Column(name = "CODIGO", nullable = false, unique = true)
    protected String codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTUDIANTE_ID")
    protected Estudiante estudiante;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}