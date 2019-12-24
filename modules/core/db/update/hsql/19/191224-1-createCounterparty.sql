create table DAVALEBA_COUNTERPARTY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    IDENTIFICATION_NUMBER_AND_ADDRESS longvarchar,
    NAME varchar(255),
    TELEPHONE varchar(255),
    FIRST_NAME_AND_LAST_NAME varchar(255),
    --
    primary key (ID)
);