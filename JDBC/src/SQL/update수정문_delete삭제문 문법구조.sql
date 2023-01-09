--emp35 복제본 테이블 생성
create table emp35 as select * from emp27;

select * from emp35 order by empno asc;

--모든 사원의 부서번호를 30으로 변경
update emp35 set deptno=30;

--101번 사원의 부서번호를 20으로 변경
update emp35 set deptno=20 where empno=101;

/* 서브 쿼리를 이용한 레코드 수정 실습을 위한 테이블 생성*/
create table dept(
  deptno number(38) primary key --부섭번호
  ,dname varchar2(50) --부서명
  ,LOC varchar2(30) --지역명
);

insert into dept values(10,'경리부','서울');
insert into dept values(20,'영업부','부산');
insert into dept values(30,'관리부','인천');
insert into dept values(40,'연구부','대전');

select * from dept order by deptno asc;

--dept01 복제본 테이블 생성
create table dept01 as select * from dept;

select * from dept01 order by deptno asc;

/* dept원본테이블의 40번 부서의 부서명과 부서지역을 검색해서 dept01테이블의 20번 부서의 부서명과 부서지역을
 * 수정하는 실습이다.
 */
update dept01 set (dname,LOC) = (select dname,LOC from dept where deptno=40)
where deptno=20;

--40번 부서번호 레코드를 삭제
delete from dept01 where deptno=40;

select * from emp27 order by empno;

--서브쿼리문을 이용한 자료 삭제연습
delete from emp27 where deptno=(select deptno from dept01 where dname='경리부');

























