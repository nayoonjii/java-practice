set serveroutput on

declare
	vemp emp%rowtype;
	vename varchar2(20); --부서명
	
	
begin
	select * into vemp from emp where ename = '홍길동';
	
	if(vemp.deptno = 10) then
		vename := '개발부';
	elsif (vemp.deptno = 20) then
		vename := '디자인부';
	else
		vename := '기획부서';
	end if;
	
	dbms_output.put_line('사원번호 / 사원이름 / 부서명');
	dbms_output.put_line('=======================');
	dbms_output.put_line(vemp.empno || ' / ' || vemp.ename || ' / ' || vename);
		
end;
/