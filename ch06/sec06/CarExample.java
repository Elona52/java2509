package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car 객체 생성 - new 타입통해 car 클래스로 객체 생성하여 myCar라는 변수(번지)에 값을리턴해줌 
		Car myCar = new Car();
		
		//Car 객체 필드값 읽기
		System.out.println("제작회사: " + myCar.company);  //. : myCar변수가 참조하는(가지고 있는) 필드값을 가져옴 
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔" + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed); // 초기값: 0 
		
		//Car 객체 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed); // 값 지정후 결과: 60 

	}

}
