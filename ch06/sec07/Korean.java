package ch06.sec07;

public class Korean {

	String nation = "대한민국";
	String name; //사람마다 다름 - 객체 만들때 제공되어야 할 값 
	String ssn;  //주민번호 

//생성자 선언(매개변수 선언 : 외부값을 가지고 필드 데이터를 변경하는 것)
	public Korean(String n, String s) {
		name = n;
		ssn = s;

		/**
		 * 매개변수의 이름과 필드이름을 똑같이 주었을때, 필드임을 구분하기 위해 this키워드를 필드명 앞에 붙여줌.
		 * this는 현재 객체, this.name은 현재 객체의 데이터 필드
		 * 
		 * public Korean(String name, String ssn) { 
		 * this.name = name; 
		 * this.ssn = ssn;
		 * }
		 * }
		 */
	}

}
