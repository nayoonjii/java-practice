set serveroutput on
 declare
 	/* 레코드 타입정의 : 레코드 타입은 여러개의 컬럼을 묶어서 하나의 레코드 타입 변수로 선언하고자 하는 경우 이용
 	 * 테이블의  여러개의 컬럼의 한행의 레코드 값을 저장할 때 레코드 타입변수를 사용하면 편리하다.
 	 */
 	type emp_record_type is record(
 		v_empno emp.empno%type,
 		v_ename emp.ename%type,
 		v_job emp.job%type,
 		v_deptno emp.deptno%type
 	);
 	
 	--레코드 타입변수 선언
 	emp_record emp_record_type;
 	
 begin
	--홍길동 사원정보를 레코드 타입변수에 저장
	select empno,ename,job,deptno into emp_record from emp where ename = '홍길동';
	
	DBMS_OUTPUT.PUT_LINE('사원 번호 : ' || emp_record.v_empno);
	DBMS_OUTPUT.PUT_LINE('사원 이름 : ' || emp_record.v_ename);
	DBMS_OUTPUT.PUT_LINE('직 종 : ' || emp_record.v_job);
	DBMS_OUTPUT.PUT_LINE('부서 번호 : ' || emp_record.v_deptno);
	 	 
 end;
 /