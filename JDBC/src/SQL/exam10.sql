set serveroutput on
 declare
 
 	i number(38) := 1;
 	
 begin
	while i<=5
	loop
		dbms_output.put_line(i);
		i := i+1; --1씩증가
	end loop;
 end;
 /