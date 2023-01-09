/* 멀티스레드는 아니고 스레드를 흉내를 낸 프로그램
 */
class Thread03{
	String name;
	
	Thread03(String name){
		this.name = name;
	}//생성자 오버로딩
	
	public void start() {
		run();//run()메서드 호출
	}

	public void run() {
		for(int num = 1;num<=5; num++) {
			for(int k = 1; k<1000000; k++);
			System.out.println(name+" : "+num);
		}
	}
}
public class ThreadEx03 {
	public static void main(String[] args) {

		Thread03 th01 = new Thread03("첫번째 스레드");
		Thread03 th02 = new Thread03("두번째 스레드");
		th01.start(); th02.start();
		
	}
}
