public class Member2 {

	private String name;
	private Integer id;
	
	public Member2() {
		System.out.println("Member2() 실행");
	}
	
	public Member2(Integer id) {
		System.out.println("Member2(String id) 실행");
		this.id = id;
	}
	
	public Member2(String name,Integer id) {
		System.out.println("Member2(String name,String id) 실행");
		this.name = name;
		this.id = id;
	}
	public Integer getid() {
		return id;
	}
}
