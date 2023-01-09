import net.daum.vo.BoardVO;

public class BoardMain {

	public static void main(String[] args) {

		BoardVO board = new BoardVO();
		
		board.setBno(10);
		board.setBname("홍길동");
		board.setBtitle("게시판 제목입니다.");
		board.setBcont("게시판 내용입니다.");
		
		System.out.println("게시판 번호: "+board.getBno());
		System.out.println("게시판 제목: "+board.getBtitle());
		System.out.println("글쓴이: "+board.getBname());
		System.out.println("게시판내용: "+board.getBcont());
		
	}

}
