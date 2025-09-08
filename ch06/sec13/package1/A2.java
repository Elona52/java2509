package ch06.sec13.package1;

public class A2 {

	A2 a1 = new A2(true);
	A2 a2 = new A2(1);
	A2 a3 = new A2("문자열");

	public A2(boolean b) {
	}

	A2(int i) {

	}

	//해당 클래스 안에서만 사용가능
	private A2(String s) {
	}
}
