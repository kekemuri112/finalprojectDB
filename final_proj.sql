
/* Drop Tables */

DROP TABLE reply CASCADE CONSTRAINTS;
DROP TABLE ask CASCADE CONSTRAINTS;
DROP TABLE charge CASCADE CONSTRAINTS;
DROP TABLE mReview CASCADE CONSTRAINTS;
DROP TABLE book CASCADE CONSTRAINTS;
DROP TABLE missing CASCADE CONSTRAINTS;
DROP TABLE mSchedule CASCADE CONSTRAINTS;
DROP TABLE purchaseFilm CASCADE CONSTRAINTS;
DROP TABLE revenue CASCADE CONSTRAINTS;
DROP TABLE wSchedule CASCADE CONSTRAINTS;
DROP TABLE staff CASCADE CONSTRAINTS;
DROP TABLE storeInfo CASCADE CONSTRAINTS;
DROP TABLE store CASCADE CONSTRAINTS;
DROP TABLE seat CASCADE CONSTRAINTS;
DROP TABLE theather CASCADE CONSTRAINTS;
DROP TABLE branch CASCADE CONSTRAINTS;
DROP TABLE cast CASCADE CONSTRAINTS;
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
DROP TABLE salary CASCADE CONSTRAINTS;
DROP TABLE staffType CASCADE CONSTRAINTS;


create sequence replyNum;



/* Create Tables */

-- ����
CREATE TABLE ask
(
	-- ������ȣ
	askNum number(38) NOT NULL,
	-- ȸ����ȣ
	memNum number(38) NOT NULL,
	-- ����
	qnaTitle varchar2(380),
	-- ����
	askContent varchar2(380),
	-- �����
	askRegdate date,
	-- �亯����
	response varchar2(380),
	PRIMARY KEY (askNum)
);


-- �������̺�
CREATE TABLE book
(
	-- ����������������
	bookNum number(38) NOT NULL,
	-- �������
	bookStatus varchar2(380),
	-- �¼���ȣ������
	seatNum number(38) NOT NULL,
	-- �󿵽����ٽ�����
	mScheduleNum number(38) NOT NULL,
	-- ������ȣ
	chargeNum number(38) NOT NULL,
	PRIMARY KEY (bookNum)
);


-- �������̺�
CREATE TABLE branch
(
	-- ����������
	branchNum number(38) NOT NULL,
	-- ������û������
	proNum number(38) NOT NULL,
	-- ������
	brName varchar2(380),
	-- ������
	memId varchar2(380),
	-- ��������
	brStatus varchar2(380),
	-- ������
	brRegdate date,
	PRIMARY KEY (branchNum)
);


-- �⿬��
CREATE TABLE cast
(
	-- �⿬����ȣ
	castNum number(38) NOT NULL,
	-- ��ȭ������
	filmNum number(38) NOT NULL,
	-- ����̸�
	castName varchar2(380),
	PRIMARY KEY (castNum)
);


-- ��ȭ����
CREATE TABLE charge
(
	-- ������ȣ
	chargeNum number(38) NOT NULL,
	-- ȸ����ȣ
	memNum number(38),
	-- ���������ǹ�ȣ
	cDetailNum number(38) NOT NULL,
	-- �������
	payment varchar2(380),
	-- ȸ����ȸ������
	memStatus varchar2(380),
	-- ������
	chRegdate date,
	-- ����������������
	bookNum number(38) NOT NULL,
	-- ��������ȭ��ȣ
	phone varchar2(380),
	-- �����ݾ�
	totalBill number(38),
	PRIMARY KEY (chargeNum)
);


-- ������
CREATE TABLE cupon
(
	-- ���� ��ȣ
	cuponNum number(38) NOT NULL,
	-- ����������
	cuponStatus varchar2(380),
	-- ������
	cName varchar2(380),
	-- ������밡�ɽ��۳�¥
	cuponStart date,
	-- ������븸�ᳯ¥
	cuponEnd date,
	-- ��������(����/����)
	cSort varchar2(380),
	-- ȸ����ȣ
	memNum number(38) NOT NULL,
	-- ���η�
	cuponRate number(38),
	PRIMARY KEY (cuponNum)
);


-- ������� ������
CREATE TABLE cuponDetail
(
	-- ���������ǹ�ȣ
	cDetailNum number(38) NOT NULL,
	-- ��밡������
	cArea varchar2(380),
	-- ����/�ָ� ��뱸��
	ableDate varchar2(380),
	-- ���� ��ȣ
	cuponNum number(38) NOT NULL,
	PRIMARY KEY (cDetailNum)
);


-- �μ�
CREATE TABLE division
(
	-- �μ��ڵ�
	divisionNum number(38) NOT NULL,
	-- �μ��̸�
	divisionName varchar2(380),
	PRIMARY KEY (divisionNum)
);


-- ��ȭ���̺�
CREATE TABLE film
(
	-- ��ȭ������
	filmNum number(38) NOT NULL,
	-- ��ȭ��
	filmName varchar2(380),
	-- �ٰŸ�
	filmStory varchar2(380),
	-- ������
	filmStart date,
	-- ������
	filmEnd date,
	-- �Ǳǰ�
	filmPrice number(38),
	-- ����
	filmHead varchar2(380),
	-- ����
	filmStatus varchar2(380),
	-- �帣�ڵ�
	genreNum number(38) NOT NULL,
	PRIMARY KEY (filmNum)
);


-- �帣
CREATE TABLE genre
(
	-- �帣�ڵ�
	genreNum number(38) NOT NULL,
	-- �帣����
	generName varchar2(380),
	PRIMARY KEY (genreNum)
);


-- ȸ��
CREATE TABLE membership
(
	-- ȸ����ȣ
	memNum number(38) NOT NULL,
	-- �̸�
	memName varchar2(380),
	-- ���̵�
	memId varchar2(380) UNIQUE,
	-- ��й�ȣ
	memPwd varchar2(380),
	-- ��ȭ��ȣ
	memPhone varchar2(380),
	-- �������
	birth varchar2(380),
	-- �̸���
	email varchar2(380),
	-- ȸ�����
	garde varchar2(380),
	-- ������
	memRegdate date,
	PRIMARY KEY (memNum)
);


-- ���ϸ���
CREATE TABLE mile
(
	-- ���ϸ�����ȣ
	mileNum number(38) NOT NULL,
	-- ���ϸ��� ������
	mileDate date,
	-- ���ϸ��� 
	mile number(38),
	-- ȸ����ȣ
	memNum number(38) NOT NULL,
	PRIMARY KEY (mileNum)
);


-- �нǹ��Խ���
CREATE TABLE missing
(
	-- �нǹ� ��ȣ
	missNum number(38) NOT NULL,
	-- ����������
	branchNum number(38) NOT NULL,
	-- �нǹ� ������
	getDate date,
	-- �нǹ� ã�ư� ��¥
	findDate date,
	-- �нǹ� �󼼳���
	missDetail varchar2(380),
	-- �нǹ� ����
	missTitle varchar2(380),
	PRIMARY KEY (missNum)
);


-- ��ȭ�̹���
CREATE TABLE movieImg
(
	-- �����̹�����ȣ
	movieImgnum number(5) NOT NULL,
	-- �̹������
	movieImgUrl varchar2(380),
	-- ��ȭ������
	filmNum number(38) NOT NULL,
	PRIMARY KEY (movieImgnum)
);


-- ����Խ���
CREATE TABLE mReview
(
	-- ����ѹ�
	mReviewNum number(38) NOT NULL,
	-- ���䳻��
	rContent varchar2(380),
	-- ���ƿ����
	likeTotal number(38),
	-- ��ȭ����
	mScore number(38),
	-- ȸ����ȣ
	memNum number(38) NOT NULL,
	-- ��ȭ������
	filmNum number(38) NOT NULL,
	-- ����������������
	bookNum number(38) NOT NULL,
	PRIMARY KEY (mReviewNum)
);


-- ��ȭ�󿵽�����
CREATE TABLE mSchedule
(
	-- �󿵽����ٽ�����
	mScheduleNum number(38) NOT NULL,
	-- �󿵽��۽ð�
	mStartTime varchar2(380),
	-- ��ȭ�󿵱ǽ�����
	purchaseFilmNum number(38) NOT NULL,
	-- �󿵰�������
	theatherNum number(38) NOT NULL,
	PRIMARY KEY (mScheduleNum)
);


-- ������û���̺�
CREATE TABLE proposal
(
	-- ������û������
	proNum number(38) NOT NULL,
	-- ������û���̵�
	memberId ,
	-- �����ּ�
	proAddr varchar2(380),
	-- ����
	proGoal varchar2(380),
	-- �Ը�
	proScale varchar2(380),
	-- �������
	proStatus varchar2(380),
	PRIMARY KEY (proNum)
);


-- ��ȭ�󿵱Ǳ���
CREATE TABLE purchaseFilm
(
	-- ��ȭ�󿵱ǽ�����
	purchaseFilmNum number(38) NOT NULL,
	-- ������ ��������
	filmDeadline date,
	-- ������ �󿵱� ������
	purchaseDate date,
	-- ��ȭ������
	filmNum number(38) NOT NULL,
	-- ����������
	branchNum number(38) NOT NULL,
	PRIMARY KEY (purchaseFilmNum)
);


-- �����ϴ�����
CREATE TABLE qna
(
	-- ������ȣ
	qnaNum number(38) NOT NULL,
	-- ����
	qnaTitle varchar2(380),
	-- ����
	qnaContent varchar2(380),
	-- �亯����
	response varchar2(380),
	PRIMARY KEY (qnaNum)
);


-- �亯�Խ���
CREATE TABLE reply
(
	-- �亯
	replyNum number(38) NOT NULL,
	-- ���̵�
	staffId varchar2(380) NOT NULL,
	-- ����
	qnaTitle varchar2(380),
	-- ����
	replyContent varchar2(380),
	-- �����
	replyRegdate date,
	-- ������ȣ
	askNum number(38) NOT NULL,
	PRIMARY KEY (replyNum)
);


-- �������
CREATE TABLE revenue
(
	-- �����ȣ
	revenueNum number(38) NOT NULL,
	-- ����
	outcome number(38),
	-- Ƽ�ϼ���
	ticketIncome number(38),
	-- ��������
	storeIncome number(38),
	-- ����������
	branchNum number(38) NOT NULL,
	-- ���⳯¥
	revenueDate date,
	PRIMARY KEY (revenueNum)
);


-- �޿�
CREATE TABLE salary
(
	-- �޿���ȣ
	salNum number(38) NOT NULL,
	-- �޿�������
	salDate date,
	-- �޿���
	salary number(38),
	PRIMARY KEY (salNum)
);


-- �¼�
CREATE TABLE seat
(
	-- �¼���ȣ������
	seatNum number(38) NOT NULL,
	-- �󿵰�������
	theatherNum number(38) NOT NULL,
	-- �¼���x��ǥ
	seatX number(38),
	-- �¼���y��ǥ
	seatY number(38),
	-- ������
	seatSale number(38),
	PRIMARY KEY (seatNum)
);


-- ����
CREATE TABLE staff
(
	-- ������ȣ
	staffNum number(38) NOT NULL,
	-- ����Ÿ���ڵ�
	sffNum number(38) NOT NULL,
	-- �μ��ڵ�
	divisionNum number(38) NOT NULL,
	-- �̸�
	sffName varchar2(380),
	-- ����
	sffAge varchar2(380),
	-- ������
	sffAddr varchar2(380),
	-- �ֹε�Ϲ�ȣ
	jumin varchar2(380),
	-- ����
	gender varchar2(380),
	-- ���¹�ȣ
	accountNum number(38),
	-- ��������
	sffStatus varchar2(380),
	-- ����������
	branchNum number(38) NOT NULL,
	PRIMARY KEY (staffNum)
);


-- ����Ÿ��
CREATE TABLE staffType
(
	-- ����Ÿ���ڵ�
	sffNum number(38) NOT NULL,
	-- �帣����
	generName varchar2(380),
	-- �ñ�
	wage number(38),
	PRIMARY KEY (sffNum)
);


-- ����
CREATE TABLE store
(
	-- ������ȣ
	storeNum number(38) NOT NULL,
	-- ����������
	branchNum number(38) NOT NULL,
	-- ��ǰ��
	storeName number(38),
	-- ��ǰ����
	storePrice number(38),
	-- ������ǰ����
	storeStatus varchar2(380),
	PRIMARY KEY (storeNum)
);


-- ��������
CREATE TABLE storeInfo
(
	-- ����������ȣ
	storeInfoNum number(38) NOT NULL,
	-- ȸ����ȣ
	memNum number(38) NOT NULL,
	-- ������ȣ
	storeNum number(38) NOT NULL,
	-- ��������������
	buyRegdate date,
	-- ����������
	usedMoment date,
	PRIMARY KEY (storeInfoNum)
);


-- �󿵰����̺�
CREATE TABLE theather
(
	-- �󿵰�������
	theatherNum number(38) NOT NULL,
	-- ����������
	branchNum number(38) NOT NULL,
	-- �󿵰���
	theatherName varchar2(380),
	PRIMARY KEY (theatherNum)
);


-- ��ȭ������
CREATE TABLE total
(
	-- ������ȣ
	totalNum number(38) NOT NULL,
	-- ����������
	totalPeople number(38),
	-- �����ݾ�
	totalPrice number(38),
	-- ��ȭ������
	filmNum number(38) NOT NULL,
	-- ���ø����
	totalDate date,
	PRIMARY KEY (totalNum)
);


-- �ٹ��ð�ǥ
CREATE TABLE wSchedule
(
	-- �ٹ���ȣ
	sNum number(38) NOT NULL,
	-- ������ȣ
	staffNum number(38) NOT NULL,
	-- �ٹ����۽ð�
	workStart varchar2(380),
	-- �ٹ�����ð�
	workEnd varchar2(380),
	-- �ٹ���¥
	workDate date,
	-- �޿���ȣ
	salNum number(38) NOT NULL,
	PRIMARY KEY (sNum)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (askNum)
	REFERENCES ask (askNum)
;


ALTER TABLE charge
	ADD FOREIGN KEY (bookNum)
	REFERENCES book (bookNum)
;


ALTER TABLE mReview
	ADD FOREIGN KEY (bookNum)
	REFERENCES book (bookNum)
;


ALTER TABLE missing
	ADD FOREIGN KEY (branchNum)
	REFERENCES branch (branchNum)
;


ALTER TABLE purchaseFilm
	ADD FOREIGN KEY (branchNum)
	REFERENCES branch (branchNum)
;


ALTER TABLE revenue
	ADD FOREIGN KEY (branchNum)
	REFERENCES branch (branchNum)
;


ALTER TABLE staff
	ADD FOREIGN KEY (branchNum)
	REFERENCES branch (branchNum)
;


ALTER TABLE store
	ADD FOREIGN KEY (branchNum)
	REFERENCES branch (branchNum)
;


ALTER TABLE theather
	ADD FOREIGN KEY (branchNum)
	REFERENCES branch (branchNum)
;


ALTER TABLE cuponDetail
	ADD FOREIGN KEY (cuponNum)
	REFERENCES cupon (cuponNum)
;


ALTER TABLE charge
	ADD FOREIGN KEY (cDetailNum)
	REFERENCES cuponDetail (cDetailNum)
;


ALTER TABLE staff
	ADD FOREIGN KEY (divisionNum)
	REFERENCES division (divisionNum)
;


ALTER TABLE cast
	ADD FOREIGN KEY (filmNum)
	REFERENCES film (filmNum)
;


ALTER TABLE movieImg
	ADD FOREIGN KEY (filmNum)
	REFERENCES film (filmNum)
;


ALTER TABLE mReview
	ADD FOREIGN KEY (filmNum)
	REFERENCES film (filmNum)
;


ALTER TABLE purchaseFilm
	ADD FOREIGN KEY (filmNum)
	REFERENCES film (filmNum)
;


ALTER TABLE total
	ADD FOREIGN KEY (filmNum)
	REFERENCES film (filmNum)
;


ALTER TABLE film
	ADD FOREIGN KEY (genreNum)
	REFERENCES genre (genreNum)
;


ALTER TABLE ask
	ADD FOREIGN KEY (memNum)
	REFERENCES membership (memNum)
;


ALTER TABLE charge
	ADD FOREIGN KEY (memNum)
	REFERENCES membership (memNum)
;


ALTER TABLE cupon
	ADD FOREIGN KEY (memNum)
	REFERENCES membership (memNum)
;


ALTER TABLE mile
	ADD FOREIGN KEY (memNum)
	REFERENCES membership (memNum)
;


ALTER TABLE mReview
	ADD FOREIGN KEY (memNum)
	REFERENCES membership (memNum)
;


ALTER TABLE storeInfo
	ADD FOREIGN KEY (memNum)
	REFERENCES membership (memNum)
;


ALTER TABLE book
	ADD FOREIGN KEY (mScheduleNum)
	REFERENCES mSchedule (mScheduleNum)
;


ALTER TABLE branch
	ADD FOREIGN KEY (proNum)
	REFERENCES proposal (proNum)
;


ALTER TABLE mSchedule
	ADD FOREIGN KEY (purchaseFilmNum)
	REFERENCES purchaseFilm (purchaseFilmNum)
;


ALTER TABLE wSchedule
	ADD FOREIGN KEY (salNum)
	REFERENCES salary (salNum)
;


ALTER TABLE book
	ADD FOREIGN KEY (seatNum)
	REFERENCES seat (seatNum)
;


ALTER TABLE wSchedule
	ADD FOREIGN KEY (staffNum)
	REFERENCES staff (staffNum)
;


ALTER TABLE staff
	ADD FOREIGN KEY (sffNum)
	REFERENCES staffType (sffNum)
;


ALTER TABLE storeInfo
	ADD FOREIGN KEY (storeNum)
	REFERENCES store (storeNum)
;


ALTER TABLE mSchedule
	ADD FOREIGN KEY (theatherNum)
	REFERENCES theather (theatherNum)
;


ALTER TABLE seat
	ADD FOREIGN KEY (theatherNum)
	REFERENCES theather (theatherNum)
;



/* Comments */

COMMENT ON TABLE ask IS '����';
COMMENT ON COLUMN ask.askNum IS '������ȣ';
COMMENT ON COLUMN ask.memNum IS 'ȸ����ȣ';
COMMENT ON COLUMN ask.qnaTitle IS '����';
COMMENT ON COLUMN ask.askContent IS '����';
COMMENT ON COLUMN ask.askRegdate IS '�����';
COMMENT ON COLUMN ask.response IS '�亯����';
COMMENT ON TABLE book IS '�������̺�';
COMMENT ON COLUMN book.bookNum IS '����������������';
COMMENT ON COLUMN book.bookStatus IS '�������';
COMMENT ON COLUMN book.seatNum IS '�¼���ȣ������';
COMMENT ON COLUMN book.mScheduleNum IS '�󿵽����ٽ�����';
COMMENT ON COLUMN book.chargeNum IS '������ȣ';
COMMENT ON TABLE branch IS '�������̺�';
COMMENT ON COLUMN branch.branchNum IS '����������';
COMMENT ON COLUMN branch.proNum IS '������û������';
COMMENT ON COLUMN branch.brName IS '������';
COMMENT ON COLUMN branch.memId IS '������';
COMMENT ON COLUMN branch.brStatus IS '��������';
COMMENT ON COLUMN branch.brRegdate IS '������';
COMMENT ON TABLE cast IS '�⿬��';
COMMENT ON COLUMN cast.castNum IS '�⿬����ȣ';
COMMENT ON COLUMN cast.filmNum IS '��ȭ������';
COMMENT ON COLUMN cast.castName IS '����̸�';
COMMENT ON TABLE charge IS '��ȭ����';
COMMENT ON COLUMN charge.chargeNum IS '������ȣ';
COMMENT ON COLUMN charge.memNum IS 'ȸ����ȣ';
COMMENT ON COLUMN charge.cDetailNum IS '���������ǹ�ȣ';
COMMENT ON COLUMN charge.payment IS '�������';
COMMENT ON COLUMN charge.memStatus IS 'ȸ����ȸ������';
COMMENT ON COLUMN charge.chRegdate IS '������';
COMMENT ON COLUMN charge.bookNum IS '����������������';
COMMENT ON COLUMN charge.phone IS '��������ȭ��ȣ';
COMMENT ON COLUMN charge.totalBill IS '�����ݾ�';
COMMENT ON TABLE cupon IS '������';
COMMENT ON COLUMN cupon.cuponNum IS '���� ��ȣ';
COMMENT ON COLUMN cupon.cuponStatus IS '����������';
COMMENT ON COLUMN cupon.cName IS '������';
COMMENT ON COLUMN cupon.cuponStart IS '������밡�ɽ��۳�¥';
COMMENT ON COLUMN cupon.cuponEnd IS '������븸�ᳯ¥';
COMMENT ON COLUMN cupon.cSort IS '��������(����/����)';
COMMENT ON COLUMN cupon.memNum IS 'ȸ����ȣ';
COMMENT ON COLUMN cupon.cuponRate IS '���η�';
COMMENT ON TABLE cuponDetail IS '������� ������';
COMMENT ON COLUMN cuponDetail.cDetailNum IS '���������ǹ�ȣ';
COMMENT ON COLUMN cuponDetail.cArea IS '��밡������';
COMMENT ON COLUMN cuponDetail.ableDate IS '����/�ָ� ��뱸��';
COMMENT ON COLUMN cuponDetail.cuponNum IS '���� ��ȣ';
COMMENT ON TABLE division IS '�μ�';
COMMENT ON COLUMN division.divisionNum IS '�μ��ڵ�';
COMMENT ON COLUMN division.divisionName IS '�μ��̸�';
COMMENT ON TABLE film IS '��ȭ���̺�';
COMMENT ON COLUMN film.filmNum IS '��ȭ������';
COMMENT ON COLUMN film.filmName IS '��ȭ��';
COMMENT ON COLUMN film.filmStory IS '�ٰŸ�';
COMMENT ON COLUMN film.filmStart IS '������';
COMMENT ON COLUMN film.filmEnd IS '������';
COMMENT ON COLUMN film.filmPrice IS '�Ǳǰ�';
COMMENT ON COLUMN film.filmHead IS '����';
COMMENT ON COLUMN film.filmStatus IS '����';
COMMENT ON COLUMN film.genreNum IS '�帣�ڵ�';
COMMENT ON TABLE genre IS '�帣';
COMMENT ON COLUMN genre.genreNum IS '�帣�ڵ�';
COMMENT ON COLUMN genre.generName IS '�帣����';
COMMENT ON TABLE membership IS 'ȸ��';
COMMENT ON COLUMN membership.memNum IS 'ȸ����ȣ';
COMMENT ON COLUMN membership.memName IS '�̸�';
COMMENT ON COLUMN membership.memId IS '���̵�';
COMMENT ON COLUMN membership.memPwd IS '��й�ȣ';
COMMENT ON COLUMN membership.memPhone IS '��ȭ��ȣ';
COMMENT ON COLUMN membership.birth IS '�������';
COMMENT ON COLUMN membership.email IS '�̸���';
COMMENT ON COLUMN membership.garde IS 'ȸ�����';
COMMENT ON COLUMN membership.memRegdate IS '������';
COMMENT ON TABLE mile IS '���ϸ���';
COMMENT ON COLUMN mile.mileNum IS '���ϸ�����ȣ';
COMMENT ON COLUMN mile.mileDate IS '���ϸ��� ������';
COMMENT ON COLUMN mile.mile IS '���ϸ��� ';
COMMENT ON COLUMN mile.memNum IS 'ȸ����ȣ';
COMMENT ON TABLE missing IS '�нǹ��Խ���';
COMMENT ON COLUMN missing.missNum IS '�нǹ� ��ȣ';
COMMENT ON COLUMN missing.branchNum IS '����������';
COMMENT ON COLUMN missing.getDate IS '�нǹ� ������';
COMMENT ON COLUMN missing.findDate IS '�нǹ� ã�ư� ��¥';
COMMENT ON COLUMN missing.missDetail IS '�нǹ� �󼼳���';
COMMENT ON COLUMN missing.missTitle IS '�нǹ� ����';
COMMENT ON TABLE movieImg IS '��ȭ�̹���';
COMMENT ON COLUMN movieImg.movieImgnum IS '�����̹�����ȣ';
COMMENT ON COLUMN movieImg.movieImgUrl IS '�̹������';
COMMENT ON COLUMN movieImg.filmNum IS '��ȭ������';
COMMENT ON TABLE mReview IS '����Խ���';
COMMENT ON COLUMN mReview.mReviewNum IS '����ѹ�';
COMMENT ON COLUMN mReview.rContent IS '���䳻��';
COMMENT ON COLUMN mReview.likeTotal IS '���ƿ����';
COMMENT ON COLUMN mReview.mScore IS '��ȭ����';
COMMENT ON COLUMN mReview.memNum IS 'ȸ����ȣ';
COMMENT ON COLUMN mReview.filmNum IS '��ȭ������';
COMMENT ON COLUMN mReview.bookNum IS '����������������';
COMMENT ON TABLE mSchedule IS '��ȭ�󿵽�����';
COMMENT ON COLUMN mSchedule.mScheduleNum IS '�󿵽����ٽ�����';
COMMENT ON COLUMN mSchedule.mStartTime IS '�󿵽��۽ð�';
COMMENT ON COLUMN mSchedule.purchaseFilmNum IS '��ȭ�󿵱ǽ�����';
COMMENT ON COLUMN mSchedule.theatherNum IS '�󿵰�������';
COMMENT ON TABLE proposal IS '������û���̺�';
COMMENT ON COLUMN proposal.proNum IS '������û������';
COMMENT ON COLUMN proposal.memberId IS '������û���̵�';
COMMENT ON COLUMN proposal.proAddr IS '�����ּ�';
COMMENT ON COLUMN proposal.proGoal IS '����';
COMMENT ON COLUMN proposal.proScale IS '�Ը�';
COMMENT ON COLUMN proposal.proStatus IS '�������';
COMMENT ON TABLE purchaseFilm IS '��ȭ�󿵱Ǳ���';
COMMENT ON COLUMN purchaseFilm.purchaseFilmNum IS '��ȭ�󿵱ǽ�����';
COMMENT ON COLUMN purchaseFilm.filmDeadline IS '������ ��������';
COMMENT ON COLUMN purchaseFilm.purchaseDate IS '������ �󿵱� ������';
COMMENT ON COLUMN purchaseFilm.filmNum IS '��ȭ������';
COMMENT ON COLUMN purchaseFilm.branchNum IS '����������';
COMMENT ON TABLE qna IS '�����ϴ�����';
COMMENT ON COLUMN qna.qnaNum IS '������ȣ';
COMMENT ON COLUMN qna.qnaTitle IS '����';
COMMENT ON COLUMN qna.qnaContent IS '����';
COMMENT ON COLUMN qna.response IS '�亯����';
COMMENT ON TABLE reply IS '�亯�Խ���';
COMMENT ON COLUMN reply.replyNum IS '�亯';
COMMENT ON COLUMN reply.staffId IS '���̵�';
COMMENT ON COLUMN reply.qnaTitle IS '����';
COMMENT ON COLUMN reply.replyContent IS '����';
COMMENT ON COLUMN reply.replyRegdate IS '�����';
COMMENT ON COLUMN reply.askNum IS '������ȣ';
COMMENT ON TABLE revenue IS '�������';
COMMENT ON COLUMN revenue.revenueNum IS '�����ȣ';
COMMENT ON COLUMN revenue.outcome IS '����';
COMMENT ON COLUMN revenue.ticketIncome IS 'Ƽ�ϼ���';
COMMENT ON COLUMN revenue.storeIncome IS '��������';
COMMENT ON COLUMN revenue.branchNum IS '����������';
COMMENT ON COLUMN revenue.revenueDate IS '���⳯¥';
COMMENT ON TABLE salary IS '�޿�';
COMMENT ON COLUMN salary.salNum IS '�޿���ȣ';
COMMENT ON COLUMN salary.salDate IS '�޿�������';
COMMENT ON COLUMN salary.salary IS '�޿���';
COMMENT ON TABLE seat IS '�¼�';
COMMENT ON COLUMN seat.seatNum IS '�¼���ȣ������';
COMMENT ON COLUMN seat.theatherNum IS '�󿵰�������';
COMMENT ON COLUMN seat.seatX IS '�¼���x��ǥ';
COMMENT ON COLUMN seat.seatY IS '�¼���y��ǥ';
COMMENT ON COLUMN seat.seatSale IS '������';
COMMENT ON TABLE staff IS '����';
COMMENT ON COLUMN staff.staffNum IS '������ȣ';
COMMENT ON COLUMN staff.sffNum IS '����Ÿ���ڵ�';
COMMENT ON COLUMN staff.divisionNum IS '�μ��ڵ�';
COMMENT ON COLUMN staff.sffName IS '�̸�';
COMMENT ON COLUMN staff.sffAge IS '����';
COMMENT ON COLUMN staff.sffAddr IS '������';
COMMENT ON COLUMN staff.jumin IS '�ֹε�Ϲ�ȣ';
COMMENT ON COLUMN staff.gender IS '����';
COMMENT ON COLUMN staff.accountNum IS '���¹�ȣ';
COMMENT ON COLUMN staff.sffStatus IS '��������';
COMMENT ON COLUMN staff.branchNum IS '����������';
COMMENT ON TABLE staffType IS '����Ÿ��';
COMMENT ON COLUMN staffType.sffNum IS '����Ÿ���ڵ�';
COMMENT ON COLUMN staffType.generName IS '�帣����';
COMMENT ON COLUMN staffType.wage IS '�ñ�';
COMMENT ON TABLE store IS '����';
COMMENT ON COLUMN store.storeNum IS '������ȣ';
COMMENT ON COLUMN store.branchNum IS '����������';
COMMENT ON COLUMN store.storeName IS '��ǰ��';
COMMENT ON COLUMN store.storePrice IS '��ǰ����';
COMMENT ON COLUMN store.storeStatus IS '������ǰ����';
COMMENT ON TABLE storeInfo IS '��������';
COMMENT ON COLUMN storeInfo.storeInfoNum IS '����������ȣ';
COMMENT ON COLUMN storeInfo.memNum IS 'ȸ����ȣ';
COMMENT ON COLUMN storeInfo.storeNum IS '������ȣ';
COMMENT ON COLUMN storeInfo.buyRegdate IS '��������������';
COMMENT ON COLUMN storeInfo.usedMoment IS '����������';
COMMENT ON TABLE theather IS '�󿵰����̺�';
COMMENT ON COLUMN theather.theatherNum IS '�󿵰�������';
COMMENT ON COLUMN theather.branchNum IS '����������';
COMMENT ON COLUMN theather.theatherName IS '�󿵰���';
COMMENT ON TABLE total IS '��ȭ������';
COMMENT ON COLUMN total.totalNum IS '������ȣ';
COMMENT ON COLUMN total.totalPeople IS '����������';
COMMENT ON COLUMN total.totalPrice IS '�����ݾ�';
COMMENT ON COLUMN total.filmNum IS '��ȭ������';
COMMENT ON COLUMN total.totalDate IS '���ø����';
COMMENT ON TABLE wSchedule IS '�ٹ��ð�ǥ';
COMMENT ON COLUMN wSchedule.sNum IS '�ٹ���ȣ';
COMMENT ON COLUMN wSchedule.staffNum IS '������ȣ';
COMMENT ON COLUMN wSchedule.workStart IS '�ٹ����۽ð�';
COMMENT ON COLUMN wSchedule.workEnd IS '�ٹ�����ð�';
COMMENT ON COLUMN wSchedule.workDate IS '�ٹ���¥';
COMMENT ON COLUMN wSchedule.salNum IS '�޿���ȣ';



