class Obj09{
	
	int add(int x,int y) {//x,y는 매개변수 또는 전달인자
		int result=0;//지역변수
		result=x+y;
		return result;//return 키워드로 메서드를 호출한 곳으로 덧셈결과값을 반환
	}
	
	int abs(int a) {
		return a<0?-a:a;
	}
}

public class ObjectEx09 {
	public static void main(String[] args) {

		Obj09 obj=new Obj09();
		int re=obj.add(10,20);
		System.out.println("10+20 = "+re);
		
		/* 문제) Obj09 클래스 내에 int abs(int a){}메서드를 선언한 다음 삼항 조건 연산자를 활용해서 매개변수 a 인자값이
		 * 음의 정수일때는 양의절대치를 반환하는 메서드 알고리즘을 완성하자.
		 */
		//풀이 코드 시작
		System.out.println("-10의 절대값?" + obj.abs(-10));
	}
}
