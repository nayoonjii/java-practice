--조인 실습을 위한 테이블 생성
create table dept05(
  deptno number(38) primary key --부서번호
  ,dname varchar2(50) --부서명
);

insert into dept05 values(10,'관리부');
insert into dept05 values(20,'영업부');
insert into dept05 values(30,'연구부');

select * from dept05 order by deptno asc;

--사원테이블
create table emp05(
 empno number(38) primary key --사원번호
 ,ename varchar2(50) --사원명
 ,job varchar2(30) --직종
 ,sal int --급여
 ,comm int --보너스
 ,deptno number(38) --부서번호
);

insert into emp05 values(7001,'홍길동','관리사원',1500,0,10);
insert into emp05 values(7002,'이순신','영업사원',1200,100,20);
insert into emp05 values(7003,'강감찬','영업사원',1300,130,20);
insert into emp05 values(7004,'홍길순','연구원',2000,200,30);

select * from emp05 order by empno;--사원번호를 기준으로 오름차순 정렬

-- cross join => 3행 * 4행 = 12개행 레코드가 조인 검색
select * from dept05, emp05;

--2번째 조인 실습을 위한 테이블 생성
create table room(
 room_no int primary key --강의실 호수
 ,roomname varchar2(30) --강의실 담당 샘
); --강의실 호수와 담당 샘

alter table room rename column room_no to roomno;--room_no 컬럼명을 roomno 
--컬럼명으로 변경

insert into room values(601,'홍길동 샘');
insert into room values(602,'이순신 샘');

select * from room order by roomno asc;

--학생 테이블 생성
create table st03(
  stno number(38) primary key --학생번호 줄여서 학번
  ,stname varchar2(50) --학생명
  ,roomno number(38) --강의실 호수
);

insert into st03 values(1,'홍길순 학생',601);
insert into st03 values(2,'강감찬 학생',602);
insert into st03 values(3,'신사임당 학생',602);

select * from st03 order by stno asc; --asc는 오름차순 정렬이다. 생략가능함. 작은 숫자 학번부터
--먼저 검색

--공통 컬럼을 기준으로 Equi 조인검색
select * from room,st03 where room.roomno = st03.roomno;

-- 문제)Equi 조인과 신사임당 학생 이름을 기준으로  조인
select stno,stname,room.roomno,roomname  from room,st03
where room.roomno=st03.roomno and stname = '신사임당 학생';

-- 문제)검색연산자와 와일드 카드,Equi조인검색을 활용하여 학생이름 중에서 길만 포함되어도 조인검색되는 쿼리문울
-- 만들어 보자.
select * from room r,st03 s where r.roomno=s.roomno and stname like
'%길%'; --테이블 명 별칭을 r,s로 설정

/*  Non Equi 조인검색을 위한 급여 등급 테이블을 생성 
 */
create table salgrade(
 grade number(38) primary key --급여등급
 ,LOSAL number(38) --최소급여
 ,HISAL number(38) --최대급여
);

insert into salgrade values(1,700,1200);
insert into salgrade values(2,1201,1400);
insert into salgrade values(3,1401,2000);

select * from salgrade order by grade; --asc문이 생략됨.
select * from emp05 order by empno;

--Non Equi 조인검색
select ename,sal,grade from emp05,salgrade where sal between LOSAL 
AND HISAL;

--2번째 Non Equi 조인검색
select e.ename,e.sal, s.grade from emp05 e, salgrade s
where e.sal >= s.LOSAL and e.sal <= s.HISAL;

/* 문제) 사원테이블 EMP05,부서테이블 dept05,급여등급 테이블 salgrade 3개의 테이블을 활용하여
 * equi 조인검색+Non Equi 조인검색을 해보자. 결국 2개의 조인기법을 활용해서 3개의 테이블 합치는
 * 조인검색을 하는 것이다.
 */
-- 조인 검색 쿼리문 작성시작
select e.ename,e.sal, s.grade, d.dname from emp05 e,dept05 d, salgrade s
where e.deptno=d.deptno and e.sal between s.LOSAL AND s.Hisal;


/* 미국 표준 협회에서 제정한 ANSI 조인기법 
 */
--cross join이라는 명확한 키워드를 사용해서 조인
--테이블 생성
create table depart11(--학과 테이블
  dept_code varchar2(10) primary key --강의실 호수
  ,dept_name varchar2(50) not null --강의실 담당 샘
);
insert into depart11 values('601','신사임당샘');
insert into depart11 values('602','이순신샘');

select * from depart11 order by dept_code asc;

--학생 테이블 생성
create table student11(
 st_no number(38) primary key --학번
 ,st_name varchar2(20) --학생명
 ,st_gender varchar2(10) --성별
 ,dept_code varchar2(10) --강의실 호수
);

insert into student11 values(11,'홍길동','남','601');
insert into student11 values(12,'홍길순','여','602');
insert into student11 values(13,'강감찬','남','602');

--cross join 실습
select * from depart11 cross join student11;

--Ansi에서 명확한 조인문을 제시한   inner join(Equi 조인기법이랑 같다.)
select * from depart11 inner join student11 on depart11.dept_code =
student11.dept_code;

--검색 연산자 키워드 like를 활용한 inner join
select st_no,st_name,st_gender,depart11.dept_code,dept_name
from depart11 inner join student11 on depart11.dept_code=student11.dept_code
and st_name like '%감%';

--using절문을 사용한 inner join
select st_no,st_name,st_gender,dept_code,dept_name from depart11 inner join
student11 using (dept_code);

--natural join
select * from depart11 natural join student11;

/* outer join 실습을 위한 테이블 생성 
 */
--dept21 테이블 생성
create table dept21(
 deptno int --부서번호
 ,dname varchar(20) --부서명
);
insert into dept21 values(10,'ACCOUNTING');
insert into dept21 values(20,'RESEARCH');

select * from dept21 order by deptno asc;
delete from dept21 where deptno=10;

--dept22 테이블생성
create table dept22(
 deptno number(38)
 ,dname varchar2(20)
);
insert into dept22 values(10,'ACCOUNTING');
insert into dept22 values(30,'SALES');

select * from dept22 order by deptno;

/* left outer join문은 왼쪽테이블에는 자료가 있지만 오른쪽 테이블에 해당 자료가 없는경우 자료가 
 * 출력되지 않는 문제를 해결하기 위한 조인기법이다.
 */
select * from dept21 left outer join dept22 on dept21.deptno=dept22.deptno;

/*right outer join문은 오른쪽 테이블에는 자료가 있지만 왼쪽 테이블에 해당자료가 없는 경우 자료가 
 * 출력되지 않는 문제를 해결하기 위한 조인기법이다.
 */
select * from dept21 right outer join dept22 using (deptno);

/* left outer join+right outer join = full outer join 
 */
select * from dept21 full outer join dept22 using (deptno);




















































