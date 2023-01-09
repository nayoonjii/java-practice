//다음 출력예를 보시고 구구단 프로그램을 구하는 알고리즘 코드를 완성
/*출력예)
     2단       3단       4단  ....    8단           9단
     2*1=2  3*1=3  4*1=4    8*1=8   9*1=9
     ...중략
     2*9=18 ........  ....          9*9=81
 * 
 */
class GuGuDan{
	public void gudan() {
		int i = 2;
	while(i<10) {
		System.out.print(i+" 단 \t");
		i++;
		}
	System.out.println();
	
	for(int a = 1; a<10; a++) {
		for(i = 2; i<10; i++) {
			System.out.print(i+"x"+a+"="+(a*i)+"  ");
			}
		System.out.println();
		}
	}
}
public class Test3 {
	public static void main(String[] args) {

		GuGuDan gu=new GuGuDan();
        gu.gudan();
        
	}

}
