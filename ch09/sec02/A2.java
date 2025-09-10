package ch09.sec02;

public class A2 {

	// 인스턴스 멤버 클래스
	class B {
		// 인스턴스 필드
		int field1 = 1;

		// 정적 필드
		static int field2 = 2;

		// 생성자
		B() {
			System.out.println("B- 생성자 실행");
		}

		// 인스턴스 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}

		// 정적 메소드
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}

	// A의 인스턴스 메소드
	void useB() {
		B b = new B(); // A클래스의 B타입으로 만든 A필드(b변수) -> B객체 만들어서 대입
		System.out.println(b.field1);
		b.method1(); // method1은 인스턴스 필드

		System.out.println(B.field2); // B클래스의 정적 필드
		B.method2(); // method2는 정적 필드

	}
}
