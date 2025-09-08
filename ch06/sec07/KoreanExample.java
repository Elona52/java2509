package ch06.sec07;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Korean 객체 생성(생성자가 두개이기 떄문에 데이터도 2개만들어서 대입해줘야함)
		
		//매개변수 n,s에 대입 
		Korean k1 = new Korean("박자바", "011225-1234567");

		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		System.out.println();
		
		//매개변수 n,s에 대입 
		//또다른 Korean 객체 생성
		Korean k2 = new Korean("김자바", "930525-0654321");

		System.out.println("k2.nation: " + k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);

	}

}
