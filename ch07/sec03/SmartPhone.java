package ch07.sec03;

//부모클래스 상속 
public class SmartPhone extends Phone{

	//자식 생성자 선언 
	public SmartPhone(String model, String color) {
		
		super();   //컴파일시 자동생성 
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
