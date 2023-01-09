set serveroutput on

declare
	vempno number(38);
	vename varchar2(30);
	vdeptno emp.deptno%type;
	vdname varchar2(30) := ''; --부서명, 초기값 설정

begin
	select empno, ename, deptno into vempno,vename,vdeptno
	from emp where empno = 101;
	
	if(vdeptno = 10) then
		vdname := '개발부';
	end if;
	
	if(vdeptno = 20) then
		vdname := '디자인부';
	end if;
	
	dbms_output.put_line('사원 번호 / 사원명 / 부서번호 / 부서명');
	dbms_output.put_line('================================');
	dbms_output.put_line(vempno || ' / ' || vename || ' / ' || ' / '
				 || vdeptno || ' / ' || vdname);
	
end;
/