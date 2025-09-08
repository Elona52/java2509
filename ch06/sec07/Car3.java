package ch06.sec07;

public class Car3 {

	//필드 선언: 초기값이 있는 경우, 없는 경우 
	String company = "현대자동차";
	String model; 
	String color;
	int maxSpeed;

	
	//case2
	Car3(String model){
		this(model, "은색", 250);
	}

	Car3(String model,String color){
		this(model, color, 250);
	}
	
	Car3(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

