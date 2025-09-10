package ch09.sec02;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A객체 생성 
		A a = new A();

		//A객체 통해 B객체 생성 
		A.B b = a.new B();
	}

}
