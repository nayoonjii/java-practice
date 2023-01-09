--insert 문 실습을 위한 테이블 생성
create table emp26(
 empno number(38) primary key --사원번호
 ,ename varchar2(30) --사원명
 ,LOC varchar2(50) --사는지역
);

--컬럼명 명시하고 레코드 저장실습
insert into emp26 (LOC,ename,empno) values('서울','홍길동',12);

select * from emp26;

--컬럼명을 생략하고 레코드 저장
insert into emp26 values(13,'이순신','부산');

--insert all문 실습을 위한 테이블 생성)
create table emp27(
 empno number(38) primary key --사원번호
 ,ename varchar2(30) --사원명
 ,sal number(38) --급여
 ,LOC varchar2(50) --사는 지역
 ,deptno int --부서번호
);

insert into emp27 values(101,'강감찬',1000,'서울시 서초구',10);
insert into emp27 values(102,'이순신',1500,'서울시 서대문구',20);
insert into emp27 values(103,'세종대왕',2000,'서울시 양천구',20);

select * from emp27 order by empno asc;

--조건식을 거짓으로 해서 테이블 구조만 복제되고,레코드는 복제되지 않는 emp28 복제테이블 생성
create table emp28 as select empno,ename,sal from emp27 where 10=0;
--복제테이블은 컬럼은 복제되지만 제약조건은 복제되지 않는다.

select * from emp28;

--조건식을 거짓으로 한 emp29 복제테이블 생성
create table emp29 as select empno,ename,LOC from emp27 where 7=0;

select * from emp29;

--insert all문을 사용한 하나이상 테이블에 다중행 레코드 저장실습
insert all
into emp28 values(empno,ename,sal)
into emp29 values(empno,ename,LOC)
select empno,ename,sal,LOC from emp27 where deptno=20;

--insert all when 조건식 then문 실습을 위한 복제테이블 생성
--emp30복제테이블 생성
create table emp30 as select empno,ename,deptno from emp27 where 5=0;

select * from emp30;

--emp31 복제테이블 생성
create table emp31 as select empno,ename,sal from emp27 where 15=0;

select * from emp31;

select empno,ename,sal,deptno from emp27;

--insert all when 조건식 then문을 이용한 조건에 맞는 레코드만 복수개의 테이블에 다중행 저장 실습
insert all 
when sal>=1000 then --급여가 1000이상인 경우 다중행 저장실습
into emp31 values(empno,ename,sal)
when deptno=20 then --부서번호가 20인 경우 다중행 저장실습
into emp30 values(empno,ename,deptno)
select empno,ename,sal,deptno from emp27;

select * from emp31 order by empno asc;
select * from emp30 order by empno asc;




























