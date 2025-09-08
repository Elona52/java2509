package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//필드에 직접 변경 못하기 때문에 setSpeed 선언해주어야함 - 잘못된 속도 변경(음수일경우 0으로 출력)
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경(양수이기 때문에 그대로 60 출력)
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//멈춤 메소드 호출 - 게터 -> boolean 값으로 리턴(멈춤이 true 이면 0출력)
		if(!myCar.isStop()) {     //true되어 실행되면
			myCar.setStop(true);  //자동차가 움직이고 있다면 멈추게 하기 -> 스피드 0
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
		
	}

}
