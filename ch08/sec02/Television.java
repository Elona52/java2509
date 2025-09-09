package ch08.sec02;

//첫번째 구현객체 
public class Television implements RemoteControl {

	// 인터페이스 메소드는 추상메소드이므로 재정의 해주어야 값 도출가능
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

		System.out.println("TV를 켭니다.");
	}

}
