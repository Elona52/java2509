package ch06.sec08;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
 
		//리턴값 없는 setGas() 메서드 호출 
		myCar.setGas(5);

		//메서드 호출 -> 결과값 T/F
		if (myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			//메서드 호출 
			myCar.run();
		}

		System.out.println("gas를 주입하세요.");
	}

}
