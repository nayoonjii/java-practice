set serveroutput on

declare
 /* 테이블 타입 정의 : 배열로 선언되어 있어서 인덱스 주소번호로 접근하여 값을 가져옴.*/
 type ename_table_type is table of emp.ename%type index by binary_integer;
 --테이블 타입으로 ename_table_type,job_table_type 각각 정의
 type job_table_type is table of emp.job%type index by binary_integer;
 
 --테이블 타입 변수 선언
 ename_table ename_table_type;
 job_table job_table_type;
 
 --인덱스 주소번호로 사용할 변수 선언과 초기화
 i binary_integer := 0;
 
begin
 --emp테이블로 부터 사원이름과 직종을 가져와서 테이블 타입 배열변수에 저장
 for k in (select ename,job from emp) loop
  i := i+1; --1씩 증가
  ename_table(i) := k.ename; --사원명
  job_table(i) := k.job; --직종
 end loop; --반복문 끝
 
 DBMS_OUTPUT.PUT_LINE('사원명' || ' / ' || '직종' );
 dbms_output.put_line('===========================');
 
 for j in 1..i loop
   DBMS_OUTPUT.PUT_LINE(ename_table(j) || ' / ' || job_table(j));
 end loop;
end;
/