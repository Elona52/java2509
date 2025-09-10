package ch09.sec02;

public class A {
	// 필드
	// 생성자
	// 메소드

	// B는 A의 인스턴드 멤버 클래스
	// A클래스 - B타입 A필드생성 - B객체 만들어서 대입
	class B {
	}

	// 인스턴스 필드값으로 B객체 대입
	B field = new B();

	// 생성자
	A() {
		B b = new B();   //B타입의 b변수 - B객체 만들어서 대입 
	}

	//인스턴스 메소드
	//메소드에 static이 붙으면 B객체 쓸 수 없음
	void method() {
		B b = new B();   //B타입의 b변수 - B객체 만들어서 대입
	}
}