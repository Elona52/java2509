package ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car myCar = new Car("그랜저", "검정", 250);
        System.out.println("car.model: " + myCar.model);
        System.out.println("car.color: " + myCar.color);
        System.out.println("car.maxSpeed: " + myCar.maxSpeed);
    }
}