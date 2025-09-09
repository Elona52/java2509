package ch07.sec10;

public class SmartPhone extends Phone{
	//생성자 선언 
	SmartPhone(String owner) {
		super(owner);  //부모클래스 호출 
	}

	//자식클래스 메소드 선언 
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
