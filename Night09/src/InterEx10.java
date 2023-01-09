class A10{
	public void methodA(B10 b) {//B10 b = new B10();
		b.methodB();
	}
}

class B10{
	public void methodB() {
		System.out.println("methodB()");
	}
}
public class InterEx10 {
	public static void main(String[] args) {

		A10 a10 = new A10();
		a10.methodA(new B10());
	}

}
