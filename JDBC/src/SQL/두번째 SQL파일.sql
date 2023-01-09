select * from emp01;

--급여가 2000 이상이고 3000 이하인 자료만 검색
select * from emp01 where sal>=2000 and sal <=3000;


/* 문제) 급여가 2000이하이거나 3000이상인 자료만 검색
 */

select * from emp01 where sal<=2000 or sal>=3000;

/* 문제) 보너스가 150 이거나 null이거나 200인 자료를 검색한다. null은 = 비교연산자로 검색 안된다. ~~~is null로 검색해야함~~~
 */

select * from emp01 where comm =150  or comm is null  or comm =200;

/* 특정 범위의 값을 조회하기 위해서 between A and B 연산자를 활용한다. A에는 범위 내의 최소값, B에는 범위내의 최대값이 들어간다 ~~~
 */
--2000~3000사이의 급여받는 사원 조회

select ename, sal from emp01 where sal between 2000 and 3000;

--급여가 2000에서 3000사이가 아닌 자료를 검색
select ename, sal from emp01 where sal not between 2000 and 3000;

/* in연산자)
 * 컬럼명 in (A,B,C) : 특저 컬럼의 값이 A,B,C중 어느하나만 만족하더라도 검색이된다. ~~~
 */
select * from emp01;
select ename, sal,comm from emp01 where comm in(150,200,220);

--급여가 1500,1800,2000이 아닌 자료를 검색
select ename, sal, comm from emp01 where sal not in(1500,1800,2000);

/* like검색연산자 키워드와와일드 카드~~~
 * %: 하나이상의 임의의 모르는 문자와 매핑 대응~~~
 */
select ename,sal from emp01 where ename like '홍%';--홈으로 시작하는 모든이름을 검색. 결국 홍씨는 모두 검색됨

--앞뒤 성과 이름은 모르고 중가 이름인 길만 아는 경우 검색
select ename from emp01 where ename like '%길%';--가장 많이 사용되는 검색형태

--3자의 성이름 중에서 성과 중간이름만 알고 마지막 이름 한자를 모를 경우 검색
select ename from emp01 where ename like '홍길_';--  _언더바 와일드 카드는 단하나의 임의의 모르는 문자와 매핑대응 한다~~~

--성과 이름 중에서 길을 포함하지 않는 성이름을 검색
select ename from emp01 where ename not like '%길%';

--보너스에서 null인 자료검색
select ename, comm from emp01 where comm is null; --null인 경우는 is null연산을 사용하고
-- = 같다 연산자로는 검색 못한다.

--보너스가 null이 아닌 잘를 검색
select ename, comm from emp01 where comm is not null; --is not null 연산은 해당 컬럼이 null이 아닌 경우에 검색~~~

select 5*5 as "5*5=25" from dual;

/* dual 테이블 특징)
 * 1.dual테이블은 오라클 설치시 설치되는 테이블로 오라클 연산 결과값, 시퀀 번호값, 함수 결과값 확인 용도 등으로
 *	많이 활용됨
 */

--sysdate 오라클 날짜함수
select sysdate from dual;

select -10, abs(-7) as "양의 절대값 " from dual;--abs() 함수는 절대값을 구함~~~

select 34.5678, floor(34.5678) from dual;--floor() 함수는 소수점이하는 반올림 하지 않고 버림~~~

select 34.5678, round(34.5678,2) from dual; --round(34.5678,2) 함수에서 2로지정하면 소숫점이하 3번째 자리에서 반올림하여 소수점이하 두번째 자리까지 구한다.






