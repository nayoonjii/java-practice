--인덱스 실습을 위한 테이블 생성
create table emp201(
	empno number(38) primary key
	,ename varchar2(50)
	,sal int
);
insert into emp201 values(11,'홍길동',100);
insert into emp201 values(12,'이순신',200);
insert into emp201 values(13,'강감찬',300);

select * from emp201 order by empno asc;

--서브쿼리로 복사본 테이블 emp202를 생성
create table emp202 as select * from emp201;--인덱스와 제약조건은 복제되지 않는다.

--생성된 인덱스 확인
select table_name,index_name,column_name from user_ind_columns where table_name in('EMP201','EMP202');

select * from emp202 order by empno asc;

--서브 쿼리로 레코드를 저장 -> 복제본 테이블은 제약조건을 복제하지 않는다.primary key가 복제되지 않아 insert가 가능하다
insert into emp202 select * from emp202;

--emp202 테이블 ename컬럼에 인덱스 적용
create index idx_emp202_ename on emp202(ename);

--emp202테이블의empno 컬럼에 인덱스 적용
create index idx_emp202_empno on emp202(empno);

--idx_emp202_empno 인덱스 삭제
drop index idx_emp202_empno;

--조건을 거짓으로 해서 복제본 테이블 생성 -> 테이블 구조는 복제되지만 레코드는 복제되지 않는다. 제약조건과 인덱스도 복제되지 않는다.
create table emp203 as select * from emp202 where 10=0;

select * from emp203 order by empno asc;

insert into emp203 values(10,'신사임당',1000);
insert into emp203 values(20,'세종대왕님',2000);
insert into emp203 values(30,'신사임당',3000);

--중복 레코드가 없는 empno컬럼에 고유 인덱스 생성
create unique index idx_emp203_empno on emp203(empno);

--중복 자료가 있는 ename컬럼에 비고유 인덱스 생성
create index idx_emp203_ename on emp203(ename);

--권한이 할당된 사용자, 테이블명, 권한을 준 사용자, 권한이름
select grantee,table_name,grantor,privilege from user_tab_privs_made;

revoke select on emp from user01;--user01 사용자로 부터 emp테이블 검색권한을 철회

select * from dept;

select empno,ename from emp where ename = '홍길동';

select ename,job from emp;

select empno,ename,job,deptno from emp where ename = '홍길동';

select * from emp order by empno asc;

select * from emp order by empno asc;
update emp15 set comm = null where ename = '홍길동';


