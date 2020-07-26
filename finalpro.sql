
DROP TABLE cast CASCADE CONSTRAINTS;
DROP TABLE reply CASCADE CONSTRAINTS;
DROP TABLE ask CASCADE CONSTRAINTS;
DROP TABLE charge CASCADE CONSTRAINTS;
DROP TABLE mReview CASCADE CONSTRAINTS;
DROP TABLE book CASCADE CONSTRAINTS;
DROP TABLE missing CASCADE CONSTRAINTS;
DROP TABLE revenue CASCADE CONSTRAINTS;
DROP TABLE salary CASCADE CONSTRAINTS;
DROP TABLE wSchedule CASCADE CONSTRAINTS;
DROP TABLE staff CASCADE CONSTRAINTS;
DROP TABLE storeInfo CASCADE CONSTRAINTS;
DROP TABLE store CASCADE CONSTRAINTS;
DROP TABLE mSchedule CASCADE CONSTRAINTS;
DROP TABLE brInfo CASCADE CONSTRAINTS;
DROP TABLE seat CASCADE CONSTRAINTS;
DROP TABLE theather CASCADE CONSTRAINTS;
DROP TABLE branch CASCADE CONSTRAINTS;
DROP TABLE cuponDetail CASCADE CONSTRAINTS;
DROP TABLE cupon CASCADE CONSTRAINTS;
DROP TABLE division CASCADE CONSTRAINTS;
DROP TABLE movieImg CASCADE CONSTRAINTS;
DROP TABLE total CASCADE CONSTRAINTS;
DROP TABLE film CASCADE CONSTRAINTS;
DROP TABLE genre CASCADE CONSTRAINTS;
DROP TABLE mile CASCADE CONSTRAINTS;
DROP TABLE membership CASCADE CONSTRAINTS;
DROP TABLE proposal CASCADE CONSTRAINTS;
DROP TABLE qna CASCADE CONSTRAINTS;
DROP TABLE staffType CASCADE CONSTRAINTS;

/* Create Tables */


CREATE TABLE "GENRE" 
   (	"GENRENUM" NUMBER(38,0) NOT NULL, 
	"GENRENAME" VARCHAR2(500)
   );

CREATE TABLE "PROPOSAL" 
   (	"PRONUM" NUMBER(38,0) NOT NULL, 
	"MEMBERID" VARCHAR2(500), 
	"PROADDR" VARCHAR2(500), 
	"PROGOAL" VARCHAR2(500), 
	"PROSCALE" VARCHAR2(500), 
	"PROSTATUS" VARCHAR2(500), 
	"PROREGDATE" DATE, 
	"CITYADDR" VARCHAR2(500)
   );
CREATE TABLE "MEMBERSHIP" 
   (	"MEMNUM" NUMBER(38,0) NOT NULL, 
	"MEMNAME" VARCHAR2(380), 
	"MEMID" VARCHAR2(500), 
	"MEMPWD" VARCHAR2(500), 
	"MEMPHONE" VARCHAR2(500), 
	"BIRTH" VARCHAR2(500), 
	"EMAIL" VARCHAR2(500), 
	"GRADE" VARCHAR2(500), 
	"MEMREGDATE" DATE
   );
  CREATE TABLE "QNA" 
   (	"QNANUM" NUMBER(38,0) NOT NULL, 
	"QNATITLE" VARCHAR2(500), 
	"QNACONTENT" VARCHAR2(500)
   );
CREATE TABLE "DIVISION" 
   (	"DIVISIONNUM" NUMBER(38,0) NOT NULL, 
	"DIVISIONNAME" VARCHAR2(500)
   );

CREATE TABLE "STAFFTYPE" 
   (	"SFFNUM" NUMBER(38,0) NOT NULL, 
	"SFFPOSITION" VARCHAR2(500), 
	"WAGE" NUMBER(38,0)
   );

CREATE TABLE "FILM" 
   (	"FILMNUM" NUMBER(38,0) NOT NULL, 
	"FILMNAME" VARCHAR2(500), 
	"FILMSTORY" VARCHAR2(500), 
	"FILMSTART" DATE, 
	"FILMEND" DATE, 
	"FILMPRICE" NUMBER(38,0), 
	"FILMHEAD" VARCHAR2(500), 
	"FILMSTATUS" VARCHAR2(500), 
	"GENRENUM" NUMBER(38,0)
   );
CREATE TABLE "MOVIEIMG" 
   (	"MOVIEIMGNUM" NUMBER(38,0) NOT NULL, 
	"MOVIEIMGURL" VARCHAR2(500), 
	"FILMNUM" NUMBER(38,0)
   );

CREATE TABLE "TOTAL" 
   (	"TOTALNUM" NUMBER(38,0) NOT NULL, 
	"TOTALPEOPLE" NUMBER(38,0), 
	"TOTALPRICE" NUMBER(38,0), 
	"FILMNUM" NUMBER(38,0) NOT NULL, 
	"TOTALDATE" DATE
   );
CREATE TABLE "CAST" 
   (	"CASTNUM" NUMBER(38,0) NOT NULL, 
	"ACTORNAME" VARCHAR2(500), 
	"FILMNUM" NUMBER(38,0) NOT NULL
   );

CREATE TABLE "BRANCH" 
   (	"BRANCHNUM" NUMBER(38,0) NOT NULL, 
	"PRONUM" NUMBER(38,0) NOT NULL, 
	"BRNAME" VARCHAR2(500), 
	"MEMID" VARCHAR2(500), 
	"BRSTATUS" VARCHAR2(500), 
	"BRREGDATE" DATE
   );
CREATE TABLE "THEATHER" 
   (	"THEATHERNUM" NUMBER(38,0) NOT NULL, 
	"BRANCHNUM" NUMBER(38,0) NOT NULL, 
	"THEATHERNAME" VARCHAR2(500), 
	"THEATHERSORT" VARCHAR2(500)
   );

CREATE TABLE "SEAT" 
   (	"SEATNUM" NUMBER(38,0) NOT NULL, 
	"THEATHERNUM" NUMBER(38,0) NOT NULL, 
	"SEATX" NUMBER(38,0), 
	"SEATY" NUMBER(38,0), 
	"SEATSALE" NUMBER(38,0), 
	"SEATNAME" VARCHAR2(500)
   );

CREATE TABLE "MSCHEDULE" 
   (	"MSCHEDULENUM" NUMBER(38,0) NOT NULL, 
	"MSTARTTIME" DATE, 
	"PURCHASEFILMNUM" NUMBER(38,0), 
	"THEATHERNUM" NUMBER(38,0)
   );

CREATE TABLE "CUPON" 
   (	"CUPONNUM" NUMBER(38,0) NOT NULL, 
	"CUPONSTATUS" VARCHAR2(500), 
	"CNAME" VARCHAR2(500), 
	"CUPONSTART" DATE, 
	"CUPONEND" DATE, 
	"CSORT" VARCHAR2(500), 
	"MEMNUM" NUMBER(38,0) NOT NULL, 
	"CUPONRATE" NUMBER(38,0)
   );

CREATE TABLE "CUPONDETAIL" 
   (	"CDETAILNUM" NUMBER(38,0) NOT NULL, 
	"CAREA" VARCHAR2(500), 
	"ABLEDATE" VARCHAR2(500), 
	"CUPONNUM" NUMBER(38,0) NOT NULL
   );

CREATE TABLE "CHARGE" 
   (	"CHARGENUM" NUMBER(38,0) NOT NULL, 
	"MEMNUM" NUMBER(38,0), 
	"CDETAILNUM" NUMBER(38,0) NOT NULL, 
	"PAYMENT" VARCHAR2(500), 
	"MEMSTATUS" VARCHAR2(500), 
	"CHREGDATE" DATE, 
	"PHONE" VARCHAR2(500), 
	"TOTALBILL" NUMBER(38,0)
   );

CREATE TABLE "MILE" 
   (	"MILENUM" NUMBER(38,0) NOT NULL, 
	"MILEDATE" DATE, 
	"MILE" NUMBER(38,0), 
	"MEMNUM" NUMBER(38,0) NOT NULL
   );

CREATE TABLE "ASK" 
   (	"ASKNUM" NUMBER(38,0) NOT NULL, 
	"MEMNUM" NUMBER(38,0) NOT NULL, 
	"QNATITLE" VARCHAR2(500), 
	"ASKCONTENT" VARCHAR2(500), 
	"ASKREGDATE" DATE, 
	"RESPONSE" VARCHAR2(500)
   );

CREATE TABLE "REPLY" 
   (	"REPLYNUM" NUMBER(38,0) NOT NULL, 
	"STAFFID" VARCHAR2(500) NOT NULL, 
	"QNATITLE" VARCHAR2(500), 
	"REPLYCONTENT" VARCHAR2(500), 
	"REPLYREGDATE" DATE, 
	"ASKNUM" NUMBER(38,0) NOT NULL
   );

CREATE TABLE "BOOK" 
   (	"BOOKNUM" NUMBER(38,0) NOT NULL, 
	"BOOKSTATUS" VARCHAR2(500), 
	"SEATNUM" NUMBER(38,0) NOT NULL, 
	"MSCHEDULENUM" NUMBER(38,0) NOT NULL, 
	"CHARGENUM" NUMBER(38,0) NOT NULL
   );

  CREATE TABLE "STORE" 
   (	"STORENUM" NUMBER(38,0) NOT NULL, 
	"BRANCHNUM" NUMBER(38,0) NOT NULL, 
	"STORENAME" NUMBER(38,0), 
	"STOREPRICE" NUMBER(38,0), 
	"STORESTATUS" VARCHAR2(500)
   );

CREATE TABLE "STOREINFO" 
   (	"STOREINFONUM" NUMBER(38,0) NOT NULL, 
	"MEMNUM" NUMBER(38,0) NOT NULL, 
	"STORENUM" NUMBER(38,0) NOT NULL, 
	"BUYREGDATE" DATE, 
	"USEDMOMENT" DATE
   );

CREATE TABLE "REVENUE" 
   (	"REVENUENUM" NUMBER(38,0) NOT NULL, 
	"OUTCOME" NUMBER(38,0), 
	"TICKETINCOME" NUMBER(38,0), 
	"STOREINCOME" NUMBER(38,0), 
	"BRANCHNUM" NUMBER(38,0) NOT NULL, 
	"REVENUEDATE" DATE
   );

CREATE TABLE "STAFF" 
   (	"STAFFNUM" NUMBER(38,0) NOT NULL, 
	"SFFNUM" NUMBER(38,0) NOT NULL, 
	"DIVISIONNUM" NUMBER(38,0) NOT NULL, 
	"SFFNAME" VARCHAR2(500), 
	"SFFAGE" VARCHAR2(500), 
	"SFFADDR" VARCHAR2(500), 
	"JUMIN" VARCHAR2(500), 
	"GENDER" VARCHAR2(500), 
	"ACCOUNTNUM" NUMBER(38,0), 
	"SFFSTATUS" VARCHAR2(500), 
	"BRANCHNUM" NUMBER(38,0) NOT NULL
   );

CREATE TABLE "MISSING" 
   (	"MISSNUM" NUMBER(38,0) NOT NULL, 
	"BRANCHNUM" NUMBER(38,0) NOT NULL, 
	"GETDATE" DATE, 
	"FINDDATE" DATE, 
	"MISSDETAIL" VARCHAR2(500), 
	"MISSTITLE" VARCHAR2(500)
   );

CREATE TABLE "SALARY" 
   (	"SALNUM" NUMBER(38,0) NOT NULL, 
	"SALDATE" DATE, 
	"SALARY" NUMBER(38,0), 
	"STAFFNUM" NUMBER(38,0) NOT NULL
   );

 CREATE TABLE "MREVIEW" 
   (	"MREVIEWNUM" NUMBER(38,0) NOT NULL, 
	"RCONTENT" VARCHAR2(500), 
	"LIKETOTAL" NUMBER(38,0), 
	"MSCORE" NUMBER(38,0), 
	"MEMNUM" NUMBER(38,0) NOT NULL, 
	"FILMNUM" NUMBER(38,0) NOT NULL, 
	"CHARGENUM" NUMBER(38,0) NOT NULL, 
	"REVIEWREGDATE" DATE
   );

CREATE TABLE "WSCHEDULE" 
   (	"SNUM" NUMBER(38,0) NOT NULL, 
	"STAFFNUM" NUMBER(38,0) NOT NULL, 
	"WORKSTART" DATE, 
	"WORKEND" DATE, 
	"WORKDATE" DATE
   );

=======================================================================================










create sequence actorNum;
create sequence askNum;
create sequence bookNum;
create sequence branchNum;
create sequence brInfoNum;
create sequence castNum;
create sequence chargeNum;
create sequence cuponNum;
create sequence cDetailNum;
create sequence divisionNum;
create sequence filmNum;
create sequence genreNum;
create sequence memNum;
create sequence mileNum;
create sequence missNum;
create sequence movieImgnum;
create sequence mReviewNum;
create sequence mScheduleNum;
create sequence proNum;
create sequence qnaNum;
create sequence replyNum;
create sequence revenueNum;
create sequence salNum;
create sequence seatNum;
create sequence staffNum;
create sequence sffNum;
create sequence storeNum;
create sequence storeInfoNum;
create sequence theatherNum;
create sequence totalNum;
create sequence sNum;

--genre insert

Insert into GENRE (GENRENUM,GENRENAME) values (1,'드라마');
Insert into GENRE (GENRENUM,GENRENAME) values (2,'판타지');
Insert into GENRE (GENRENUM,GENRENAME) values (4,'공포');
Insert into GENRE (GENRENUM,GENRENAME) values (3,'서부');
Insert into GENRE (GENRENUM,GENRENAME) values (5,'로맨스');
Insert into GENRE (GENRENUM,GENRENAME) values (6,'모험');
Insert into GENRE (GENRENUM,GENRENAME) values (7,'스릴러');
Insert into GENRE (GENRENUM,GENRENAME) values (8,'느와르');
Insert into GENRE (GENRENUM,GENRENAME) values (9,'컬트');
Insert into GENRE (GENRENUM,GENRENAME) values (10,'다큐멘터리');
Insert into GENRE (GENRENUM,GENRENAME) values (11,'코미디');
Insert into GENRE (GENRENUM,GENRENAME) values (12,'가족');
Insert into GENRE (GENRENUM,GENRENAME) values (13,'미스터리');
Insert into GENRE (GENRENUM,GENRENAME) values (14,'전쟁');
Insert into GENRE (GENRENUM,GENRENAME) values (15,'애니메이션');
Insert into GENRE (GENRENUM,GENRENAME) values (16,'범죄');
Insert into GENRE (GENRENUM,GENRENAME) values (17,'뮤지컬');
Insert into GENRE (GENRENUM,GENRENAME) values (18,'SF');
Insert into GENRE (GENRENUM,GENRENAME) values (19,'액션');
Insert into GENRE (GENRENUM,GENRENAME) values (20,'무협');
Insert into GENRE (GENRENUM,GENRENAME) values (21,'에로');
Insert into GENRE (GENRENUM,GENRENAME) values (22,'서스펜스');
Insert into GENRE (GENRENUM,GENRENAME) values (23,'서사');
Insert into GENRE (GENRENUM,GENRENAME) values (24,'블랙코미디');
Insert into GENRE (GENRENUM,GENRENAME) values (25,'실험');
Insert into GENRE (GENRENUM,GENRENAME) values (26,'영화카툰');
Insert into GENRE (GENRENUM,GENRENAME) values (27,'영화음악');
Insert into GENRE (GENRENUM,GENRENAME) values (28,'영화패러디포스터');

--stafftype insert

insert into stafftype(sffnum,sffposition,wage)
VALUES (1,'점장',15000);
insert into stafftype(sffnum,sffposition,wage)
VALUES (2,'매니저',14000);
insert into stafftype(sffnum,sffposition,wage)
VALUES (3,'SP',13000);
insert into stafftype(sffnum,sffposition,wage)
VALUES (4,'사원',12000);
insert into stafftype(sffnum,sffposition,wage)
VALUES (5,'인턴',11000);

--division insert

insert into division(divisionnum,divisionname)
VALUES (divisionnum.nextval,'운영');
insert into division(divisionnum,divisionname)
VALUES (divisionnum.nextval,'인사');
insert into division(divisionnum,divisionname)
VALUES (divisionnum.nextval,'회계');

/* Create Foreign Keys */

-------------------------------------------------------
--  Constraints for Table GENRE
--------------------------------------------------------

  ALTER TABLE "GENRE" ADD PRIMARY KEY ("GENRENUM") ENABLE;
  ALTER TABLE "GENRE" MODIFY ("GENRENUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MOVIEIMG
--------------------------------------------------------

  ALTER TABLE "MOVIEIMG" ADD PRIMARY KEY ("MOVIEIMGNUM") ENABLE;
  ALTER TABLE "MOVIEIMG" MODIFY ("FILMNUM" NOT NULL ENABLE);
  ALTER TABLE "MOVIEIMG" MODIFY ("MOVIEIMGNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CAST
--------------------------------------------------------

  ALTER TABLE "CAST" ADD PRIMARY KEY ("CASTNUM") ENABLE;
  ALTER TABLE "CAST" MODIFY ("FILMNUM" NOT NULL ENABLE);
  ALTER TABLE "CAST" MODIFY ("CASTNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table FILM
--------------------------------------------------------

  ALTER TABLE "FILM" ADD PRIMARY KEY ("FILMNUM") ENABLE;
  ALTER TABLE "FILM" MODIFY ("GENRENUM" NOT NULL ENABLE);
  ALTER TABLE "FILM" MODIFY ("FILMNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TOTAL
--------------------------------------------------------

  ALTER TABLE "TOTAL" ADD PRIMARY KEY ("TOTALNUM") ENABLE;
  ALTER TABLE "TOTAL" MODIFY ("FILMNUM" NOT NULL ENABLE);
  ALTER TABLE "TOTAL" MODIFY ("TOTALNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PURCHASEFILM
--------------------------------------------------------

  ALTER TABLE "PURCHASEFILM" ADD PRIMARY KEY ("PURCHASEFILMNUM") ENABLE;
  ALTER TABLE "PURCHASEFILM" MODIFY ("PURCHASEFILMNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PROPOSAL
--------------------------------------------------------

  ALTER TABLE "PROPOSAL" ADD PRIMARY KEY ("PRONUM") ENABLE;
  ALTER TABLE "PROPOSAL" MODIFY ("PRONUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table REVENUE
--------------------------------------------------------

  ALTER TABLE "REVENUE" ADD PRIMARY KEY ("REVENUENUM") ENABLE;
  ALTER TABLE "REVENUE" MODIFY ("BRANCHNUM" NOT NULL ENABLE);
  ALTER TABLE "REVENUE" MODIFY ("REVENUENUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MSCHEDULE
--------------------------------------------------------

  ALTER TABLE "MSCHEDULE" ADD PRIMARY KEY ("MSCHEDULENUM") ENABLE;
  ALTER TABLE "MSCHEDULE" MODIFY ("MSCHEDULENUM" NOT NULL ENABLE);
  ALTER TABLE "MSCHEDULE" MODIFY ("PURCHASEFILMNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table THEATHER
--------------------------------------------------------

  ALTER TABLE "THEATHER" ADD PRIMARY KEY ("THEATHERNUM") ENABLE;
  ALTER TABLE "THEATHER" MODIFY ("BRANCHNUM" NOT NULL ENABLE);
  ALTER TABLE "THEATHER" MODIFY ("THEATHERNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BRANCH
--------------------------------------------------------

  ALTER TABLE "BRANCH" ADD PRIMARY KEY ("BRANCHNUM") ENABLE;
  ALTER TABLE "BRANCH" MODIFY ("PRONUM" NOT NULL ENABLE);
  ALTER TABLE "BRANCH" MODIFY ("BRANCHNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MISSING
--------------------------------------------------------

  ALTER TABLE "MISSING" ADD PRIMARY KEY ("MISSNUM") ENABLE;
  ALTER TABLE "MISSING" MODIFY ("BRANCHNUM" NOT NULL ENABLE);
  ALTER TABLE "MISSING" MODIFY ("MISSNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SEAT
--------------------------------------------------------

  ALTER TABLE "SEAT" ADD PRIMARY KEY ("SEATNUM") ENABLE;
  ALTER TABLE "SEAT" MODIFY ("THEATHERNUM" NOT NULL ENABLE);
  ALTER TABLE "SEAT" MODIFY ("SEATNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BOOK
--------------------------------------------------------

  ALTER TABLE "BOOK" ADD PRIMARY KEY ("BOOKNUM") ENABLE;
  ALTER TABLE "BOOK" MODIFY ("CHARGENUM" NOT NULL ENABLE);
  ALTER TABLE "BOOK" MODIFY ("MSCHEDULENUM" NOT NULL ENABLE);
  ALTER TABLE "BOOK" MODIFY ("SEATNUM" NOT NULL ENABLE);
  ALTER TABLE "BOOK" MODIFY ("BOOKNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STORE
--------------------------------------------------------

  ALTER TABLE "STORE" ADD PRIMARY KEY ("STORENUM") ENABLE;
  ALTER TABLE "STORE" MODIFY ("BRANCHNUM" NOT NULL ENABLE);
  ALTER TABLE "STORE" MODIFY ("STORENUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MILE
--------------------------------------------------------

  ALTER TABLE "MILE" ADD PRIMARY KEY ("MILENUM") ENABLE;
  ALTER TABLE "MILE" MODIFY ("MEMNUM" NOT NULL ENABLE);
  ALTER TABLE "MILE" MODIFY ("MILENUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CHARGE
--------------------------------------------------------

  ALTER TABLE "CHARGE" ADD PRIMARY KEY ("CHARGENUM") ENABLE;
  ALTER TABLE "CHARGE" MODIFY ("CDETAILNUM" NOT NULL ENABLE);
  ALTER TABLE "CHARGE" MODIFY ("CHARGENUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CUPONDETAIL
--------------------------------------------------------

  ALTER TABLE "CUPONDETAIL" ADD PRIMARY KEY ("CDETAILNUM") ENABLE;
  ALTER TABLE "CUPONDETAIL" MODIFY ("CUPONNUM" NOT NULL ENABLE);
  ALTER TABLE "CUPONDETAIL" MODIFY ("CDETAILNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CUPON
--------------------------------------------------------

  ALTER TABLE "CUPON" ADD PRIMARY KEY ("CUPONNUM") ENABLE;
  ALTER TABLE "CUPON" MODIFY ("MEMNUM" NOT NULL ENABLE);
  ALTER TABLE "CUPON" MODIFY ("CUPONNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STOREINFO
--------------------------------------------------------

  ALTER TABLE "STOREINFO" ADD PRIMARY KEY ("STOREINFONUM") ENABLE;
  ALTER TABLE "STOREINFO" MODIFY ("STORENUM" NOT NULL ENABLE);
  ALTER TABLE "STOREINFO" MODIFY ("MEMNUM" NOT NULL ENABLE);
  ALTER TABLE "STOREINFO" MODIFY ("STOREINFONUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STAFF
--------------------------------------------------------

  ALTER TABLE "STAFF" ADD PRIMARY KEY ("STAFFNUM") ENABLE;
  ALTER TABLE "STAFF" MODIFY ("BRANCHNUM" NOT NULL ENABLE);
  ALTER TABLE "STAFF" MODIFY ("DIVISIONNUM" NOT NULL ENABLE);
  ALTER TABLE "STAFF" MODIFY ("SFFNUM" NOT NULL ENABLE);
  ALTER TABLE "STAFF" MODIFY ("STAFFNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STAFFTYPE
--------------------------------------------------------

  ALTER TABLE "STAFFTYPE" ADD PRIMARY KEY ("SFFNUM") ENABLE;
  ALTER TABLE "STAFFTYPE" MODIFY ("SFFNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MREVIEW
--------------------------------------------------------

  ALTER TABLE "MREVIEW" ADD PRIMARY KEY ("MREVIEWNUM") ENABLE;
  ALTER TABLE "MREVIEW" MODIFY ("CHARGENUM" NOT NULL ENABLE);
  ALTER TABLE "MREVIEW" MODIFY ("FILMNUM" NOT NULL ENABLE);
  ALTER TABLE "MREVIEW" MODIFY ("MEMNUM" NOT NULL ENABLE);
  ALTER TABLE "MREVIEW" MODIFY ("MREVIEWNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MEMBERSHIP
--------------------------------------------------------

  ALTER TABLE "MEMBERSHIP" ADD UNIQUE ("MEMID") ENABLE;
  ALTER TABLE "MEMBERSHIP" ADD PRIMARY KEY ("MEMNUM") ENABLE;
  ALTER TABLE "MEMBERSHIP" MODIFY ("MEMNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DIVISION
--------------------------------------------------------

  ALTER TABLE "DIVISION" ADD PRIMARY KEY ("DIVISIONNUM") ENABLE;
  ALTER TABLE "DIVISION" MODIFY ("DIVISIONNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table WSCHEDULE
--------------------------------------------------------

  ALTER TABLE "WSCHEDULE" ADD PRIMARY KEY ("SNUM") ENABLE;
  ALTER TABLE "WSCHEDULE" MODIFY ("STAFFNUM" NOT NULL ENABLE);
  ALTER TABLE "WSCHEDULE" MODIFY ("SNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ASK
--------------------------------------------------------

  ALTER TABLE "ASK" ADD PRIMARY KEY ("ASKNUM") ENABLE;
  ALTER TABLE "ASK" MODIFY ("MEMNUM" NOT NULL ENABLE);
  ALTER TABLE "ASK" MODIFY ("ASKNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table REPLY
--------------------------------------------------------

  ALTER TABLE "REPLY" ADD PRIMARY KEY ("REPLYNUM") ENABLE;
  ALTER TABLE "REPLY" MODIFY ("ASKNUM" NOT NULL ENABLE);
  ALTER TABLE "REPLY" MODIFY ("STAFFID" NOT NULL ENABLE);
  ALTER TABLE "REPLY" MODIFY ("REPLYNUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table QNA
--------------------------------------------------------

  ALTER TABLE "QNA" ADD PRIMARY KEY ("QNANUM") ENABLE;
  ALTER TABLE "QNA" MODIFY ("QNANUM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SALARY
--------------------------------------------------------

  ALTER TABLE "SALARY" ADD PRIMARY KEY ("SALNUM") ENABLE;
  ALTER TABLE "SALARY" MODIFY ("STAFFNUM" NOT NULL ENABLE);
  ALTER TABLE "SALARY" MODIFY ("SALNUM" NOT NULL ENABLE);