package ch06.sec14;

public class Car {
	//필드 선언
	private int speed;
	private boolean stop;

	//speed 필드의 Getter/Setter 선언
	//그대로 값 리턴
	public int getSpeed() {
		return speed;
	}
	
	//스피드는 음수로 저장될 수 없기 때문에 조건문 -> 값 변경하여 저장
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	//stop 필드의 Getter/Setter 선언
	//그대로 값 리턴
	public boolean isStop() {
		return stop;
	}
	
	//스피드를 0으로 바꾸는 조건문
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) {    //true 생략가능
			this.speed = 0;}
	}
}
