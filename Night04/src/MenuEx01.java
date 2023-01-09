import java.util.Scanner;

public class MenuEx01 {

	public static void main(String[] args) {
		
		int menu=0;
		int number=0;
		
		Scanner scan= new Scanner(System.in);
		
		outer://이중반복문을 중단하기위한 레이블 명 지정
			while(true) {//무한루프문
				System.out.println("1. 물냉면");
				System.out.println("2. 비빔냉면");
				System.out.println("3. 강된장 보리밥");
				System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>>");
				
				menu=Integer.parseInt(scan.nextLine());//문자열로 입력받아서 정수 숫자로 변경해서 좌측변수에 저장
				
				if(menu==0) {
					System.out.println("메뉴선택 프로그램 종료합니다.");
					break;//무한루프문 종료
				}else if(!(1<=menu && menu<=3)) {
					System.out.println("메뉴를 잘못 선택했습니다.(종료는 0)");
					continue;//아래문장 수행하지 않고 다음 반복을 위해서 반복문 처음으로 돌아감.
				}//if else if
				
				for(;;) {//for 무한 루프문
					System.out.print("계산할 값 입력(계산종료:0, 전체종료:99)>>");
					number=Integer.parseInt(scan.nextLine());
					
					if (number == 0) {
						break;//계산종료
					}
					if (number == 99) {
						break outer;//전체 종료
					}
					
					switch(menu) {
					case 1:
						System.out.println("물냉면 가격="+(number+1000)+"원");
						break;
						
					case 2:
						System.out.println("비빔냉명 가격="+(number+1200)+"원");
						break;
						
					case 3:
						System.out.println("강된장 보리밥="+(number+1300)+"원");
						break;
					}
				}//for
			}//while

	}

}
