-- begin PRUEBA1_MATERIA
alter table PRUEBA1_MATERIA add constraint FK_PRUEBA1_MATERIA_ON_ESTUDIANTE foreign key (ESTUDIANTE_ID) references PRUEBA1_ESTUDIANTE(ID)^
create unique index IDX_PRUEBA1_MATERIA_UNIQ_NOMBRE on PRUEBA1_MATERIA (NOMBRE) ^
create unique index IDX_PRUEBA1_MATERIA_UNIQ_CODIGO on PRUEBA1_MATERIA (CODIGO) ^
create index IDX_PRUEBA1_MATERIA_ON_ESTUDIANTE on PRUEBA1_MATERIA (ESTUDIANTE_ID)^
-- end PRUEBA1_MATERIA
