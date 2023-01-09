--단일행 서브쿼리 실습을 위한 테이블 생성
create table dept15(
  deptno number(38) primary key --부서번호
  ,dname varchar2(50) --부서명
);

insert into dept15 values(10,'관리부');
insert into dept15 values(20,'영업부');
insert into dept15 values(30,'연구부');

select * from dept15 order by deptno;

--사원테이블 생성
create table emp15(
 empno number(38) primary key --사원번호
 ,ename varchar2(50) --사원명
 ,job varchar2(50) --직종
 ,sal number(38) --급여
 ,comm number(38) --보너스
 ,deptno number(38) --부서번호
);
insert into emp15 values(21,'홍길동','관리사원',1500,0,10);
insert into emp15 values(22,'이순신','영업사원',1200,100,20);
insert into emp15 values(23,'강감찬','영업사원',1500,200,20);
insert into emp15 values(24,'세종대왕','연구사원',3000,300,30);
insert into emp15 values(25,'신사임당','연구사원',2500,250,30);

select * from emp15 order by empno asc;--asc 오름차순 정렬문은 생략가능

--단일행서브쿼리문 실습
select dname from dept15 where deptno=(select deptno from emp15 
where ename='홍길동');

--사원들의 급여 평균
select avg(sal) from emp15;

--단일행 서브쿼리로 평균 급여보다 더 많은 급여를 받는 사원을 검색
select ename,sal from emp15 where sal > (select avg(sal) from emp15);

--급여가 1200이상인 부서번호를 중복을 제거해서 검색
select distinct deptno from emp15 where sal>=1200;

/* in 다중행 서브쿼리 연산자는 서브쿼리문 검색 결과값 중 하나라도 일치하면 참이되는 연산이다.
 */
select ename,sal,deptno from emp15 where deptno in(select distinct deptno
from emp15 where sal>=1200);

/* > ALL 다중행 서브쿼리 연산자는 20번 부서의 최대급여 보다 크면 참이되는 연산이다.그러므로 20번 영업부서
 *  사원의 최대급여보다 큰 자료를 검색
 */
SELECT ename ,sal,deptno from emp15 where sal > ALL(select sal from
emp15 where deptno=20);

/* > Any 다중행 서브쿼리 연산자는 20번 부서의 최소급여보다 크면 참이되는 연산이다.  20번 부서의 최소급여 보다
 * 큰 자료를 검색한다.
 * 서브쿼리 검색 결과 레코드가 하나 이상인 경우는 반드시 다중행 서브쿼리 연산을 사용해야 한다.
 */
select ename,sal from emp15 where sal > any (select sal from emp15
where deptno=20);

--서브쿼리를 이용해서 emp15원본 테이블로 부터 테이블 구조와 레코드를 복제한 emp16 테이블을 생성
create table emp16 as select * from emp15;

select * from emp16 order by empno asc;

--원하는 컬럼과 레코드만 복제
create table emp17 as select empno,ename,sal from emp15;

select * from emp17 order by empno asc; -- asc문은 생략가능하다.

--30번 부서 레코드만 복제
create table emp18 as select * from emp15 where deptno=30;

select * from emp18 order by empno;

/* 조건식을 거짓으로 해서 테이블 구조만 복제하고,레코드는 복제하지 않는다. 
 */
create table emp19 as select * from emp15 where 10=0;

select * from emp19;
















