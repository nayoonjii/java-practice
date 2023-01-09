set serveroutput on

declare
	vemp emp15%rowtype; --로우타입은 한행 전체 레코드 행값을 저장
	ansal number(7,2); --소수점을 포함한 총자리수가 7,2는 소수점 자리수
	
begin
	--홍길동 사원의 한행 전체 레코드 행값을 vemp에 저장
	select * into vemp from emp15 where ename = '홍길동';
	
	if (vemp.comm is null) then
		ansal := vemp.sal * 12;
	else 
		ansal := vemp.sal*12 + vemp.comm;
	end if;
	
	dbms_output.put_line('사원번호 / 사원이름 / 연봉');
	dbms_output.put_line('========================');
	dbms_output.put_line(vemp.empno || ' / '|| vemp.ename || ' / ' || ansal);
end;
/