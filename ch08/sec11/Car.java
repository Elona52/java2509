package ch08.sec11;

public class Car {

	// 인터페이스 변수 선언 -> 구현객체 대입
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();

	// 인터페이스에 선언된 추상 메소드 호출 -> 구현객체의 roll() 메소드 실행
	// 한국 타이어 메소드 실행
	void run() {
		tire1.roll();
		tire2.roll();
	}

}
