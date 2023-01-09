--테이블 합병(merge)을 위한 원본 테이블 생성
create table emp(
  empno int primary key --사원번호
  ,ename varchar(20) --사원명
  ,job varchar2(50) --직종
  ,sal number(38)
  ,deptno number(38)
);

insert into emp values(101,'홍길동','개발부',5000,10);
insert into emp values(102,'이순신','개발부',6000,10);
insert into emp values(103,'강감찬','디자인부',3000,20);

select * from emp order by empno;

--emp01 복제테이블 생성
create table emp01 as select * from emp;

select * from emp01 order by empno;

--개발부서만 복제
create table emp02 as select * from emp where job='개발부';

select * from emp02 order by empno;

--emp02테이블의 job컬럼 전체 레코드값을 test로 변경->where조건문이 없다.
update emp02 set job='test';

--104번 사원정보를 저장
insert into emp02 values(104,'을지문덕','top',2000,30);

--테이블 합병
merge into emp01
using emp02
on(emp01.empno=emp02.empno)
when matched then --기존에 데이터가 있다면
 update set
   emp01.ename=emp02.ename,
   emp01.job=emp02.job,
   emp01.sal=emp02.sal,
   emp01.deptno=emp02.deptno
   
when not matched then --기존에 데이터가 없다면
  insert values(emp02.empno,emp02.ename,emp02.job,emp02.sal,emp02.deptno);

   
select * from emp01 order by empno asc;





















