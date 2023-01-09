
public class BlockEx09 {
	
	static {
		/*클래스 초기화 블록 특징)
		 * 1. 클래스변수 즉 정적변수 초기ㅘ에 사용된다.
		 * 2. 해당 클래스가 메모리에 처음 로딩될때 딱 한번만 수행된다.
		 */
		
		System.out.println("static {}");
	}
	
		{
		/*인스턴스 초기화 블록의 특징)
		 * 1. 인스턴스 변수 초기화에 사용된다.
		 * 2. 인스턴스 즉 객체를 생성 할 때 마다 수행된다.
		 * 3. 생성자 보다 먼저 수행된다.
		 */
		System.out.println("{ }");
	}
	
	public BlockEx09() {
		System.out.println("생성자");
	}


	public static void main(String[] args) {
		new BlockEx09();//객체생성
		new BlockEx09();
		
		
	}

}
