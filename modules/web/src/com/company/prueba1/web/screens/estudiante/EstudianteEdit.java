package com.company.prueba1.web.screens.estudiante;

import com.haulmont.cuba.gui.screen.*;
import com.company.prueba1.entity.Estudiante;

@UiController("prueba1_Estudiante.edit")
@UiDescriptor("estudiante-edit.xml")
@EditedEntityContainer("estudianteDc")
@LoadDataBeforeShow
public class EstudianteEdit extends StandardEditor<Estudiante> {
}