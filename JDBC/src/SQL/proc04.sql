create or replace function cal_bonus(--function키워드로 cal_bonus라는 함수를 정의
	vempno in emp.empno%type
)
return number --반환되는 숫자 타입
is
	vsal number(7,2);
begin
	select sal into vsal from emp where empno = vempno;
	
	return (vsal * 200);
end;
/