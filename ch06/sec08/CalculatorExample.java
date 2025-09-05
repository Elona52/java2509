package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();

		myCalc.powerOn();

		// plus 메소드 호출시 5,6을 매개값으로 제공 -> 덧셈결과 받아 result1 변수에 대입
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);

		int x = 10;
		int y = 4;

		// divide 메소드 호출시 x,y을 매개값으로 제공 -> 나눗셈 결과 받아 result2 변수에 대입
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);

		// 리턴값 없는 powerOff() 메소드 호출
		myCalc.powerOff();
	}

}
