set serveroutput on --serveroutput 은 오라클에서 제공하는 내장 프로시저로 출력하는 내용을화면에
--보여주도록 한다.
declare
	vempno number(38);
	vename varchar2(30);--2개의 변수를 선언
	
begin
	vempno := 7788; -- := 은 대입연산자
	vename := '홍길동'; -- 문자는 작은 따옴표로 감싼다
	
	DBMS_OUTPUT.PUT_LINE('사원번호 / 사원명');
	DBMS_OUTPUT.PUT_LINE('=================>'); --DBMS_OUTPUT은 패키지명,PUT_LINE은 화면에 출력하라는 오라클 내장 프로시저이다.
	DBMS_OUTPUT.PUT_LINE(vempno || ' / ' || vename); -- ||은 문자열 연결 연산자	
end;
/