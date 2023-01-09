
public class Ex07_01 {
	public static void main(String[] args) {
		int cnt = 0;//짝수개수
		int sum = 0;//누적합
		for(int i = 22; i<=76; i=i+2) {//i+=2는 i=i+2와같다
			sum += i;
			cnt++;//짝수 개수 카운터
			
			}
		System.out.println("짝수의 개수:"+cnt);
		System.out.println("짝수의 누적합: "+sum);
		}

	}


