package ch07.sec04;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		//부모 객체생성 
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();

		//자식 객체생성 - 오버라이딩한 메소드 실행 
		Computer computer = new Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}
		
}
