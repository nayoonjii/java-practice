class Board{
	String writer;//게시판 글쓴이
	String title;//게시판 제목
	String content;//게시판 내용
	
	Board(){//생성자의 주된 기능은 멤버변수 초기화
		writer="홍길동";
		title="게시판 제목입니다.";
		content="게시판 내용입니다.";
	}
	
	void print() {
		System.out.println("글쓴이 :"+writer+",제목 : "+title+",글내용 : "+content);
	}
}
public class ClassEx05 {
	public static void main(String[] args) {

		Board board=new Board();//new Board();에 의해서 기본생성자 호출
		board.print();
	}
}
