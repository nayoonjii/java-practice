//인스턴스 초기화 블록
class Product11{
	static int count = 0;//생산된  총 제품개수 => 정적변수 (생성된 객체에 의해서 값을 공유)
	int serialNo;//제품고유번호인 시리얼 번호=>인스턴스 변수로 생성도니 객체마다 고유한 주소값을 가짐. 즉 주소값이 다르다
	//고유한 제품 번호값을 가짐
	
	{//인스턴스 초기화 블록
		++count;//누적카운터
		serialNo = count;//고유한 제품번호
	}
	
	public Product11() {}//매개변수가 없는 기본생성자
}
public class BlockEx11 {

	public static void main(String[] args) {
		Product11 p01 = new Product11();
		Product11 p02 = new Product11();
		Product11 p03 = new Product11();
		
		System.out.println("p01의 제품 번호(고유한 시리얼 번호) : "+p01.serialNo);
		System.out.println("p02의 제품 번호(고유한 시리얼 번호) : "+p02.serialNo);
		System.out.println("p03의 제품 번호(고유한 시리얼 번호) : "+p03.serialNo);
		
		
		System.out.println("생산된 총 제품수 = "+Product11.count);//해당클래스면.정적변수로 접근한다.
	}

}
