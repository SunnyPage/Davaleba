-- begin DAVALEBA_MODEL
create table DAVALEBA_MODEL (
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
    CAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_MODEL
-- begin DAVALEBA_CAR_MANUFACTURING
create table DAVALEBA_CAR_MANUFACTURING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    MANUFACTURER_CODE varchar(255) not null,
    MODEL_ID varchar(36),
    CAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_CAR_MANUFACTURING
-- begin DAVALEBA_CAR
create table DAVALEBA_CAR (
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
    YEAR_OF_ISSUE varchar(255),
    CAR_COST varchar(255),
    --
    primary key (ID)
)^
-- end DAVALEBA_CAR
-- begin DAVALEBA_COLOUR
create table DAVALEBA_COLOUR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end DAVALEBA_COLOUR
-- begin DAVALEBA_COUNTRY
create table DAVALEBA_COUNTRY (
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
    CODE varchar(255),
    COUNTRY varchar(255),
    CAR_MANUFACTURERS_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_COUNTRY
-- begin DAVALEBA_ASSEMBLY
create table DAVALEBA_ASSEMBLY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRICE decimal(19, 2),
    TYPE_OF_CAR varchar(50),
    NOTE varchar(255),
    CAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_ASSEMBLY
