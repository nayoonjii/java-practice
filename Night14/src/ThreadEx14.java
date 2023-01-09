import java.util.ArrayList;

/* 동기화 처리 즉 임계영역 처릭 되었고, 동시에 스케줄링 메서드의 wait(), notify()메서드에 대한 
 * 실습이다. 음식 식당 Table, 요리사 스레드, 소비자 스레드 등에 관한 실습
 */
class Table{
	String[] dishNames = {"donut","donut","burger"};//음식 재료
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();//추가한 음식 목록을 저장할 컬렉션 이고,
	//자바7부터는 뒷부분<>제네릭 타입은 생략가능
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();//현재실행중인 스레드 이름을 반환
			System.out.println(name+" is waiting");
			try {
				wait();//요리사 스레드를 기다리게 한다.
				Thread.sleep(500);
			}catch(InterruptedException ie) {}
		}//while 
		dishes.add(dish);//음식추가
		
		notify();//대기실에서 기다리는 소비자 쓰레드를 깨운다.
		System.out.println(dishes.toString());//추가한 음식목록
	}//동기화가 처리된 테이블에 음식 추가
	
	//음식제거
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) {//음식이 없을때
				System.out.println(name+" is waiting");
				
				try {
					wait();//소비자 스레드를 기다리게 한다.
					Thread.sleep(500);
				}catch(InterruptedException id) {}
			}//while
			
			while(true) {
				for (int i = 0; i<dishes.size();i++) {
					if(dishName.equals(dishes.get(i))) {//먹을 음식 이름에 컬렉션에 있는것과 같다면
						dishes.remove(i);//컬렉션으로 부터 먹을 음식을 제거
						notify();//요리사를 깨운다
						return;//종료				
					}//if
				}//for
				try {
					System.out.println(name+" is waiting");
					wait();//원하는 음식이 없기때문에 소비자 스레드를 쉬게 한다.
					Thread.sleep(500);
				}catch(InterruptedException ie) {ie.printStackTrace();}
			}//while end
		}//특정영역 동기화 처리
	}//remove()
	
	public int dishNum() {
		return dishNames.length;//음식재료개수 3
	}//음식 재료개수를 반환
}//Table class

//소비자 스레드 생성
class Customer implements Runnable{
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}//생성자 오버로딩
	
	
	@Override
	public void run() {
		while(true) {
			try {Thread.sleep(100);}catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);//테이블로 부터 음식 제거
			System.out.println(name+" ate a "+food);
		}//while
	}//run()
}//Customer class

//요리사 스레드
class Cook implements Runnable{
	private Table table;
	
	public Cook(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());//0,1,2중 임의의 정수 난수가 저장
			table.add(table.dishNames[idx]);//테이블에 음식 추가
			
			try {Thread.sleep(10);}catch(InterruptedException e) {}
		}//while
	}//run()	
}//Cook class
public class ThreadEx14 {
	public static void main(String[] args) throws Exception {
		Table table = new Table();
		
		new Thread(new Cook(table),"cook01").start();//요리사 스레드 시작
		new Thread(new Customer(table,"donut"),"cust01").start();//소비자 스레드 시작
		new Thread(new Customer(table,"burger"),"cust02").start();
		
		Thread.sleep(2000);//2초뒤에
		System.exit(0);//프로그램 정상 종료, Systeml.exit(1)일때는 비정상적인 종료.
	}
}












