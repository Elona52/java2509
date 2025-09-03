package ch04.sec03;

public class SwitchExpressionExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';

		switch (grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}

		//중괄호 안 실행문이 하나만 있을경우 중괄호 생략 가능
		switch (grade) {
		case 'A', 'a' -> System.out.println("우수회원입니다.");
		case 'B', 'b' -> System.out.println("일반회원입니다.");
		default -> System.out.println("손님입니다.");
		}

	}

}
