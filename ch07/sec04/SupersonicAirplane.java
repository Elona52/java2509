package ch07.sec04;

public class SupersonicAirplane extends Airplane {

	//상수선언 (열거타입을 쓰는 것이 좋음)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	//상태 필드 선언 (한정된 값의 목록 : 열거타입) 
	public int flyMode = NORMAL;

	//메소드 재정의 
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			//부모클래스 fly() 메소드 호출 -super을 빼면 재정의한 메소드를 의미함.
			super.fly();
		}
	}
}
