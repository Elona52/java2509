package ch07.sec03;

public class SmartPhone2 extends Phone2 {
	
	//자식 생성자 선언 
	public SmartPhone2(String model, String color) {
		//부모클래스 - 외부에서 받은 값 넣기 
		super(model, color);
		System.out.println("SmartPhone2(String model, String color)생성자 실행됨");
	}
}
