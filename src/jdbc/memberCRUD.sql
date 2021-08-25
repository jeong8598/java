--회원테이블삭제
drop table member;

*table생성-컬럼단위
create table 테이블명(
컬럼명 데이터타입(크기),
컬럼명 데이터타입(크기) [제약조건],
컬럼명 데이터타입(크기) [constraint 제약조건명 제약조건],
컬럼명 데이터타입(크기) [constraint 제약조건명 제약조건 default 기본값]
);
create table board(
no number(4) constraint board_no_pk primary key,
writer varchar2(100) constraint board_writer_n not null,
title varchar2(300) constraint board_title_n not null,
content varchar2(3000) constraint board_content_n not null,
writeDate date default sysdate,
hit number(10) default 0
);

--회원테이블
create table member(
mno	number(5) constraint member_mno_pk primary key,		/*회원번호*/
mname varchar2(30),	/*이름*/
mid varchar2(20),			/*ID*/
mpwd varchar2(20) ,		/*비번*/
mdate date	 default sysdate	/*회원가입일*/
);

insert into member
values (eno_seq.nextval,'홍1','hid','1234',sysdate);
insert into member
values (eno_seq.nextval,'홍2','kid','1234',sysdate);
insert into member
values (eno_seq.nextval,'홍3','qid','1234',sysdate);

update member 
set mname='홍유원',mpwd='1111'
where mno=8003;

delete from member
where mno=8003;

select mno,mname,mid,mpwd,mdate from member;

