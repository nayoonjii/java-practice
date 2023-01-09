/* 현재 실행중인 main스레드 이름을 반환.
 * main()메서드로 단일 스레드 이다. 
 */
public class ThreadEx02 {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());//현재 실행중인 스레드이름을 반환
		
		
	}
}
