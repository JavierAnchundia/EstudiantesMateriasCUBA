package com.company.prueba1.service;

import com.company.prueba1.entity.Estudiante;
import com.company.prueba1.entity.EstudianteUnic;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(ObtenerEstudianteService.NAME)
public class ObtenerEstudianteServiceBean implements ObtenerEstudianteService {

    @Inject
    private DataManager dataManager;

    @Override
    public Estudiante obtenerEstudiante() {
        String nombre = "default";
        List<Estudiante> estudiantes =  dataManager.load(Estudiante.class)
                .query("select s from prueba1_Estudiante s where"+
                        " s.nombre = :nombre").parameter("nombre",nombre).list();

        if (estudiantes.size()>0) {return estudiantes.get(0);}

        System.out.println("No se pudo obtener dicho estudiante");
        return null;
    }
}