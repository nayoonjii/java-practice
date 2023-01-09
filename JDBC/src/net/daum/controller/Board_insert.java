package net.daum.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* Statement라는 쿼리문 실행할 api를 활용해서 버퍼리더로 부터 데이터를 입력받아서 boardT테이블에 
 * 레코드 자료를 저장하는 소스이다.객체지향 oop는  사용하지 않았다.
 */
public class Board_insert {
	public static void main(String[] args) {

		String driver="oracle.jdbc.driver.OracleDriver";//oracle.jdbc.driver는
		// 패키지명, OracleDriver는 오라클 jdbc드라이버 클래스명
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//오라클 접속주소,xe는 데이터베이스명,1521은 포트번호
		String user="night";//오라클 접속 사용자
		String password="night";//오라클 접속 비번
		
		Connection con=null;//데이터 베이스 연결 con
		Statement st=null;//쿼리문 수행 st
		String sql=null;//쿼리문 저장변수
		BufferedReader reader=null;//읽어들인 문자를 버퍼링 즉 임시 저장해서 효율적으로 한꺼번에
		//읽어들임.
		try {
			Class.forName(driver);//jdbc드라이버 클래스 로드
			con=DriverManager.getConnection(url, user, password);//메서드 인자값으로
			//DB접속주소,오라클 사용자,비번을 전달해서 DB연결 con 생성
			reader=new BufferedReader(new InputStreamReader(System.in));
			/* 1.System.in은 키보드 입력장치와 연결됨.
			 * 2.InputStreamReader는 입력받은 바이트를 문자로 변경			 
			 */
			st=con.createStatement();
			
			System.out.println("boardT테이블에 레코드 저장하기>>");
			System.out.print("글쓴이 입력>>");
			String name=reader.readLine();
            System.out.print("제목 입력>>");
            String title=reader.readLine();
            System.out.print("내용 입력>>");
            String cont=reader.readLine();
            
            sql="insert into boardT values(bno_seq.nextval,'"+name+"','"
+title+"','"+cont+"',sysdate)"; //sysdate 오라클 날짜함수로 등록날짜 저장
            int re=st.executeUpdate(sql);//저장 쿼리문 수행후 성공한 레코드 행의 개수를 반환
            
            if(re==1) {
            	System.out.println("boardT 테이블에 저장 성공~");
            }
		}catch(Exception e) {e.printStackTrace();}
		finally {//가장 나중에 생성된 것을 가장 먼저 닫는다. 생성된 역순으로 닫는것이 일반적이다.
			try {
				if(st != null) st.close();
				if(reader != null) reader.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
	}
}











