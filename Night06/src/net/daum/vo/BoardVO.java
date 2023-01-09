package net.daum.vo;//package예약어로 net폴더 하위에 유일 도메인 폴더명 daum, 하위에 vo라는 패키지 폴더명을 생성

public class BoardVO {

	private int bno;//게시판 번호
	private String bname;//글쓴이
	private String btitle;//제목
	private String bcont;//글내용
	
	//기본생성자 생략
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcont() {
		return bcont;
	}
	public void setBcont(String bcont) {
		this.bcont = bcont;
	}
	
	
	
	
	
}
