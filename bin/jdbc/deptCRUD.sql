*table생성-컬럼단위
create table 테이블명(
컬럼명 데이터타입(크기),
컬럼명 데이터타입(크기) [제약조건],
컬럼명 데이터타입(크기) [constraint 제약조건명 제약조건],
컬럼명 데이터타입(크기) [constraint 제약조건명 제약조건 default 기본값]
);


select * from DEPT;
WHERE deptno=90


--90부서 삭제
DELETE FROM DEPT
WHERE deptno=90;

--90부서의 지역을 독도로 수정
UPDATE DEPT
SET    loc='독도'
WHERE deptno=90;



--DEPT테이블에  90,IT,서울 입력
INSERT INTO DEPT
VALUES(90,'IT','서울');


--시퀀스 생성
--create sequence 시퀀스명
--start with 시작값
increment by 증감값
--maxvalue 최대값
--minvalue 최소값
--cycle	|	nocycle;

create sequence eno_seq
start with 8000
increment by 1
maxvalue 9999
nocycle;

--sequence사용 시퀀스명.nextval()
insert into emp(empno,ename,sal,hiredate)
values(eno_seq.nextval,'홍1',3000,sysdate);

select empno,ename,sal,hiredate from emp
where empno>=7900
order by empno desc;

update emp
set sal=sal+100
where empno=8000;

delete from emp
where empno=8000;


*delete문법
DELETE [FROM] 테이블명
[WHERE 조건]

*update문법
UPDATE 테이블명
SET    컬럼명=새값, 컬럼명=새값...
[WHERE 조건]

*insert문법
INSERT INTO 테이블명
VALUES(값,값,..);

*select문법
SELECT  {* | 컬럼명 [as] 별칭}
FROM		테이블명
[WHERE  조건]
[GROUP  BY 그룹기준]
[HAVING 그룹조건]
[ORDER  BY 정렬기준 정렬방식]
정렬방식 
-오름차순(기본,ASC) : 숫자 작->큰, A->Z, ㄱ->ㅎ, 예전->최근
-내림차순(DESC)