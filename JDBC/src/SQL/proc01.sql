create or replace procedure del_ename(--del_ename 저장 프로시저를 만든다
	vename emp15.ename%type
)
is
begin
	delete from emp15 where ename = vename;	
end;
/