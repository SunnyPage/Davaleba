create table DAVALEBA_LEGAL_ENTITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    IDENTIFICATION_NUMBER_AND_ADDRESS longvarchar,
    TELEPHONE varchar(255),
    --
    primary key (ID)
);