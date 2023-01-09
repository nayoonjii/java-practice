create or replace trigger trg_03
after delete on emp01 --emp01테이블 레코드가 삭제되고 난 이후에 트리거가 발생

for each row
begin
	delete from sal01 where empno = :old.empno;
end;
/






