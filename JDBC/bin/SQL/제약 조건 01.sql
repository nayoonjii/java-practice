--primary key 와 not null 제약조건 실습을 위한 테이블 생성)
create table dept60(
 deptno number(38) primary key --부서번호
 ,dname varchar2(50) not null --부서명
 ,LOC varchar2(50) --부서 지역
);

insert into dept60 values(10,'영업부','서울');
insert into dept60 values(10,'영업부','부산'); -- deptno 컬럼은 기본키인 primary key로 설정되어 있어서 중복 부서번
--호 저장금지

insert into dept60 values(20,null,'서울'); --dname컬럼은 not null제약조건으로 설정되어 있어서 null 저장 금지

--dept60테이블의 제약조건 이름,제약조건 유형 확인
select constraint_name,constraint_type,table_name from user_constraints
where table_name in('DEPT60');

--제약조건을 지정하지 않고 테이블 생성->null제약조건
create table emp101(
 empno number(38)
 ,ename varchar2(50)
 ,job varchar2(30)
 ,deptno int 
);
insert into emp101 values(null,null,'영업부',20);
select * from emp101 order by empno asc;

--not null제약조건을 설정한 테이블 생성
create table emp102(
  empno number(20) not null
  ,ename varchar2(50) not null
  ,job varchar2(50)
  ,deptno number(38)
);
insert into emp102 values(null,null,'관리부',10);--not null로 설정된 해당 컬럼에는 null을 저장할 수 없다.
insert into emp102 values(501,'이순신','관리부',10);

select * from emp102;

--unique 제약조건을 설정한 테이블 생성
create table emp103(
 empno number(10) unique
 ,ename varchar2(20) not null
 ,job varchar2(30)
 ,deptno int
);
insert into emp103 values(502,'홍길동','인사부',40);
insert into emp103 values(502,'이순신','영업부',30);--unique제약조건으로 설정된 해당 컬럼에는 중복 사원번호 저장금지
insert into emp103 values(null, '강감찬','관리부',50);
insert into emp103 values(null,'신사임당','개발부',60);--unique제약조건으로 설정된 해당 컬럼에는 null저장을 허용하고,
--중복 null도 허용한다.

--constraint 키워드를 사용한 사용자 정의 제약조건명
create table emp105(
 empno number(38) constraint emp105_empno_pk primary key
 ,ename varchar2(30) constraint emp105_ename_nn not null
 ,job varchar2(50)
 ,deptno int 
);

--생성된 제약조건명 확인
select table_name,constraint_name from user_constraints where table_name in('EMP105');

/* 참조 무결성을 위한 외래키 제약조건 실습)=>주종 관계
 *  1.기본키로 설정된 주인(부모) 테이블 dept71부터 먼저 만든다.
 *  2.레코드 저장도 부모 테이블 부터 먼저 한다. 
 */
--부모 즉 주인테이블에 해당하는 dept71을 생성
create table dept71(
 deptno number(38) constraint dept71_deptno_pk primary key
 ,dname varchar2(50) constraint dept71_dname_nn not null
 ,LOC varchar(30)
);
insert into dept71 values(10,'관리부','서울');
insert into dept71 values(20,'영업부','부산');
insert into dept71 values(30,'개발부','판교');

select * from dept71 order by deptno asc;

/* 종속 테이블에 정의하는 외래키 제약조건 특징)
 *  1.부모 즉 주인테이블의 기본키 컬럼을 참조하고 있다.
 *  2.부모 테이블의 기본키 컬럼 레코드값만 저장 가능하다.
 */
--외래키가 포함된 종속테이블인 사원테이블 생성
create table emp71(
 empno number(38) constraint emp71_empno_pk primary key --사원번호
 ,ename varchar2(50) constraint emp71_ename_nn not null --사원명
 ,job varchar2(30)
 ,deptno number(38) constraint emp71_deptno_fk references dept71(deptno) --외래키(foreign key)
);
insert into emp71 values(11,'홍길동','관리원',10);
insert into emp71 values(12,'이순신','영업사원',20);

select * from emp71 order by empno;

insert into emp71 values(13,'강감찬','경리원',40); --없는 부서번호를 저장할려다가 에러가 발생

--생성된 제약조건 이름, 유형,외래키가 어느 기본키를 참조하는지에 대한 정보 등을 확인
select table_name,constraint_name,constraint_type,r_constraint_name
from user_constraints where table_name in('DEPT71','EMP71');

/* 미국 표준협회 ANSI inner join 실습  
 */
select * from dept71 inner join emp71 on dept71.deptno = emp71.deptno;

/* 기본키가 포함된 학과 테이블 생성 */
create table depart71(
 deptcode varchar2(10) constraint depart71_deptcode_pk primary key --학과 코드
 ,deptname varchar2(20) constraint depart71_deptname_nn not null --학과명
);
insert into depart71 values('a001','영어교육학과');
insert into depart71 values('a002','소프트웨어 공학과');

select * from depart71 order by deptcode asc;

alter table depart71 modify(deptname varchar2(50));--deptname 컬럼크기를 50으로 변경

--외래키가 포함된 종속 테이블 생성
create table student71(
  sno number(38) constraint student71_sno_pk primary key --학번
  ,sname varchar2(50) constraint student71_sname_nn not null --학생이름
  ,gender varchar2(10) constraint student71_gender_nn not null --성별
  ,addr varchar2(200) --주소
  ,deptcode varchar2(10) constraint student71_deptcode_fk 
  references depart71(deptcode) --외래키 설정
);
insert into student71 values(101,'홍길순','여','서울시 성동구','a001');
insert into student71 values(102,'홍길동','남','서울시 서초구','a002');

/* 공통 컬럼을 기준으로 Equi 조인검색 :가장 사용 빈도가 높다 */
select sno,sname,gender,addr,d.deptcode,deptname from depart71 d, student71 s
where d.deptcode=s.deptcode;

/* check 제약조건 실습을 위한 테이블 생성 
 */
create table emp73(
 empno number(38) constraint emp73_empno_pk primary key
 ,ename varchar2(30) constraint emp73_ename_nn not null
 ,sal number(38) constraint emp73_sal_ck check(sal between 500 and 5000) --500에서5000사이의 급여만
 --저장 가능하다.
 ,gender varchar2(10) constraint emp73_gender_ck check(gender in('M','F')) --gender컬럼에 남자인 경우
 --는 'M', 여자인 경우는 'F' 둘 중 하나만 저장되게 한다.
);

insert into emp73 values(7501,'신사임당',7000,'F'); --급여가 500~5000 범위를 벗어나서 CHECK 제약조건 에러
insert into emp73 values(7502,'홍길동',3000,'K');--gender 컬럼에는 'M' 또는 'F' 둘중 하나만 저장되어야 하는대
--그렇지 않아서 발생한 check제약조건 에러

insert into emp73 values(7503,'이순신',5000,'M');
select * from emp73 where gender='M';--SQL문 자체는 대소문자를 구분하지 않지만,영문자 레코드 자료는 대소문자를 구분한다.

--default 제약조건 실습을 위한 테이블 생성
create table dept73(
 deptno number(38) primary key
 ,dname varchar2(30)
 ,LOC varchar2(50) default '서울' --default제약조건을 설정한 컬럼에 굳이 레코드를 저장하지 않아도 기본값 서울이 저장됨.
);

insert into dept73 (deptno,dname) values(11,'영업부');
select * from dept73;






























