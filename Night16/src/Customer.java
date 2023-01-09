import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
/* 객체단위로 읽고 쓰기 위한 클래스 설계 => 객체 직렬화
 */
public class Customer implements Externalizable {

	int id;
	String name;//이름
	int age;//나이
	double height;//키
	
	public Customer() {}
	
	public Customer(int id, String name, int age, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}//전달인자 개수가 다른 생성자 오버로딩
	
	@Override
	public void readExternal(ObjectInput ois) 
			throws IOException, ClassNotFoundException {
		id = (Integer)ois.readObject();//다운캐스팅하면서 오토언박싱
		name = (String)ois.readObject();
		age = (Integer)ois.readObject();
		height = (Double)ois.readObject();
	}//객체단위로 읽어오기

	@Override
	public void writeExternal(ObjectOutput oos)
			throws IOException {
		oos.writeObject(new Integer(id));//오토박싱과 업캐스팅
		oos.writeObject(name);//업캐스팅
		oos.writeObject(new Integer(age));//오토박싱과 업캐스팅
		oos.writeObject(new Double(height));//오토박싱과 업캐스팅
	}//객체단위로 기록

	@Override
	public String toString() {
		return "id = "+id+", name = "+name+", age = "+age+", height = "+height;
	}
}