package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.BoardTDAOImpl;
import net.daum.vo.BoardTVO;

/* 번호값을 스캐너로 부터 입력받아서 번호값이 있는 경우는 수정되게 하고,없는경우는 수정할수 없다라는
 * 유효성 검증 경고 메시지를 띄우게 한다.
 */
public class Board_Edit {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		BoardTDAOImpl bdao=new BoardTDAOImpl();	
		
		System.out.println("boardT 테이블 레코드 수정하기");
		System.out.print("번호값 입력 >>");
		int bno=Integer.parseInt(scan.nextLine());//문자열로 입력받아서 정수 숫자로 변경
		BoardTVO db_no=bdao.getFindNo(bno);// 번호를 기준으로 오라클로 부터 자료를 검색
		
		if(db_no != null) {
			System.out.println("검색된번호값 : "+ db_no.getBno());
			
			System.out.print("수정할 글쓴이 입력>>");
			String name=scan.nextLine();
            System.out.print("수정할 제목 입력>>");
            String title=scan.nextLine();
            System.out.print("수정할 내용 입력>>");
            String cont=scan.nextLine();
            
            BoardTVO eb=new BoardTVO();
            eb.setBname(name); eb.setBtitle(title); eb.setBcont(cont);
            eb.setBno(bno);
            
            int re=bdao.editBoard(eb);//번호를 기준으로 게시판 수정
            
            if(re==1) System.out.println("게시판 수정 성공~");
		}else {
            System.out.println("검색되는 번호값이 없어서 수정 못합니다.");			
		}//if else
	}
}














