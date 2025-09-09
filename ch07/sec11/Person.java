package ch07.sec11;

//봉인 - 해당 클래스만 상속 허용 
public sealed class Person permits Employee, Manager {
	
	//부모 클래스 
	//필드 선언 
	public String name;
	
	//메소드 선언 
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
