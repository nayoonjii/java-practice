
public class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}//생성자 오버로딩

	//이클립스 메뉴로 getter()메서드만 만들어 본다.
	/* Ctrl+A 전체 선택하고 ctrl+i를 동시에 누르면 이클립스 개발툴 자바소스가 
	 * 자동 정렬된다. 
	 */
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}
