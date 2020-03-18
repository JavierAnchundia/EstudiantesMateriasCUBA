package com.company.prueba1.web.screens;

import com.company.prueba1.entity.Estudiante;
import com.company.prueba1.entity.Materia;
//import com.company.prueba1.service.MateriasEstudianteService;
import com.company.prueba1.service.MateriasEstudianteService;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.components.Button;


import javax.inject.Inject;
import java.util.List;

@UiController("prueba1_NewScreen")
@UiDescriptor("new-screen.xml")
@DialogMode(forceDialog = true, width = "900px", height = "800px")
public class NewScreen extends Screen {


    @Inject
    private TextArea<String> viewMaterias;
    @Inject
    private MateriasEstudianteService materiasEstudianteService;

    private Estudiante estudiante;

    public NewScreen(){}
    public NewScreen (Estudiante estudiante){
        this.estudiante=estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        String info="";
        if (estudiante == null) System.out.println("No se puede mostrar");
        else {
            List<Materia> materias = materiasEstudianteService.obtenerMaterias(estudiante);
            if(materias.size()==0) {info="Este estudiante no tiene materias registradas";}
            else{ for(Materia materia: materias){info=info + materia.getNombre();}}

            viewMaterias.setValue(info);

        }

    }


    @Subscribe("anadirMaterias")
    public void onAnadirMateriasClick(Button.ClickEvent event) {

    }



    
}