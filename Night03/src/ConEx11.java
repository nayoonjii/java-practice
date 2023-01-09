
public class ConEx11 {

	public static void main(String[] args) {
		
		int i=1;
		while(true) {//무한루프문: 조건이 무조건 참이여서 영원히 반복하는 반복문을 뜻한다.
			System.out.print(i+"번서울\t");
			
			if(++i>=4) {
				break;//무한루프문 종료
			}//if
		}//while
		
	}

}
