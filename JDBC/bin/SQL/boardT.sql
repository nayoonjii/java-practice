-- boardT 테이블 생성
create table boardT(
 bno number(38) primary key --게시판 번호
 ,bname varchar2(50) not null --글쓴이
 ,btitle varchar2(200) --글제목
 ,bcont varchar(4000) --글내용
 ,bdate date --등록날짜
);

/* 제약조건 이란? 컬럼(필드,열)에 자료 저장시 어떠한 제한을 가하는 것을 말한다.
   레코드란 ? 컬럼에 저장된 한행의 자료 집합을 말한다.
  제약조건 종류)
  primary key(기본키) :중복 자료 저장금지, null저장금지
  not null : 중복자료는 허용하고 null을 금지 
*/

/* 시퀀스 특징)
 *  1.시퀀스는 번호 발생기이다. 현재 이후 번호값이 주로 발생된다. 중복번호가 없고,null이 없는 번호값이 발생되
 * 기 때문에 주로 기본키와 정수 숫자형으로 지정된 컬럼 레코드 값 번호 용도로 활용된다.
 * 
 *  2. 시퀀스도 오라클 객체이다. 시퀀스 생성문법 형식)
 *     create sequence 시퀀스명
 *     start with 1 --1부터 시작
 *     increment by 1 --1씩증가
 *     nocache; --임시 메모리를 사용하지 않겠다는 뜻  
 */
--bno_seq 시퀀스 생성
create sequence bno_seq
start with 1
increment by 1
nocache;

--생성된 시퀀스 번호값 확인 =>시퀀스명.nextval로 다음 시퀀스 번호값을 확인
select bno_seq.nextval as "bno_seq시퀀스 번호값 확인" from dual;

/* dual테이블은 오라클 설치시 설치되는 임시 테이블로 주로 오라클함수,연산 결과값,시퀀스 번호값 등 확인 용도로
 * 사용된다.
 */

select * from boardT order by bno desc; --게시판 번호를 기준으로 내림차순 정렬. 큰숫자 번호값이
--먼저 정렬 검색. desc문은 생략불가

create table boardT(
 b_no number(38) primary key --게시판 번호
 ,b_name varchar2(50) not null --글쓴이
 ,b_title varchar2(200) --글제목
 ,bcont varchar(4000) --글내용
);

insert into boardT values(1,'이순신','제목','내용');
insert into boardT values(2,'강감찬','제목2','내용2');
insert into boardT values(3,'세종대왕','제목3','내용3');







select * from boardT where b_no in(2,3) ;


select * from boardT where b_no=2 or b_no=3 ;




drop table member;

create table member(
  mem_id varchar2(10) primary key
  ,mem_pwd varchar2(50) not null
  ,mem_name varchar2(50) not null
  ,mem_phone varchar2(50) not null
);

insert into member values('abc1234','1234567','이순신','010-777-7777');

update member set mem_name='홍길동';
















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





select * from depart11 inner join student11 on depart11.dept_code =
student11.dept_code;
