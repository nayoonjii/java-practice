set serveroutput on

create or replace procedure cursor_sample01

is
	vdept dept71%rowtype; --로우타입 변수 선언(레코드 행값을 저장)
	
	cursor c01--c01커서 선언
	is
	select * from dept71;
	
begin
	dbms_output.put_line('deptno / dname / LOC');
	dbms_output.put_line('======================');
	
	open c01;--c01 커서열기
		loop --loop반복문 시작
			fetch c01 into vdept.deptno, vdept.dname,vdept.LOC;--커서로부터 자료르 가져와서
			--로우타입 변수에 저장
			exit when c01%notfound; --커서로부터 더이상 읽을 값이 없다면 반복문을 빠져나간다.
			dbms_output.put_line(vdept.deptno || ' / ' || vdept.dname || ' / ' || vdept.LOC);
		end loop;--loop반복문 끝
		
	close c01; --c01 커서닫기
end;
/














