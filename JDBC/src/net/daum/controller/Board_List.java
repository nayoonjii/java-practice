package net.daum.controller;

import java.util.List;

import net.daum.dao.BoardTDAOImpl;
import net.daum.vo.BoardTVO;

/* 전체 게시물 목록을 가져와서 출력 */
public class Board_List {
	public static void main(String[] args) {

		BoardTDAOImpl bdao=new BoardTDAOImpl();		
		List<BoardTVO> blist=bdao.getBoardList();//게시물 목록
		
		System.out.println("전체 개시물 수 : "+blist.size()+"개");
		System.out.println("no \t title \t name \t cont \t date");
		System.out.println("===============================>");
		
		if(blist.size() > 0) {
			for(BoardTVO b:blist) {
				System.out.println(b.getBno()+"\t"+b.getBtitle()+"\t"+
			b.getBname()+"\t"+b.getBcont()+"\t"+b.getBdate());
			}
		}else {
			System.out.println("게시물 목록이 없습니다!");
		}//if else
	}
}





