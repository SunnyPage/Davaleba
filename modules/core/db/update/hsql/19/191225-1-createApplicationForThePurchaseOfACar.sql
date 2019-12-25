create table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_ID varchar(36),
    CAR_PAID boolean,
    PRICE decimal(19, 2),
    MANAGER_ID varchar(36),
    COUNTERPARTY_ID varchar(36),
    --
    primary key (ID)
);