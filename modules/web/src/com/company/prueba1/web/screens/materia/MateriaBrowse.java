package com.company.prueba1.web.screens.materia;

import com.haulmont.cuba.gui.screen.*;
import com.company.prueba1.entity.Materia;

@UiController("prueba1_Materia.browse")
@UiDescriptor("materia-browse.xml")
@LookupComponent("materiasTable")
@LoadDataBeforeShow
public class MateriaBrowse extends StandardLookup<Materia> {
}