package ch06.sec11;

public class Korean {

	// 인스턴스 final 필드 선언 : 최종적인 값이 되어서 프로그램 실행 도중 수정불가
	final String nation = "대한민국"; //고정값
	final String ssn; //Korean 객체 생성시 부여됨 -> 생성자 매개값으로 주민등록번호를 받아 초기값 대입

	// 인스턴스 필드 선언
	String name;

	// 생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
