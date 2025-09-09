package ch07.sec11;

//manager가 봉인해제 되어 일반 클래스로 전환 - 자식클래스의 자식클래스 생성 
public class Director extends Manager {
	
	//메소드 재정의 
	public void work() {
		System.out.println("제품을 기획합니다.");
	}
}
