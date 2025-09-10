package ch09.sec03;

public class AExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A클래스 내부의 B클래스 선언 -> B클래스는 static클래스이기 때문에 메소드 실행가능
		A2.B b = new A2.B();
		System.out.println(b.field1);
		b.method1();

		System.out.println(A2.B.field2);
		A2.B.method2();
	}

}
