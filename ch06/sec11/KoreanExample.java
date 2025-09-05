package ch06.sec11;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("123456-1234567", "김자바");

		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

		//final 필드는 값변경 불가
//		k1.nation = "USA";
//		k1.ssn = "123-12-1234";
		k1.name = "김자바";
	}

}
