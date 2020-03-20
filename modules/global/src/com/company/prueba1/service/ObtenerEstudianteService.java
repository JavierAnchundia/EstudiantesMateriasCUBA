package com.company.prueba1.service;

import com.company.prueba1.entity.Estudiante;

public interface ObtenerEstudianteService {
    String NAME = "prueba1_ObtenerEstudianteService";

    public Estudiante obtenerEstudiante();
}