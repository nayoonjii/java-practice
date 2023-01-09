create or replace procedure find_boardT --find_boardT라는 저장 프로시저명을 생성
(
  vname out boardT.bname%type, --vname변수는 boardT테이블의 bname컬럼 자료형 타입을 따라간다.
  vtitle out boardT.btitle%type, --out 모드 매개변수는 해당 컬럼 레코드값을 가져와서 되돌려 받을때 사
  --용
  vcont out boardT.bcont%type,
  vno in boardT.bno%type --in 모드 매개변수는 입력받은 값을 전달 받을때 사용
)

is
begin
	
	select bname,btitle,bcont into vname,vtitle,vcont 
	from boardT where bno=vno;
	
end;
/
