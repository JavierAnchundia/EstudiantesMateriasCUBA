-- begin PRUEBA1_ESTUDIANTE
create table PRUEBA1_ESTUDIANTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOMBRE varchar(255) not null,
    APELLIDO varchar(255),
    --
    primary key (ID)
)^
-- end PRUEBA1_ESTUDIANTE
-- begin PRUEBA1_MATERIA
create table PRUEBA1_MATERIA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOMBRE varchar(255) not null,
    CODIGO varchar(255) not null,
    ESTUDIANTE_ID varchar(36),
    --
    primary key (ID)
)^
-- end PRUEBA1_MATERIA
