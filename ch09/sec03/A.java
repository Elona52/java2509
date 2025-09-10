package ch09.sec03;

public class A {

	//정적 멤버 클래스
	static class B {
		/*void methodB() {
         *     System.out.println("B 클래스의 methodB 입니다.");
         *      }
		 */
	}
	
	//필드
	//인스턴스 필드값으로 B객체 대입 
	B field1 = new B();

	//정적 필드값으로 B객체 대입 
	static B field2 = new B();

	//생성자
	A() {
		B b = new B();
	}

	//메소드 
	void method1() {     //A객체가 있어야만 사용가능한 메소드 
		B b = new B();
		//B field1 = new B();
	}

	void method2() {     //A객체가 없어도 사용가능한 메소드
		B b = new B();
		//B field1 = new B();
	}

}
