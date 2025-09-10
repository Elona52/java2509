package ch08.sec11;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Driver 객체 생성(인터페이스 변수 -> 구현객체 대입)
		Driver driver = new Driver();

		// Vehicle 구현 객체 생성
		//bus와 taxi 두 개의 서로 다른 구현 객체 생성 -> 같은 drive 메서드를 호출해도 각기 다른 run() 동작을 하도록
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		//매개값으로 구현 객체 대입(다형성)
		//자동타입변환 -> 오버라이딩 메소드호출 -> 다형성
		driver.drive(bus);   //Driver 클래스의 drive 메서드에 bus 객체를 인자로 넘기는 코드
		driver.drive(taxi);  //Driver 클래스의 drive 메서드에 taxi 객체를 인자로 넘기는 코드
	}

}
