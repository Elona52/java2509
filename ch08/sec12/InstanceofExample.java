package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구현객체 생성 
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//ride 메소드 호출시 구현 객체를 매개값으로 전달 
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	    //인터페이스 매개변수 갖는 메소드
	public static void ride(Vehicle vehicle) {
		
		//case1: 매개값이 Bus인 경우에만 강제 타입 변환해서 checkFare()메소드 호출
		/*
		 * if(vehicle instanceof Bus){
		 * Bus bus = (Bus) vehicle;
		 * bus.checkFare();
		 * }
		 * */
		
		//case2
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
		
		
	}

}
