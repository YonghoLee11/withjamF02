

--WITHJAM

--db생성

create schema WITHJAM default character set utf8;

--db 접속

use withjam;

--테이블 생성

-- 회원테이블
CREATE TABLE MEMBERS (
UID     INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
EMAIL   VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
PWD     VARCHAR(20)  NOT NULL COMMENT '비밀번호', -- 비밀번호
UNAME   VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
UPHOTO  VARCHAR(50)  NULL     COMMENT '회원사진', -- 회원사진
COMMENT VARCHAR(255) NULL     COMMENT '코멘트', -- 코멘트
USCORE  INTEGER      NOT NULL COMMENT '인기도', -- 인기도
MDATE   DATE         NOT NULL COMMENT '가입일' -- 가입일
)
COMMENT '회원테이블';

-- 회원테이블
ALTER TABLE MEMBERS
ADD CONSTRAINT PK_MEMBERS -- 회원테이블 기본키
PRIMARY KEY (
UID -- 회원번호
);
        

-- 회원테이블 유니크 인덱스
CREATE UNIQUE INDEX UIX_MEMBERS
ON MEMBERS ( -- 회원테이블
EMAIL ASC -- 이메일
);


ALTER TABLE MEMBERS
MODIFY COLUMN UID INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원번호’;



--친구테이블
CREATE TABLE FRIEND (
	UID  INTEGER NOT NULL COMMENT '회원번호', -- 회원번호
	F_UID INTEGER NOT NULL COMMENT '친구회원번호' -- 친구회원번호
)
COMMENT '친구테이블';

-- 친구테이블
ALTER TABLE FRIEND
	ADD CONSTRAINT PK_FRIEND -- 친구테이블 기본키
		PRIMARY KEY (
			UID,  -- 회원번호
			F_UID  -- 친구회원번호
		);

-- 음원
CREATE TABLE BOARD (
	BNO     INTEGER      NOT NULL COMMENT '음원번호', -- 음원번호
	UID     INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
	TITLE   VARCHAR(50)  NOT NULL COMMENT '제목', -- 제목
	CONTENT VARCHAR(255) NOT NULL COMMENT '내용', -- 내용
	BDATE   DATE         NOT NULL COMMENT '작성일', -- 작성일
	BF_NAME VARCHAR(50)  NULL     COMMENT '파일이름' -- 파일이름
)
COMMENT '음원';

-- 음원
ALTER TABLE BOARD
	ADD CONSTRAINT PK_BOARD -- 음원 기본키
		PRIMARY KEY (
			BNO -- 음원번호
		);

ALTER TABLE BOARD
	MODIFY COLUMN BNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '음원번호';



-- 친구테이블
ALTER TABLE FRIEND
	ADD CONSTRAINT FK_MEMBERS_TO_FRIEND -- 회원테이블 -> 친구테이블
		FOREIGN KEY (
			UID -- 회원번호
		)
		REFERENCES MEMBERS ( -- 회원테이블
			UID -- 회원번호
		);

-- 친구테이블
ALTER TABLE FRIEND
	ADD CONSTRAINT FK_MEMBERS_TO_FRIEND2 -- 회원테이블 -> 친구테이블2
		FOREIGN KEY (
			F_UID -- 친구회원번호
		)
		REFERENCES MEMBERS ( -- 회원테이블
			UID -- 회원번호
		);


-- 음원
CREATE TABLE BOARD (
	BNO     INTEGER      NOT NULL COMMENT '음원번호', -- 음원번호
	UID     INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
	TITLE   VARCHAR(50)  NOT NULL COMMENT '제목', -- 제목
	CONTENT VARCHAR(255) NOT NULL COMMENT '내용', -- 내용
	BDATE   DATE         NOT NULL COMMENT '작성일', -- 작성일
	BF_NAME VARCHAR(50)  NULL     COMMENT '파일이름' -- 파일이름
)
COMMENT '음원';


-- 음원
ALTER TABLE BOARD
	ADD CONSTRAINT PK_BOARD -- 음원 기본키
		PRIMARY KEY (
			BNO -- 음원번호
		);

ALTER TABLE BOARD
	MODIFY COLUMN BNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '음원번호';


-- 음원
ALTER TABLE BOARD
	ADD CONSTRAINT FK_MEMBERS_TO_BOARD -- 회원테이블 -> 음원
		FOREIGN KEY (
			UID -- 회원번호
		)
		REFERENCES MEMBERS ( -- 회원테이블
			UID -- 회원번호
		);
