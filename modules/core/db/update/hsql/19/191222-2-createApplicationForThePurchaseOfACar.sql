alter table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR add constraint FK_DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ON_CAR foreign key (CAR_ID) references DAVALEBA_LEGAL_ENTITY(ID);
alter table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR add constraint FK_DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ON_MANAGER foreign key (MANAGER_ID) references SEC_USER(ID);
create index IDX_DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ON_CAR on DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR (CAR_ID);
create index IDX_DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ON_MANAGER on DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR (MANAGER_ID);
