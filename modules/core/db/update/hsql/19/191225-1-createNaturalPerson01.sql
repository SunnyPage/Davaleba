create table DAVALEBA_NATURAL_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME_AND_LAST_NAME varchar(255),
    APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ID varchar(36),
    TELEPHONE varchar(255),
    --
    primary key (ID)
);