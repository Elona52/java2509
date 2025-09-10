package ch08.sec10;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();

		// 인터페이스 통해 호출
		vehicle.run();

		// vehicle.chcekFare 호출은 할 수 없음(구현클래스안에 있기 때문)

		// 강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle; // 인터페이스 타입을 구현클래스 타입으로 변환
		bus.run(); // 구현클래스에서 선언한 인터페이스 메소드와
		bus.checkFare(); // 구현클래스에서 선언한 메소드 모두 호출 가능

	}

}
