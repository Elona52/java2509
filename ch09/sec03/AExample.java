package ch09.sec03;

public class AExample {

	public static void main(String[] args) {

		// A클래스 안에 중첩된 B클래스
		A.B b = new A.B(); // B가 A안에 static으로 선언되어 있을 때

		// B클래스 내부에 methodB() 메서드를 정의
		// b.methodB();
	}
}
