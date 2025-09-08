package ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car myCar = new Car("그랜저", "검정", 250);
        
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔" + myCar.color);
		System.out.println("현재속도: " + myCar.maxSpeed);
		
    }
}