package ch07.sec05;

public class SportsCar extends Car {
public void speedUp() {
	speed +=10;
}

//stop 메소드를 final로 선언했기 때문에 자식 클래스인 SportsCar에서 Stop()메소드 오버라이딩 할 수 없음.
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//}
}
