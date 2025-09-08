package ch06.sec08;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성,초기화 
		Computer myCom = new Computer();
		
		//외부객체가 가지고 있는 메서드 호출 - sum()
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1: " + result1);

		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2: " + result2);
		
		//메서드 호출시 배열 제공 후 합산결과 리턴 받아 변수에 대입
		int[] values = { 1, 2, 3, 4, 5 };
		int result3 = myCom.sum(values);
		System.out.println("result3: " + result3);
		
		//메서드 매개변수가 가변길이 인경우 이미 변수 선언되어있기에 해당코드 가능
		int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result4: " + result4);

	}

}
