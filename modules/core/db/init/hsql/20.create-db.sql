-- begin DAVALEBA_MODEL
alter table DAVALEBA_MODEL add constraint FK_DAVALEBA_MODEL_ON_CAR foreign key (CAR_ID) references DAVALEBA_CAR(ID)^
create index IDX_DAVALEBA_MODEL_ON_CAR on DAVALEBA_MODEL (CAR_ID)^
-- end DAVALEBA_MODEL
-- begin DAVALEBA_CAR_MANUFACTURING
alter table DAVALEBA_CAR_MANUFACTURING add constraint FK_DAVALEBA_CAR_MANUFACTURING_ON_MODEL foreign key (MODEL_ID) references DAVALEBA_MODEL(ID)^
alter table DAVALEBA_CAR_MANUFACTURING add constraint FK_DAVALEBA_CAR_MANUFACTURING_ON_CAR foreign key (CAR_ID) references DAVALEBA_CAR(ID)^
create unique index IDX_DAVALEBA_CAR_MANUFACTURING_UNIQ_MANUFACTURER_CODE on DAVALEBA_CAR_MANUFACTURING (MANUFACTURER_CODE) ^
create unique index IDX_DAVALEBA_CAR_MANUFACTURING_UNIQ_NAME on DAVALEBA_CAR_MANUFACTURING (NAME) ^
create index IDX_DAVALEBA_CAR_MANUFACTURING_ON_MODEL on DAVALEBA_CAR_MANUFACTURING (MODEL_ID)^
create index IDX_DAVALEBA_CAR_MANUFACTURING_ON_CAR on DAVALEBA_CAR_MANUFACTURING (CAR_ID)^
-- end DAVALEBA_CAR_MANUFACTURING
-- begin DAVALEBA_COLOUR
create unique index IDX_DAVALEBA_COLOUR_UNIQ_NAME on DAVALEBA_COLOUR (NAME) ^
-- end DAVALEBA_COLOUR
-- begin DAVALEBA_COUNTRY
alter table DAVALEBA_COUNTRY add constraint FK_DAVALEBA_COUNTRY_ON_CAR_MANUFACTURERS foreign key (CAR_MANUFACTURERS_ID) references DAVALEBA_CAR_MANUFACTURING(ID)^
create index IDX_DAVALEBA_COUNTRY_ON_CAR_MANUFACTURERS on DAVALEBA_COUNTRY (CAR_MANUFACTURERS_ID)^
-- end DAVALEBA_COUNTRY
-- begin DAVALEBA_ASSEMBLY
alter table DAVALEBA_ASSEMBLY add constraint FK_DAVALEBA_ASSEMBLY_ON_CAR foreign key (CAR_ID) references DAVALEBA_CAR(ID)^
create index IDX_DAVALEBA_ASSEMBLY_ON_CAR on DAVALEBA_ASSEMBLY (CAR_ID)^
-- end DAVALEBA_ASSEMBLY
