package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.BoardTDAOImpl;
import net.daum.vo.BoardTVO;

/* 스캐너로 부터 번호값을 입력 받아서 오라클  DB로 부터 검색한 다음 번호값이 있는 경우 삭제되게 하고 없는 경우는 
 * 유효성 검증 경고 메시지를 띄우게 한다.
 */
public class Board_Del {
	public static void main(String[] args) {

		BoardTDAOImpl bdao=new BoardTDAOImpl();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("boardT 테이블 레코드 삭제 연습");
		System.out.print("번호값 입력>>");
		int no=Integer.parseInt(scan.nextLine());
		
         BoardTVO db_no=bdao.getFindNo(no);//오라클로 부터 번호값 검색
         
         if(db_no == null) {
        	 System.out.println("해당 번호가 없기 때문에 삭제 못합니다.");
         }else {
        	 int re=bdao.delBoard(no);//번호를 기준으로 삭제
        	 
        	 if(re==1) System.out.println("게시판 삭제 성공~");
         }//if else
	}
}
















