package com.company.prueba1.web.screens.materia;

import com.haulmont.cuba.gui.screen.*;
import com.company.prueba1.entity.Materia;

@UiController("prueba1_Materia.edit")
@UiDescriptor("materia-edit.xml")
@EditedEntityContainer("materiaDc")
@LoadDataBeforeShow
public class MateriaEdit extends StandardEditor<Materia> {
}