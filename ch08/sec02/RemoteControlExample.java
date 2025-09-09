package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스 변수 선언과 동시에 구현객체 대입
		RemoteControl rc = new Television();
		// 인터페이스 변수 통해 구현객체에 재정의된 메소드 실행가능
		rc.turnOn();
	}

}
