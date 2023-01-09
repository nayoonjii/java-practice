class Product{
	String name;//상품명
	int price;//상품 가격
	
	Product(){}//기본생성자
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}//오버로딩 된 생성자
	Product(String name){
		this(name,800);//같은 클래스 내의 오버로딩 생성자를 호출
	}
	Product(int price){
		this("물",price);
	}
	
	void print() {
		System.out.println(name+","+price);
	}//사용자정의 메소드

}
public class Ex13_02 {

	public static void main(String[] args) {

		Product p1 = new Product("웰치스",700);
		Product p2 = new Product("커피");
		Product p3 = new Product(500);
		Product p4 = new Product();
		
		p1.print();
		p2.print();
		p3.print();
		
		

		
	}

}
