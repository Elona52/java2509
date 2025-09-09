package ch07.sec03;

public class Phone2 {
	//필드선언 
	public String model;
	public String color;
	
	//매소드 선언 
	//매개변수 추가 
	public Phone2(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone2(String model, String color) 생성자 실행");
	}
}
