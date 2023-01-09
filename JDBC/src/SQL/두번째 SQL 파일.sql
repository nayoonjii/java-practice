select * from emp01;

--급여가 2000이상이고 3000이하인 자료만 검색
select * from emp01 where sal>=2000 and sal <= 3000;

/* 문제)급여가 2000이하이거나 3000 이상인 자료만 검색
*/
--sql문 코드 시작
select * from emp01 where sal <= 2000 or sal>=3000;

/* 문제) 보너스가 150 이거나 null 이거나 200인 자료를 검색한다. null은 = 비교연산자로 검색안된다.
 */
select ename,sal,comm from emp01 where comm =150 or comm is null or comm=200;

/*
  특정 범위의 값을 조회하기 위해서 between A and B연산자를 활용한다. A에는 범위 내의 최소값, B에는 범위 내의
  최대값이 들어간다.
*/
--2000에서 3000사이의 급여를 받는 사원을  between and 연산자로 검색
select ename,sal from emp01 where sal between 2000 and 3000;

--급여가 2000에서 3000사이가 아닌 자료를 검색
select ename,sal from emp01 where sal not between 2000 and 3000;

/* in 연산자)
 * 컬럼명 in(A,B,C) : 특정 컬럼의 값이 A,B,C중 어느 하나만 만족하더라도 검색이 된다.
 */
select * from emp01;
select ename,sal,comm from emp01 where comm in(150,200,220);

--급여가 1500,2000,1800이 아닌 자료를 검색
select ename,sal,comm from emp01 where sal not in(1500,1800,2000);

/*
 * like검색연산자 키워드와 와일드 카드
 * % : 하나이상의 임의의 모르는 문자와 매핑 대응
 */
select ename ,sal from emp01 where ename like '홍%'; --홍으로 시작하는 이름을 검색.결국 홍
--씨는 모두 검색

--앞뒤 성과 이름은 모르고 중간 이름인 길만 아는 경우 검색
select ename from emp01 where ename like '%길%'; --가장 많이 사용되는 검색형태

--3자의 성이름중에서 성과 중간이름만 알고 마지막 이름 한자를 모를 경우 검색
select ename from emp01 where ename like '홍길_'; -- _와일드 카드는 단 하나의 임의의 모르는 
--문자와 매핑대응 한다.

--성과 이름중에서 길을 포함하지 않은 성이름을 검색
select ename from emp01 where ename not like '%길%';

--보너스에서 null인 자료 검색
select ename,comm from emp01 where comm is null; --null인 경우는 is null연산을 사용하
--고, =같다 연산자로는 검색 못한다.

--보너스가 null이 아닌 자료를 검색
select ename, comm from emp01 where comm is not null; --is not null연산은 해당 컬럼
--이 null아닌경우에 검색

select 5*5 as "5*5=25" from dual;

/* dual테이블 특징)
 *  1.dual테이블은 오라클 설치시 설치되는 테이블로 오라클 연산 결과값,시퀀 번호값, 함수 결과값 확인용도 등으
 * 로 많이 활용됨.  
 */

--sysdate 오라클 날짜함수
select sysdate from dual;

select -10, abs(-7) as "양의 절대값" from dual; --abs() 함수는 절대값을 구함.

select 34.5678, floor(34.5678) from dual;--floor()함수는 소수점이하는 반올림 하지 않고 버림

select 34.5678, round(34.5678,2) from dual;--round(34.5678,2)함수에서 2로 지정하면
--소수점 이하 3번째 자리에서 반올림하여 소수점 이하 두번째 자리까지 구한다.

select trunc(34.5678,2) from dual;--trunc함수의 두번째 인자값이 2이면 소수점이하 3번째 자리에서
--버림연산을 하여 소수점 이하 두번째 자리까지 표시.

--mod는 나머지를 구하는 함수
select mod(27,5) from dual;--나머지 2

--영문대문자로 변경하는 upper()함수
select upper('oracle') from dual;

--영문소문자로 변경하는 lower()함수
select lower('ORACLE') from dual;

--왼쪽공백 제거는 LTRIM(),오른쪽 공백 제거는 rtrim(),양쪽 공백제거는 trim() 함수
select trim(' oracle ') from dual;

--sysdate날짜함수를 활용해서 어제날짜,오늘날짜,내일날짜를 구해보자.
select sysdate-1 어제, sysdate 오늘, sysdate+1 내일 from dual;

/* 형변환함수 종류)
 *  to_char() : 날짜형 또는 숫자형을 문자형으로 변환
 *  to_date() : 문자형을 날짜형으로 변환
 *  to_number() : 문자형을 숫자형으로 변환
 */
select sysdate, to_char(sysdate, 'YYYY-MM-DD') from dual;

/* decode함수 실습을 위한 테이블 생성이 곧 db설계 
 */
drop table emp01; --emp01 테이블 삭제

create table emp01(
 deptno int primary key --부서번호
 ,ename varchar(50) -- 사원이름
);

insert into emp01 values(10,'miller');
insert into emp01 values(20,'smith');
insert into emp01 values(30,'jones');
insert into emp01 values(40,'allen');

select * from emp01 order by ename asc;--알파벳 순으로 정렬

--decode 함수 실습
select ename,deptno,decode(deptno,10,'개발부',
                                  20,'디자인부',
                                  30,'기획부',
                                  40,'영업부')
                                  as 부서명
                          from emp01;        


--case 함수 실습
select ename,deptno,
       case when deptno=10 then '개발부'
            when deptno=20 then '디자인부'
            when deptno=30 then '영업부'
            when deptno=40 then '총무부'
      end as 부서명
from emp01;      

/* 그룹함수 종류)
 *  SUM(합계), AVG(평균), count(총레코드 개수), max(최대값), min(최소값),
 *  stddev(표준편차), variance(분산)
 */
--emp02 테이블 생성
create table emp02(
  dept_no number(38) --부서번호 
  ,ename varchar2(20) --사원명
  ,sal int --급여
  ,comm number(38) --보너스
  ,job varchar2(20) --업무부서
);

insert into emp02 values(10,'scott',1000,100,'salesman');
insert into emp02 values(10,'tiger',1500,150,'salesman');
insert into emp02 (dept_no,ename,sal,job) values(20,'james',2000,'manager');
insert into emp02 (dept_no,ename,sal,job) values(20,'kings',2500,'manager');

select * from emp02 order by dept_no asc;

--전체사원의 급여 총합
select sum(sal) from emp02;

select sum(comm) from emp02; --그룹함수를 사용하면 보너스에서 null을 제외하고 보너스 총합을 구함.

select avg(sal) from emp02; --사원들의 급여평균

--가장 높은 급여와 가장 낮은 급여
select max(sal),min(sal) from emp02;

--보너스를 받는 사원수(comm필드에서 null을 제외한 보너스를 받는 경우만 카운터한다.)
select count(comm) as "보너스를 받는 사원수" from EMP02;

select count(*) as "전체사원수", count(comm) as "보너스를 받는 사원수"  from emp02;

select count(job) 업무수 from emp02;

select job from emp02 order by job asc;

--중복을 제거하고 업무수,distinct키워드는 중복을 제거.
select count(distinct job) as "중복을 제거한 업무수" from emp02;

--부서별 급여 총합과 급여평균을 구해본다.
select dept_no,sum(sal),avg(sal) from emp02 group by dept_no;

--부서별 최대 급여와 최소급여를 구해본다.
select dept_no,max(sal), min(sal) from emp02 group by dept_no;

--부서별 사원수와 보너스를 받는 사원수
select dept_no, count(*) as "부서별 사원수",
count(comm) as "부서별 보너스를 받는 사원수" from emp02 group by dept_no;

--부서별 평균 급여가 2000 이상인 경우 부서번호,부서별 평균 급여를 구해본다.
select dept_no,avg(sal) from emp02 group by dept_no having avg(sal) >= 2000;

--부서별 최대 급여가 2000을 초과한 경우에 맞는 부서별 번호,부서별 최대값,최소값을 구해봄
select dept_no, max(sal),min(sal) from emp02 group by dept_no 
having max(sal) > 2000;

















