package ch07.sec08;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//드라이버 객체 생성 
		Driver driver = new Driver();
		
		//자식1객체 생성 
		Bus bus = new Bus();
		driver.drive(bus);  

		//자식2객체 생성 
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
