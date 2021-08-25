--테이블 생성
create table company(
cno number constraint company_cno_p primary key,
cname varchar2(30) constraint company_cname_n not null,
ceo varchar2(30),
tel varchar2(20),
dam varchar2(30)
);

--시퀀스생성
create sequence cno_seq
start with 1111
increment by 1
maxvalue 9999
nocycle;

--데이터넣기
insert into company(cno, cname)
values (cno_seq.nextval,'지원상사');

--company조회
select cno, cname from company
where cno>1111
order by cno desc;