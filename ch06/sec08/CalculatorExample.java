package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성 
		Calculator myCalc = new Calculator();
		
		//리턴값 없는 powerOn() 메서드 호출 
		myCalc.powerOn();
		
		//리턴값 있는 메서드호출 
		// plus 메소드 호출시 5,6을 매개값으로 제공 -> 덧셈결과 받아 result1 변수에 대입
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);

//		int x = 10;
//		int y = 4;

		// divide 메소드 호출시 x,y을 매개값으로 제공 -> 나눗셈 결과 받아 result2 변수에 대입
		double result2 = myCalc.divide(10, 4);
		System.out.println("result2: " + result2);

		// 리턴값 없는 powerOff() 메소드 호출
		myCalc.powerOff();
	}

}
