create or replace trigger trg_02
after insert on emp01 -- emp01테이블에 사원정보 저장후에 트리거 이벤트 발생

for each row--행레벨 트리거
begin
	insert into sal01 values(sal01_salno_seq.nextval,1000,:new.empno);
	--:new.empno 새로운 사원번호 정보를 가져옴
end;
/