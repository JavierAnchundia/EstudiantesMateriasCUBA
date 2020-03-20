package com.company.prueba1.entity;

public class EstudianteUnic extends Estudiante{
    private static EstudianteUnic ourInstance = new EstudianteUnic("default","default");

    public static EstudianteUnic getInstance()
    {
        if(ourInstance == null){ourInstance = new EstudianteUnic("default","default");}
        return ourInstance;
    }

    private EstudianteUnic(String nombre,String apellido) {
        this.nombre=nombre;
        this.apellido=apellido;
    }
}
