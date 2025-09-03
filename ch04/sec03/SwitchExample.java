package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Math.random(): 0 이상 1 미만의 소수 -> 6을 곱하면 0 이상 6 미만 숫자가 됨.
		//(int)를 붙여서 소수 부분을 버리고 정수만 남김
		int num = (int) (Math.random() * 6) + 1;

		// num은 1에서 6까지 중에 무작위 정수 하나가 됨
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}
	}

}
