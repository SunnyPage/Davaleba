alter table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR alter column CAR_ID rename to CAR_ID__U35809 ^
alter table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR drop constraint FK_DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ON_CAR ;
drop index IDX_DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ON_CAR ;
alter table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR add column CAR_ID varchar(36) ;
alter table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR add column COUNTERPARTY_ID varchar(36) ;