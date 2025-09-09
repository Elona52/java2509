package ch07.sec10;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone phone = new Phone - 추상클래스이기 때문에 객체 생성할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();           //부모클래스 메소드  
		smartPhone.internetSearch();   //자식클래스 메소드 
		smartPhone.turnOff();          //부모클래스 메소드 
	}

}
