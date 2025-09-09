package ch08.sec02;

//두번째 구현객체 
public class Audio implements RemoteControl {

	// 인터페이스 메소드는 추상메소드이므로 재정의 해주어야 값 도출가능
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
}
