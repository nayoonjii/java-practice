class Member09{
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	
	//매개변수가 없는 기본생성자 생략
	
	public String getMem_id() {//getter() 값 반환 메서드
		return mem_id;
	}
	public void setMem_id(String mem_id) {//setter() 값 저장 메서드
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
}

public class ClassEx09 {
	public static void main(String[] args) {

		Member09 member=new Member09();
		
		member.setMem_id("aaaaa");
		member.setMem_pwd("56789");
		member.setMem_name("홍길동");
		
		String id=member.getMem_id();
		System.out.println("아이디:"+id+",비번:"+member.getMem_pwd()+",회원이름:"
		+member.getMem_name());
	}
}









