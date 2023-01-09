create or replace package exam_pack --exam_pack 패키지명 정의
is
  function CAL_BONUS(vempno in emp.empno%type) --함수명과 사번 인자값을 전달받을 변수정의
  return number; --함수호출후 반환타입 정의

  procedure CURSOR_SAMPLE01; --저장프로시저명 정의
end;
/

create or replace package body exam_pack --exam_pack 몸체문장 정의
is
 function CAL_BONUS(vempno in emp.empno%type)
 return number

 is
   VSAL number(7,2);--급여를 저장할 실수타입 변수정의
 begin
   select sal into vsal from emp where empno=vempno;

   return  (vsal*100);--급여에 *100을 해서 반환
 end;

 procedure CURSOR_SAMPLE01
 is 
 vdept dept71%rowtype; --로우 타입 변수 선언(한개의 레코드 행값을 저장할 변수)

 cursor c1 --c1 커서 선언
 is
 select * from dept71;

begin
  DBMS_OUTPUT.PUT_LINE('deptno / DNAME  / LOC');
  DBMS_OUTPUT.PUT_LINE('============================>');
  
  OPEN C1; --커서 열기
   LOOP
    FETCH c1 into vdept.deptno, vdept.dname, vdept.LOC; --읽어온 한개의 행 레코드값을 각 변수에 저장

    EXIT WHEN c1%NOTFOUND; --커서로 부터 더 이상 읽어들일 값이 없다면 반복문을 빠져 나간다.
    dbms_output.put_line(vdept.deptno || ' / ' || vdept.dname || ' / ' || vdept.LOC);
   END LOOP; --읽어온 값이 여러개의 행일때는 반복문을 사용함.

  CLOSE C1;--커서 닫기
end;
END;
/