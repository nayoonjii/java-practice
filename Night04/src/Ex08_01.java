
public class Ex08_01 {

	public static void main(String[] args) {
		int i;
		for(i=100; i>=1;i--) {
			if(i%7==0) {
				break;
			}
		}
		System.out.prinntln("1부터100사이 자연수 중에서 7의배수중 가장큰수는 ? "+ i);
	}

}
