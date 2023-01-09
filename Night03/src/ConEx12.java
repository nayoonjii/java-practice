
public class ConEx12 {

	public static void main(String[] args) {
		
		int i=1;
		
		for(;;) {//초기치, 조건식, 증감식을 생략하면 무한루프문이 된다.
			System.out.print(i+"번홍길동\t");
			if(++i>=4) {
				break;//반복문 중단
			}//if
		}//for

	}

}
