package com.company.prueba1.service;

import com.company.prueba1.entity.Estudiante;
import com.company.prueba1.entity.Materia;

import java.util.List;

public interface MateriasEstudianteService {
    String NAME = "prueba1_MateriasEstudianteService";
    List<Materia> obtenerMaterias(Estudiante e);
    Boolean anadirMaterias(Materia materia,Estudiante e);
}