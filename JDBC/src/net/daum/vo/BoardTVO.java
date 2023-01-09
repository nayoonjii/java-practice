package net.daum.vo;

public class BoardTVO {//중간 자료 저장빈 클래스=>데이터 저장빈 클래스
  /* 되도록이면 테이블 컬럼명과 빈클래스 변수명을 같게 한다.이유는 나중에 코드 라인을 줄일 수 있다. */
	
	private int bno;//게시판 번호
	private String bname;//글쓴이
	private String btitle;//제목
	private String bcont;//내용
	private String bdate;//등록날짜
	
	
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
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate.substring(0,10);//0이상 10미만 사이의 년월일 만 반환
	}	
}










