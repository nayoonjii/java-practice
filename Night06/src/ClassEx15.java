
public class ClassEx15 {

	public static void main(String[] args) {
		
		int a = 50, b=30, result = 0;
		result = Math.max(a, b);//a와b중 더 큰수
		System.out.println(a+"와 "+b+"중 더 큰수는? "+result);

		System.out.println("원주율값: "+ Math.PI);
		
		int r = 5;
		double area = 0.0;
		area = r*r*Math.PI;//반지름*반지름*원주율 = 원의 면적
		
		System.out.println("반지름이 "+r+"인 원의 면적: "+area);
		
		
	}

}
