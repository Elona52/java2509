package ch08.sec10;

public class Bus implements Vehicle {

	// 구현클래스
	@Override
	public void run() { // 인터페이스 메소드 재정의
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() { // 구현클래스내에 메소드 정의
		System.out.println("승차요금을 체크합니다.");
	}

}
