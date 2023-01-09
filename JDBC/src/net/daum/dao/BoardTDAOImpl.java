package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.daum.vo.BoardTVO;

/* 오라클 jdbc연동 클래스 */
public class BoardTDAOImpl {
	String driver="oracle.jdbc.OracleDriver";//oracle.jdbc는
	// 패키지명, OracleDriver는 오라클 jdbc드라이버 클래스명
	String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//오라클 접속주소,xe는 데이터베이스명,1521은 포트번호
	String user="night";//오라클 접속 사용자
	String password="night";//오라클 접속 비번
	
	Connection con=null;//데이터 베이스 연결 con
	Statement st=null;//쿼리문 수행 st
	PreparedStatement pt=null;//쿼리문 수행 pt
	ResultSet rs=null;//select문 수행후 결과 레코드행을 저장할 rs
	String sql=null;//쿼리문 저장변수
	
	//전체 레코드 검색
	public List<BoardTVO> getBoardList(){//게시판 목록
		List<BoardTVO> blist=new ArrayList<>();//업캐스팅하면서 컬렉션 제네릭 객체 생성
		
		try {
			Class.forName(driver);//오라클 jdbc드라이버 클래스 로드
			con=DriverManager.getConnection(url, user, password);//메서드 인자값으로
			//오라클 연결 주소,사용자,비번을 전달해서 DB연결 con생성
			sql="select * from boardT order by bno desc";
			pt=con.prepareStatement(sql);//쿼리문을 미리 컴파일하여 수행할 pt생성
			rs=pt.executeQuery();//검색 쿼리문 수행후 결과레코드를 rs에 저장
			
			while(rs.next()) {// next()메서드는 다음 레코드 행이 존재하면 참.
				//복수개의 레코드가 검색될 때는 while반복문으로 처리
				BoardTVO b=new BoardTVO();
				b.setBno(rs.getInt("bno"));//bno컬럼 레코드 번호값이 정수 숫자이면 getInt()
				//메서드로 가져온다.
				b.setBtitle(rs.getString(3));//3의 뜻은 select문뒤에 검색되는 컬럼 순번.여기
				//서는 전체컬럼(*)이 검색되기 때문에 테이블 생성시 생성된 컬럼순번이라고 생각하면 된다.
				b.setBcont(rs.getString(4));//해당 컬럼 레코드가 문자열이면 getString()
				//메서드로 가져온다.
				b.setBname(rs.getString("bname"));
				b.setBdate(rs.getString("bdate"));
				
				blist.add(b);//컬렉션에 b객체를 추가=>복수개의 원소값이 저장됨.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
		return blist;
	}//getBoardList()

	
	//db로 부터 번호값 검색
	public BoardTVO getFindNo(int bno) {
		BoardTVO db_no=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			sql="select bno from boardT where bno=?";//?는 임의의 모르는 값
			pt=con.prepareStatement(sql);//쿼리문을 미리 컴파일 하여 수행할 pt생성
			pt.setInt(1,bno);//쿼리문 첫번째 물음표에 정수 숫자로 번호값 저장,1은 쿼리문의 첫번째
			//물음표를 뜻함.
			
			rs=pt.executeQuery();//select문은 executeQuery()메서드를 사용함. 검색 결과
			//레코드를 rs에 저장시킴.
			
			if(rs.next()) {//검색되는 레코드번호가 하나이면 if문으로 처리,next()메서드는 다음 레
				//코드 행이 존재하면 참
				db_no=new BoardTVO();
				db_no.setBno(rs.getInt(1));//1은 select문 뒤에 검색되는 컬럼 순번
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
          try {
        	  if(rs != null) rs.close();
        	  if(pt != null) pt.close();
        	  if(con != null) con.close();
          }catch(Exception e) {e.printStackTrace();}
		}
		return db_no;
	}//getFindNo()


	//게시판 수정
	public int editBoard(BoardTVO eb) {
		int re=-1;//방명록 수정 실패시 반환값
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();//쿼리문을 수행할 st생성
			
			sql="update boardT set bname='"+eb.getBname()+"',btitle='"
+eb.getBtitle()+"',bcont='"+eb.getBcont()+"'  where bno="+eb.getBno();
			//번호를 기준으로 글쓴이,글제목,글내용을 수정한다.
			
			re=st.executeUpdate(sql);//수정 쿼리문 수행후 성공한 레코드 행의 개수를 반환
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		  try {
			  if(st != null) st.close();
			  if(con != null) con.close();
		  }catch(Exception e) {e.printStackTrace();}
		}		
		return re;
	}//editBoard()
	
	
	//번호를 기준으로 게시판 삭제
	public int delBoard(int no) {
		int re=-1;//삭제 실패시 반환값
		
		try {
             Class.forName(driver);
             con=DriverManager.getConnection(url, user, password);
             sql="delete from boardT where bno=?";
             pt=con.prepareStatement(sql);//쿼리문을 미리 컴파일 하여 수행할 pt생성
             pt.setInt(1,no);//쿼리문의 첫번째 물음표에 정수 숫자로 번호값 저장
            
             re=pt.executeUpdate();//삭제 쿼리문 수행후 성공한 레코드 행의 개수를 반환
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return re;
	}//delBoard()
}



































