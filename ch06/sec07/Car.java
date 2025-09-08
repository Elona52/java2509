package ch06.sec07;

public class Car {
	
	//기본생성자 
    String model;
    String color;
    int maxSpeed;

    //필드는 객체의 속성(데이터)으로 객체 생성 시 초기화되어야함 
    Car(String model, String color, int maxSpeed) {
    	
    	//생성자에서 this.model = model; 형태로 필드를 초기화
    	//필드:파란색 , 매개변수:갈색
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
