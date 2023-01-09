create or replace trigger trg_01--trg_01 이라는 트리거 생성

after insert on emp01 --emp01테이블에 레코드 저장후에 트리거에 의해서 begin~end 사이 문장을 수행

begin 
	dbms_output.put_line('Thank You !');
end;
/