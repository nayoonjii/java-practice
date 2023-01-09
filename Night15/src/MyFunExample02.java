// 매개변수가 있고, 리턴값이 없는 함수형 인터페이스를 람다식으로 활용한 예제
public class MyFunExample02 {
	public static void main(String[] args) {
		
		MyFunctionalinterface02 fi;
		fi = (x) -> {
			int result = x*5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = (x) ->{System.out.println(x+5);};
		fi.method(10);
		
		fi = x -> System.out.println(x-5);// 매개변수가 하나이면() 생략가능
		fi.method(2);
	}
}

