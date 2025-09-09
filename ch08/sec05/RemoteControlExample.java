package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 변수 선언
		RemoteControl rc;

		// 구현객체에 값 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(3);

		rc.setMute(true);
		rc.setMute(false);

		System.out.println("현재 볼륨: " + rc.getVolume());

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);
		System.out.println("현재 볼륨: " + rc.getVolume());

	}

}
