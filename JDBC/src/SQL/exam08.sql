set serveroutput on

declare
	n number(38) := 1;
	
begin
  loop
	dbms_output.put_line(n);
	n := n+1;--1씩증가
	
	if(n>5) then
		exit;--반복문 빠져 나간다.
	end if;
  end loop;
end;
/