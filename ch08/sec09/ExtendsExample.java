package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// InterfaceCImpl 클래스의 객체를 생성
		InterfaceCImpl impl = new InterfaceCImpl();

		// 인터페이스 InterfaceA 타입의 변수 ia에 impl 객체를 대입
		// InterfaceA에 선언된 methodA()를 호출
		InterfaceA ia = impl;
		ia.methodA(); // 부모클래스1 메소드 호출
		System.out.println();

		// 인터페이스 InterfaceB 타입의 변수 ib에 impl 객체를 대입
		// InterfaceB에 선언된 methodB()를 호출
		InterfaceB ib = impl;
		ib.methodB(); // 부모클래스2 메소드 호출
		System.out.println();

		// 인터페이스 InterfaceC 타입의 변수 ic에 impl 객체를 대입
		// InterfaceC에 선언된 methodC()를 호출
		InterfaceC ic = impl; // 부모메서드1,2 와 자식클래스 메소드 호출
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();

	}

}
