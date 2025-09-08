package ch06.sec08;

public class CalculatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체생
		Calculator2 myCalcu = new Calculator2();
		
		//외부객체 사용(도트: 객체가 가지고 있는 매개변수 선택하여 값 전달)
		//정사각형 넓이
		double result1 = myCalcu.areaRectangle(10);

		//직사각형 넓이
		double result2 = myCalcu.areaRectangle(10, 20);

		System.out.println("정사각형 넓이= " + result1);
		System.out.println("직사각형 넓이= " + result2);
	}

}
