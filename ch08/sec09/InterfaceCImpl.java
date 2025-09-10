package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {

	// 부모클래스 1
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
	}

	// 부모클래스 2
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
	}

	// 자식클래스
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
	}

}
