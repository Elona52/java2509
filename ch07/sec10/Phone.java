package ch07.sec10;

//공통되는 특성을 모아 만든 부모클래스(추상클래스) 
public class Phone {
	//필드선언 
	String owner;

	//생성자 선언 
	Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드 선언 
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
