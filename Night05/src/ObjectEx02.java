public class ObjectEx02 {
	public static void main(String[] args) {
       int result=abs(-100);
       System.out.println("-100의 절대값 = "+result);
       
       System.out.println("-50의 절대값 = "+ abs(-50));
	}//main()
	
	static int abs(int data) {
		if(data<0) {
			data=-data;
		}
		return data;//return에 의해서 메서드를 호출한 곳으로 반환
	}//abs()
}
