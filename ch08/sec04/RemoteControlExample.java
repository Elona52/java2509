package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//인터페이스 변수선언 
		RemoteControl rc;

		//객체생성후 인터페이스 변수에 대입 
		rc = new Television();
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();

		//객체생성후 인터페이스 변수에 대입 
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

	}

}
