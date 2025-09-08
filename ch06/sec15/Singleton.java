package ch06.sec15;

public class Singleton {

	// 2_private 정적필드 선언
	private static Singleton singleton = new Singleton();

	// 1_자신의 생성자 선언 - private는 같은 클래스 내에서는 호출가능
	private Singleton() {
	}

	//3_public 정적 메소드 선언
	//getInstance: 객체를 얻는 인스턴스 -> 리턴하면 처음 객체에 값을 입력한 내용이 가져와짐
	public static Singleton getInstance() {
		return singleton;
	}

}
