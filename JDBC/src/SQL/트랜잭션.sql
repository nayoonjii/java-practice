--트랜잭션 실습을 위한 테이블 생성
create table dept51(
 deptno number(38) primary key --부서번호
 ,dname varchar2(50) --부서명
);

insert into dept51 values(101,'영업부');
insert into dept51 values(102,'인사부');

select * from dept51 order by deptno asc;

--dept52 복제본 테이블을 생성
create table dept52 as select * from dept51;

select * from dept52 order by deptno asc;


--dept53 복제본 테이블 생성
create table dept53 as select *from dept51;

select * from dept54 order by deptno asc;

--savepoint실습을 위한 레코드 저장
insert into dept54 values(103,'개발부');
insert into dept54 values(104,'디자인부');

select * from emp01;

--데드락 실습을 위한 복제본 테이블 emp20을 생성
create table emp20 as select * from emp01;

select * from emp20;











