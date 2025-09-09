package ch07.sec04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체생성
		SupersonicAirplane sa = new SupersonicAirplane();

//자식클래스에서 재정의된 메소드를 호출 
		//super 는 자식클래스 내부에서만 사용가능 
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
