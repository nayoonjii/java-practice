package net.daum.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/* 오라클 저장프로시저를 호출해서 실행하는 jdbc 자바 코드이다. 
 */
public class BoardTPro {
	public static void main(String[] args) {

		String driver="oracle.jdbc.OracleDriver";//oracle.jdbc는
		// 패키지명, OracleDriver는 오라클 jdbc드라이버 클래스명
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//오라클 접속주소,xe는 데이터베이스명,1521은 포트번호
		String user="night";//오라클 접속 사용자
		String password="night";//오라클 접속 비번
		
		Connection con=null;//데이터 베이스 연결 con
		CallableStatement cs=null;//저장 프로시저 실행 참조변수
		PreparedStatement pstmt=null;//쿼리문 실행 참조변수
		ResultSet rs=null;//select문 수행후 검색 결과 레코드를 담는다.
		String sql=null;//쿼리문 저장
		Scanner scan=null;
		
		try {
			Class.forName(driver);//jdbc드라이버 클래스 로드
			con=DriverManager.getConnection(url, user, password);
			scan=new Scanner(System.in);
			System.out.print("번호 입력>>");
			int bno=Integer.parseInt(scan.nextLine());//문자열로 입력받아서 정수 숫자로 
			//변경
			sql="select bno from boardT where bno=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,bno);//쿼리문 첫번째 물음표에 정수 숫자로 번호값 저장
			rs=pstmt.executeQuery();//검색 쿼리문 수행후 결과 레코드를 rs에 저장
			if(rs.next()) {//검색 결과가 하나이면 if문으로 처리,next()메서드는 다음 레코드가 존재하
				//면 참
				sql="{call find_boardT(?,?,?,?)}";//find_boardT라는 저장프로시저를 호출
				cs = con.prepareCall(sql);//저장 프로시저 호출해서 실행할 cs생성
				cs.setInt(4,bno);
				
				cs.registerOutParameter(1,java.sql.Types.VARCHAR);//쿼리문의 첫번째
				//물음표에 컬럼으로 부터 받아올 값에 대비하기 위해서 자료형을 지정
				cs.registerOutParameter(2,java.sql.Types.VARCHAR);
				cs.registerOutParameter(3,java.sql.Types.VARCHAR);
				cs.execute();//저장 프로시저 실행
				
				System.out.println("no \t title \t writer \t cont ");
				System.out.println("===================================>");
				
				System.out.println(bno+"\t"+cs.getString(2)+"\t"+
				cs.getString(1)+"\t"+cs.getString(3));
			}else {
				System.out.println("검색 번호가 없어서 저장프로시저 호출해서 실행못합니다.");
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {//생성된 역순으로 닫는다.
			try {
				if(cs != null  ) cs.close();
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(scan != null) scan.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
	}
}










