//매개변수도 있고, 러턴값도 있는 메서드를 가진 함수형 인터페이스 실습
public class MyFunExample03 {
	public static void main(String[] args) {

		MyFunctionalinterface3 fi;
		fi = (x,y)->{
			int result = x+y;
			return result;
		};
		
		System.out.println(fi.method03(3, 5));
		
		fi = (x,y)->{ return x*y;};
		System.out.println(fi.method03(2, 5));
		
		fi = (x,y) -> x+y;//return만 있는경우{}와 return이 생략가능
		System.out.println(fi.method03(3, 3));
		
		fi = (x,y) -> sum(x,y);//다른 정적메서드  sum()을 호출
		System.out.println(fi.method03(6, 5));
	}

	public static int sum(int x, int y) {
		return x-y;
	}
}
