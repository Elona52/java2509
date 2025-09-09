package ch08.sec02;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//인터페이스 변수 선언 
		RemoteControl rc;
		
		//인터페이스 변수에 Television 객체 대입
		rc = new Television();
		rc.turnOn();
		
		//인터페이스 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}

}
