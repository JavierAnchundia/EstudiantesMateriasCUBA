package com.company.prueba1.web.screens.estudiante;

import com.company.prueba1.web.screens.NewScreen;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.prueba1.entity.Estudiante;

import javax.inject.Inject;

@UiController("prueba1_Estudiante.browse")
@UiDescriptor("estudiante-browse.xml")
@LookupComponent("estudiantesTable")
@LoadDataBeforeShow
public class EstudianteBrowse extends StandardLookup<Estudiante> {

    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private Screens screens;
    @Inject
    private GroupTable<Estudiante> estudiantesTable;
    @Inject
    private Notifications notifications;


    @Subscribe("verMaterias")
    public void onVerMateriasClick(Button.ClickEvent event) {
        NewScreen screen = screens.create(NewScreen.class);
        if(estudiantesTable.getSingleSelected()==null){
            notifications.create(Notifications.NotificationType.WARNING)
            .withCaption("Por favor seleccione primero un Estudiante para ver sus Materias").show();
        }
        else{
        screen.setEstudiante(estudiantesTable.getSingleSelected());
        System.out.println(estudiantesTable.getSingleSelected().getNombre()+
                estudiantesTable.getSingleSelected().getApellido());
        screens.show(screen);}
    }




}