--한줄 주석문 기호
/* 한줄 이상 주석문 기호. 
 */
select * from tab; --현재 접속중인 night 오라클 사용자가 사용가능한 테이블 
--종류

/* 테이블 생성문법 형식)
 * create table 테이블명(
 *   컬럼명(필드명,열명) 자료형(크기) 제약조건
 * , ... 
 * );
 * 제약조건이란?컬럼명에 데이터가 저장되는대 어떠한 제한을 가하는 것을 말한다.
 * 제약조건 종류)
 *  1.primary key(기본키 제약조건) : 중복 자료 저장금지, null금지
 *  2.not null:중복자료는 허용하고,null저장금지.
 */
--dept01 테이블을 생성)
create table dept01(
  deptno number(38) primary key --부서번호
  ,dname varchar2(50) not null --부서명
  ,LOC varchar2(50) --부서지역
);
/*오라클 자료형 종류)
 * 1.number(38) : 최대자리수가 38자까지 정수 숫자를 저장 가능한 정수 숫자형
 * 2.varchar2 : 가변문자형
 */

/* 레코드란 컬럼에 저장된 한행의 자료 집합을 말한다.
 * 컬럼에 저장된 자료를 검색하는 select문 형식)
 * select 컬럼목록 from 테이블명 where 조건식 order by 기준필드  asc(desc);
 * 
 * asc 오름차순 정렬 특징)
 *  1.한글은 가나다 순으로 정렬
 *  2.숫자는 작은 숫자부터 정렬된다.
 *  3.영어는 알파벳순으로 정렬
 *  4.asc문은 정렬문에 기본값으로 생략이 가능하다.
 * 
 *  desc 내림차순 정렬 특징)
 *  한글은 가나다 역순,영어는 알파벳 역순, 숫자는 큰숫자부터 먼저  정렬됨.
 */
select * from dept01 order by deptno asc; --부서번호를 기준으로 내림차순 정렬

/* 레코드 저장문법 형식)
 * insert into 테이블명 (컬럼목록) values(값,..); 
 */

insert into dept01 values(10,'총무부','서울'); --sql문에서 문자열 자료는 ''작은 따옴표로 처리

/* 레코드 수정문 형식)
 *  update 테이블명 set 컬럼명=수정할 값,...  where 조건식; 
 */
update dept01 set dname='개발부' where deptno=10; --10번 부서번호의 부서병을 개발부로
--변경.

select dname from dept01 where deptno=10; 

--삭제할 레코드 하나 저장
insert into dept01 values(20,'기획부','인천');

select * from dept01 order by deptno asc;--부서번호를 기준으로 오름차순 정렬. 작은 숫자 부
--서번호가 먼저 정렬 검색된다. asc문은 생략가능하다.

/* 레코드 삭제 문법 형식)
 * delete from 테이블명 where 조건식;
 */
delete from dept01 where deptno=20; --20번 부서번호 자료를 삭제


alter table dept01 modify(dname varchar2(30)); --dname컬럼 크기를 50에서 30으로 변경

--테이블 이름을 변경
rename dept01 to dept02 --dept01테이블명을 dept02로 변경

select * from dept02;

truncate table dept02; --dept02테이블의 모든 레코드 내용을 삭제

/* 테이블 삭제문형식)
 * drop table 테이블명; 
 * 테이블을 삭제하면 구조와 자료 모두 삭제
 */
drop table dept02; --dept02테이블을 삭제

/* 테이블 구조 알기)
 *  desc(describe) 테이블명; 
 */

/* sysdate 오라클 날짜 함수 
 */
select sysdate from dual;

/* 오라클 산술 연산자 종류)
 * +(덧셈), -(뺄셈), *(곱셈), /(나눗셈)
 */

--null인 보너스는 제대로 된 연봉계산을 못한다.
create table emp01(
 empno number(38) primary key -- 사원번호
 ,ename varchar2(50) not null --사원명
 ,sal int --급여
 ,comm int --보너스 
 ,deptno number(38) --부서번호
);

insert into emp01 values(11,'홍길동',1500,150,10);

--보너스를 뺀 레코드를 저장
insert into emp01 (empno,ename,sal,deptno) values(12,'이순신',1800,20);

select * from emp01 order by empno asc;--asc문은 생략가능

--급여*12+보너스=연봉 => comm 보너스 컬럼값이 null인 경우는 제대로 된 연봉을 계산못한다.
select ename,sal,comm,sal*12+comm as "보너스가 포함된 연봉" from emp01;--as문은 검색되는
--컬럼명을 임시적으로 as문에서 지정한 것이 나오게 된다.원본 컬럼명이 변경되는 것은 아니다.  as문은 컬럼명 별칭
--을 지정하는 것이다.

--오라클 nvl()함수를 사용해서 null인 연봉을 0으로 변경한 후 연봉을 계산하면 된다.
select ename,sal,nvl(comm,0), sal*12+nvl(comm,0) from emp01;

select * from emp01;

insert into emp01 values(13,'강감찬',2000,200,10);

--부서번호가 중복되어 져서 출력
select ename,deptno from emp01 order by deptno asc;

select distinct deptno from emp01;--distinct키워드로 중복번호를 제거하고 출력

/* 오라클 비교연산자 종류)
 *  =(같다), >(~보다 크다), <(~보다 작다), >=(~보다 크거나 같다), <=(~보다 작거나 같다),
 *  같지 않다.(!=, <> , ^=)
 */
select * from emp01 order by empno asc; --asc오름차순 정렬문은 생략가능함.

 /* 문제) 월급이 1800 이상인 사원번호,사원명,급여,보너스 를 출력되게 해본다. */
--풀이 sql문 시작
  select empno,ename,sal,nvl(comm,0) from emp01 where sal >= 1800;

/* 대소문자 구분에 관한것)
 *  1.sql문은 대소문자를 구분하지 않는다.
 *  2.영문자 레코드값은 대소문자를 구분한다.
 */
  insert into emp01 values(14,'lee',2200,220,30);
  
  select empno,ename,sal from emp01 where ename='LEE';--영문 소문자 'lee'로 저장된 사원
  --명을 영문대문자 'LEE'로 검색해서 원하는 레코드가 검색 안된다.
  
  select * from emp01 where ename='lee'; --쿼리문에서 문자는 '' 작은 따옴표로 처리한다.
  
  /* 논리연산자 종류)
   *  1. And: 두가지 조건 모두 참이어야 검색된다.
   *  2. or(논리합) : 두가지 조건중에서 하나라도 참이면 검색된다
   *  3. not(논리부정) : 조건에 만족하지 못한 것만 검색된다.
   */
  select * from emp01 where not deptno=10; --10번 부서번호가 아닌 경우 검색
  
  select ename,sal,deptno from emp01 where deptno=10 and ename='강감찬';--부서번호
  --가 10이고 강감찬 사원을 검색한다.
  
  select empno,ename,sal,deptno from emp01 where deptno=10 or ename='lee';
  --부서번호가 10이거나 사원명이 lee인 경우 검색
  
  /* 문제)부서번호가 10이 아닌 경우에 해당하는 사원명,급여,부서번호를 검색되게 해보자. 조건) 오라클의 
   *  같지 않다의 모든 비교연산자를 활용한다.
   */
  --sql코드 시작
  select ename,sal,deptno from emp01 where deptno != 10;
  select ename,sal,deptno from emp01 where deptno ^= 10;
  select ename,sal,deptno from emp01 where deptno <> 10;

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


































