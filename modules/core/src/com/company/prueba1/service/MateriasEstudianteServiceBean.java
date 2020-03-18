package com.company.prueba1.service;

import com.company.prueba1.entity.Estudiante;
import com.company.prueba1.entity.Materia;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.xml.crypto.Data;
import java.util.List;

@Service(MateriasEstudianteService.NAME)
public class MateriasEstudianteServiceBean implements MateriasEstudianteService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<Materia> obtenerMaterias(Estudiante estudiante) {

        List<Materia> materias  = dataManager.load(Materia.class)
                .query("select s from prueba1_Materia s where"+
                        " s.estudiante = :estudiante").parameter("estudiante",estudiante).list();
        return materias;
    }
}