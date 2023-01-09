class Product{
	private String name;//제품명
	private int price;//제품 가격
	
	public void setName(String new_name) {
		name=new_name;
	}//setter()
	
	public String getName() {
		return name;
	}//getter()
	
	public void setPrice(int new_price) {
		price=new_price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class Ex11_02 {
	public static void main(String[] args) {

		Product p=new Product();
		p.setName("커피");
		p.setPrice(150);
		
		System.out.println("출력:자판기 => 제품목록");
		System.out.println(p.getName()+"\t"+p.getPrice()+"원");
		
		Product p2=new Product();
		p2.setName("비타500"); p2.setPrice(500);
		
		System.out.println(p2.getName()+"\t"+p2.getPrice()+"원");
	}
}








