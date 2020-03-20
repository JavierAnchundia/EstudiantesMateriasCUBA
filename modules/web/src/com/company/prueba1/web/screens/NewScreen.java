package com.company.prueba1.web.screens;

import com.company.prueba1.entity.Estudiante;
import com.company.prueba1.entity.Materia;
//import com.company.prueba1.service.MateriasEstudianteService;
import com.company.prueba1.service.MateriasEstudianteService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.data.TableItems;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;


import javax.inject.Inject;
import java.util.List;

@UiController("prueba1_NewScreen")
@UiDescriptor("new-screen.xml")
@DialogMode(forceDialog = true, width = "900px", height = "800px")
@EditedEntityContainer("emateriaDc")
@LoadDataBeforeShow
public class NewScreen extends StandardLookup<Materia> {


    @Inject
    private DataManager dataManager;
    @Inject
    private TextArea<String> viewMaterias;
   @Inject
    private GroupTable<Materia> materiasTable;
    @Inject
    private MateriasEstudianteService materiasEstudianteService;
    @Inject
    private CollectionLoader<Materia> materiasDl;
    @Inject
    private Notifications notifications;

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
        mostrarMateriasEstudiante();
    }


    @Subscribe("anadirMaterias")
    public void onAnadirMateriasClick(Button.ClickEvent event) {
        Materia materia = materiasTable.getSingleSelected();
        if(materia==null){
            notifications.create(Notifications.NotificationType.WARNING)
                    .withCaption("Por favor seleccione primero una Materia que desee anadir").show();
            System.out.println(estudiante.getNombre());
        }
        else{
            System.out.println(materia.getNombre()+ " " +
                    materia.getId());
            System.out.println(estudiante.getId() + " " + estudiante.getNombre());
            /*Estudiante estudiante2 = dataManager.getReference(Estudiante.class,estudiante.getId());
            materia.setEstudiante(estudiante2);
            dataManager.commit(materia);*/
            materiasEstudianteService.anadirMaterias(materiasTable.getSingleSelected(),estudiante);
            getScreenData().loadAll();

        }
    }

    private void mostrarMateriasEstudiante(){
        String info="";
        if (estudiante == null) System.out.println("No se puede mostrar");
        else {
            List<Materia> materias = materiasEstudianteService.obtenerMaterias(estudiante);
            if(materias.size()==0) {info="Este estudiante no tiene materias registradas";}
            else{ for(Materia materia: materias){info=info + materia.getNombre();}}

            viewMaterias.setValue(info);

        }
    }



    private void mostrarMateriasDisponibles(){

}



    
}