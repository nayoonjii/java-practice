--alter table 실습을 위한 테이블 생성
create table emp21(
  empno number(38) primary key
  ,ename varchar2(50)
  ,sal number(38)
);

--테이블 구조 확인 명령어
desc emp21;
describe emp21;

--emp21테이블에 job컬럼을 추가
alter table emp21 add(job varchar2(50));

--추가한 job컬럼 크기를 50에서 30으로 변경
alter table emp21 modify(job varchar2(30));

--job 컬럼 삭제
alter table emp21 drop column job;

--truncate 문으로 전체 레코드 삭제 실습을 위한 자료 2개만 저장
insert into emp21 values(1,'hr',1000);
insert into emp21 values(2,'scott',2000);

select * from emp21 order by empno asc;

truncate table emp21;

--emp21테이블명을 test로 변경
rename emp21 to test;

--현재 접속중인 사용자로 사용가능한 테이블명을 알고자 하는 경우
select table_name from user_tables order by table_name desc;











create table guestbook(
  g_no number(38) primary key
  ,g_name varchar2(50) not null
  ,g_title varchar2(200) not null
  ,g_cont varchar2(4000)not null
  ,g_date date null
);

create table emp(
 empno number(10) primary key --사원번호
 ,ename varchar2(50) not null--사원명
 ,sal number(38) not null--월급
 ,deptno number(10) null --부서번호
);
select*from emp order by empno desc;







