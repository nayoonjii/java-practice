set serveroutput on

declare
  vempno emp.empno%type; --vempno 타입을 emp테이블의 empno컬럼 타입을 따라간다.
  vename emp.ename%type;  
begin
  select empno,ename into vempno,vename from emp
  where ename='홍길동';

  dbms_output.put_line('사원번호 / 사원이름');
  DBMS_OUTPUT.PUT_LINE('================>');
  DBMS_OUTPUT.PUT_LINE(vempno || ' / ' || vename);
end;
/