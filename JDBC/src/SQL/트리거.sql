drop table emp01;
--트리거 실습을 윟나 사원테이블 생성
create table emp01(
	empno number(38) primary key --사원번호
	,ename varchar2(50) --사원이름
	,job varchar2(30) --직종/직무
);

--급여정보를 저장할 테이블 생성
create table sal01(
	salno number(38) primary key
	,sal number(7,2) --급여
	,empno number(38) references emp01(empno) --외래키 설정
);
select * from emp01 order by empno asc;
select * from sal01 order by salno;

--salno컬럼에 저장될 번호를 생성하는 시퀀스 생성
create sequence sal01_salno_seq --sal01_salno_seq 라는 시퀀스 생성
start with 1 --1부터시작
increment by 1 --1씩증가
nocache; --임시저장 장소를 사용하지 않겠다는 의미

--2번 사원정보 삭제시도
delete from emp01 where empno=2;


create table addr(
	seq_id number(38) primary key
	,name varchar2(50) not null
	,phone varchar2(50) not null
	,email varchar2(50) not null
	,addr01 varchar2(50) not null
	,addr02 varchar2(50) not null
	,addr03 varchar2(50) not null
	
);
select * from addr order by seq_id asc;
select * from addr order by seq_id;

--salno컬럼에 저장될 번호를 생성하는 시퀀스 생성
create sequence addr_seq 
start with 1 
increment by 1 
nocache;

INSERT INTO addr(seq_id) VALUES(addr_seq.NEXTVAL);