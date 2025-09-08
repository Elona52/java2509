package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//값이 없을때:Run Configuration - argument에서 값을 지정하여 실행할 수 있음.
//java ch05.sec11.MainStringArrayArgument 10 20 : 배열길이2개(10, 20값이 들어있음)

		
		//배열길이가 2개가 아니라면 
		if (args.length != 2) {
		//해당내용을 입력하고 프로그램을 종료 
			System.out.println(" 프로그램 입력 값이 부족 ");

			System.exit(0);
		}
		System.out.println(" 정상 종료 ");
		
		//String 배열이기 때문에 String 변수지정 : 배열 값이 있다면 [0],[1] 인덱스안에 값을 지정하라 
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		//문자열을 정수로 변환 
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		//두 값을 더해서 결과도출 
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

}
