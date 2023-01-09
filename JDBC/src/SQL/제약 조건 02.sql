--컬럼 레벨 지정법(제약조건 지정)으로 테이블 생성 =>컬럼에 직접 제약조건을 설정하는 방식
create table emp75(
 empno number(38) primary key
 ,ename varchar2(50) not null
 ,job varchar2(30) unique
 ,deptno number(38) references dept71(deptno) --외래키 제약조선 설정
);

--테이블 레벨 지정법(제약조건 지정)으로 테이블 생성
create table emp76(
 empno number(38)
 ,ename varchar2(50) not null
 ,job varchar2(30)
 ,deptno number(38)
 ,primary key(empno)
 ,unique(job)
 ,foreign key(deptno) references dept71(deptno) --외래키 제약조건 설정
);

--테이블 레벨 지정방식으로 constraint 키워드를 사용한 사용자 정의 제약조건명을 명시적으로 지정하여 테이블 생성)
create table emp77(
 empno number(38)
 ,ename varchar2(50) constraint emp77_ename_nn not null
 ,job varchar2(50)
 ,deptno number(38)
 ,constraint emp77_empno_pk primary key(empno)
 ,constraint emp77_job_uk unique(job)
 ,constraint emp77_deptno_fk foreign key(deptno) references dept71(deptno) --외래키 설정
);

--생성된 제약조건 이름,제약조건 유형,외래키 정보등 확인
 select constraint_name,constraint_type,table_name,r_constraint_name
 from user_constraints where table_name ='EMP77';

--하나의 테이블에 2개 기본키 설정 
create table member01(
 id varchar2(20)
 ,name varchar2(50)
 ,addr varchar(200)
 ,phone varchar2(20)
 ,constraint member01_idphone_pk primary key(id,phone) --2개의 컬럼에 각각 기본키 설정
);

--기존 테이블에 제약조건 추가 실습
create table emp78(
 empno number(38)
 ,ename varchar2(50)
 ,job varchar2(50)
 ,deptno number(38)
);

--empno 컬럼에 기본키를 추가
alter table emp78 add constraint emp78_empno_pk primary key(empno);

--deptno 컬럼에 외래키 추가
alter table emp78 add  constraint emp78_deptno_fk foreign key(deptno)
references dept71(deptno);

--ename 컬럼에 not null 제약조건 추가
alter table emp78 modify ename constraint emp78_ename_nn not null;

--제약조건 제거 실습확인 과정
insert into emp78 values(11,'이순신','관리사원',10);
insert into emp78 values(12,'홍길동','영업사원',20);
insert into emp78 values(11,'강감찬','관리부장',10);--기본키로 설정된 곳에는 중복 사원번호 저장금지

alter table emp78 drop constraint emp78_empno_pk; --기본키 제약조건 제거

--제약조건 이름 확인
select constraint_name from user_constraints where table_name='EMP78';

select * from emp78 order by empno asc;

--not null 제약조건 제거 실습
insert into emp78 values(12,null,'개발자',30);

alter table emp78 drop constraint emp78_ename_nn;--ename컬럼에 not nul 제약조건 제거

/* 제약조건 비활성화를 하기 위한 테이블 설계)
 * 먼저 기본키가 있는 부모(주인) 테이블을 먼저 생성
 */
create table dept91(
 deptno number(38) constraint dept91_deptno_pk primary key
 ,dname varchar2(50)
 ,LOC varchar2(50)
);
insert into dept91 values(10,'경리부','서울');
insert into dept91 values(20,'영업부','부산');

select * from dept91 order by deptno asc;

--외래키가 포함된 emp91 테이블 생성
create table emp91(
 empno number(38) constraint emp91_empno_pk primary key
 ,ename varchar2(30) constraint  emp91_ename_nn not null
 ,job varchar2(30)
 ,deptno number(38) constraint emp91_deptno_fk references dept91(deptno) --외래키
);

insert into emp91 values(11,'홍길동','경리부장',10);
insert into emp91 values(12,'이순신','영업부장',20);

select * from emp91 order by empno;

--종속테이블의 레코드가 있는 상태에서 부모 테이블의 레코드를 삭제할려고 시도 ->참조 무결성 에러가 발생해서 삭제를 못함.
delete from dept91 where deptno=10;

--emp91의 외래키 제약조건 비활성화
alter table emp91 disable constraint emp91_deptno_fk;

--제약조건 이름과 활성/비활성 상태 확인
select constraint_name,status from user_constraints where table_name='EMP91';
/* status컬럼에는 제약조건 활성화이면 enabled,비활성화 이면 disabled. 결국 활성화 이면 사용가능하다. */

--외래키 제약조건이 비활성 상태라서 부모 키 레코드 삭제가 가능
delete from dept91  where deptno=10;
select * from dept91 order by deptno;--asc문 생략

--다시 외래키 제약조건 활성 상태로 변경->부모 레코드가 없어서 에러가 발생
alter table emp91 enable constraint emp91_deptno_fk;
insert into dept91 values(10,'경리부','서울');

--cascade 옵션으로 dept91 부모테이블의 기본키 제약조건을 비활성화 시키면 emp91 종속테이블의 외래키 제약조건까지 한꺼번에 비활성화
alter table dept91 disable primary key cascade;

--제약조건명과 활성 /비활성 상태 확인
select constraint_name, status from user_constraints where table_name in('DEPT91','EMP91');

--외래키가 비활성화 상태에서 기본키 제약조건 삭제 시도=> 비활성화 된 상태에서도 기본키 제약조건 삭제 못함.
alter table dept91 drop primary key;

--cascade 옵션을 사용하면 부모테이블의 기본키 뿐만 아니라 종속 자식테이블의 외래키 제약조건 까지 한꺼번에 삭제
alter table dept91 drop primary key cascade;











drop table emp;

create table emp(
 empno number(10) primary key --사원번호
 ,ename varchar2(50) not null--사원명
 ,sal number(38) not null--월급
 ,deptno number(10) null --부서번호
);

select*from member1 order by empno desc;

create table member1(
  mem_id varchar2(10) primary key
  ,mem_pwd varchar2(50)
  ,mem_name varchar2(50)
  ,mem_phone varchar2(50)
);

insert into member1 values('abc1234','1234567','이순신','010-777-7777');
insert into member1 values('abc123','1234567','이순김','010-777-7777');
select*from member1;
update member1 set mem_name='홍길동';