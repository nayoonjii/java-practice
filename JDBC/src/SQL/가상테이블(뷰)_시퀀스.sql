/* 가상테이블 뷰 실습을 위한 원본테이블 생성 실습 */
create table emp_copy(
 empno number(38) primary key
 ,ename varchar2(50)
 ,job varchar2(50)
 ,sal int
 ,comm int
 ,deptno number(38)
);

insert into emp_copy values(201,'홍길동','관리사원',100,10,101);
insert into emp_copy values(202,'이순신','개발사원',200,20,102);

select * from emp_copy order by empno asc;

--emp_view30 가상테이블 뷰 생성
create view emp_view30
as
select empno,ename,deptno from emp_copy where deptno=101;

--뷰를 통해서 실제 테이블 레코드 검색
select * from emp_view30;

--생성된 뷰이름과 뷰 생성시 사용한 서브 쿼리문 확인
select veiw_name, text, from user_views;

--뷰를 통해 레코드 저장
insert into emp_view30 values(203,'신사임당님', 102);

select* from emp_copy order by empno asc;

/* 가상테이블 뷰를 사용하는 목적)
 * 1. 실제 테이블을 숨기는 보안효과
 * 2. 실제 테이블의 복잡하고 긴 쿼리문을 뷰를 통해 단순화 시킬수 있다. 
 */
--기본키가 있는 부모 (주인) 테이블 dept86테이블 생성
create table dept86(
	deptno number(38) constraint dept86_deptno_pk primary key -- 부서번호
	,dname varchar2(50) constraint dept86_dname_nn not null --부서이름
	,LOC varchar2(100) --부서지역
);

insert into dept86 values(10,'영업부','서울');
insert into dept86 values(20,'인사부','서울 강남');

select * from dept86 order by deptno asc;

--외래키가 있는 종속 즉 자식테이블 emp86을 생성
create table emp86(
	empno number(38) constraint emp86_empno_pk primary key--사원 번호
	,ename varchar2(50) constraint emp86_ename_nn not null --사원명
	,sal int --급여
	,job varchar(50) --직종
	,comm int --보너스
	,deptno number(38) constraint emp86_deptno_fk references dept86(deptno) --외래키 설정
);

insert into emp86 values (101,'이순신',3000,'영업사원',300,10);
insert into emp86 values (102,'강감찬',6000,'영업과장',600,10);
insert into emp86 values (103,'신사임당',6000,'인사과장',0,20);

select * from emp86 order by empno asc;

--Equi 조인검색
select empno,ename,sal,job,comm,d.deptno,dname from emp86 e, dept86 d 
where d.deptno = e.deptno and e.deptno = 10 order by empno asc;

--복잡한 조인 쿼리문을 뷰를 통해 단순화)
create view join_view
as
select empno,ename,sal,job,comm,d.deptno,dname from emp86 e, dept86 d 
where d.deptno = e.deptno and e.deptno = 10 order by empno asc;

--뷰를 통한 조인 검색
select * from join_view 

--삭제할 del_view 생성
create view del_view
as 
select empno,ename, from emp86;

--생성된 뷰이름 확인
select view_name from user_view;

--del_view 가상 테이블 삭제
drop view del_view;

--가상테이블 뷰 생성추가 옵션 명령어 or replace 실습
create view re_view
as
select empno,ename from emp86;

select * from re_view;

--or replace옵션 명령어 기존 뷰내용을 수정
create or replace view re_view
as
select empno, ename, sal from emp86;

select* from re_view;

--force 옵션을 사용하면 기존 테이블이 없어도 가상테이블 뷰가 생성
create or replace force view for_view
as
select empno,ename from abc;

--with check option을 사용한 뷰 생성
create or replace view view_check
as
select empno,ename,deptno from emp86 where deptno = 20 with check option;

--deptno컬럼은 with check option 옵션과 함께 뷰생성시 조건에서 사용했기 때문에 이 컬럼 자료는 수정못함
update view_check set deptno = 10 where empno = 103;

--with read only 옵션을 사용한 뷰 생성
create or replace view only_view
as
select empno,ename,sal,comm,deptno from emp86 where deptno =20 with read only;

--with read only 옵션을 사용해서 생성된 뷰는 읽기만 가능해서 뷰를 통한 어떤 컬럼 자료도 수정못함.
update only_view set comm= 600 where deptno = 20;

--rownum 컬럼 실습을 위한 테이블 생성
create table emp92(
	empno number(38) primary key
	,ename varchar2(50)
	,sal int
);
insert into emp92 values(1,'홍길동',1000);
insert into emp92 values(2,'이순신',2000);
insert into emp92 values(3,'강감찬',3000);

select rownum,empno,ename,sal from emp92 order by empno asc;

--사원번호를 기준으로 내림차순 정렬하는 뷰를 생성
create or replace view row_view
as
select empno,ename,sal from emp92 order by empno desc;

select rownum,empno,ename,sal from row_view;

delete from emp92 where empno=2;

--가장 최근에 입사한 사원 구하기
select rownum,empno,ename,sal from row_view where rownum <=1;

--가장 최근에 입사한 사원 구하기 => 인라인뷰 서브쿼리문
select rownum,empno,ename,sal from (select empno,ename,sal from emp92 order by empno desc)
where rownum<=1;

/* 시퀀스 실습
 * 시퀀스는 번호 발생기 이다.
 */
--현재 만들어진 시퀀스 이름과 증가값 확인
select sequence_name,increment_by from user_sequences

--dept_deptno_seq 시퀀스 생성
create sequence dept_deptno_seq
start with 1 --1부터 시작
increment by 1 --1씩 증가
nocache; --임시 메모리를 사용하지 않겠다

--dept_deptno_seq 시퀀스 다음 번호값 확인
select dept_deptno_seq.nextval as "시퀀스 번호값" from dual;

--삭제할 시퀀스 명 생성
create sequence dept_del_seq;

--시퀀스 삭제
drop sequence dept_del_seq;
drop sequence dept_deptno_seq;

--시퀀스 생성
create sequence dept_deptno_seq
start with 10
increment by 10
maxvalue 30; --시퀀스 최대값 30

--생성된 시퀀스명, 증가값,최대값 확인
select sequence_name,increment_by,max_value from user_sequences;

select dept_deptno_seq.nextval from dual;--시퀀스 최대값 30을 오버하면 에러가 발생

--시퀀스 최대값을 1000으로 수정
alter sequence dept_deptno_seq
maxvalue 1000;















