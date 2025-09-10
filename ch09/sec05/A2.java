package ch09.sec05;

public class A2 {

	String field = "A2-field";

	// A인스턴스 메소드1
	void method() {
		System.out.println("A2-method");
	}

	// 인스턴스 멤버 클래스(A클래스의 중첩된 B클래스)
	class B {
		// B인스턴스 필드
		String field = "B-field";

		// B인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}

		// B 인스턴스 메소드
		void print() {
			// B객체 필드와 메소드 사용
			System.out.println(this.field); // B의 field 값 반환
			this.method(); // B의 메소드

			// A객체 필드와 메소드 사용(외부에 있는 A클래스 객체 참조(A2.))
			System.out.println(A2.this.field); // A의 field 값 반환
			A2.this.method(); // A의 메소드
		}
	}

	// A의 인스턴스 메소드2 : useB
	void useB() {
		B b = new B(); // A클래스 내부에서 B타입의 b변수 선언 - B객체 만들어서 대입
		b.print(); // B객체 안에 print
	}
}
