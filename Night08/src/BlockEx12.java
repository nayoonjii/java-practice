//생성자를 통한 초기화
class Document{
	static int count = 0;//정적변수
	String name;//인스턴스 변수
	
	Document(){
		this("제목없음"+ ++count);//같은 클래스의 다른생성자를 호출
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 "+this.name+"이 생성");
		//this.은 생략가능
	}//생성자 오버로딩
	
}
public class BlockEx12 {

	public static void main(String[] args) {
		new Document();
		new Document("자바.txt");//오버로딩 된 생성자 호출
		new Document();		
		new Document();		
		
	}

}
