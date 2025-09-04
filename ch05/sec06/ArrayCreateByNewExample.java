package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//배열 변수 선언과 배열 생성 : 값 목록은 없고 배열만 만들었기에 값은 0만 나옴(정수)
		int[] arr1 = new int[3];

//배열 초기값 출력 - 0,1,2
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i] + ",");
		}
		System.out.println("\n");

		// 배열항목값 넣어주면 해당값으로 바뀜
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		// 배열항목의 변경값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i] + ",");
		}

		double[] arr2 = new double[3];
		// 배열 초기값
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();

		// 배열 항목 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;

		//배열 변수 선언과 배열 생성 : 값 목록은 없고 배열만 만들었기에 값은 0.0만 나옴(실수)
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");

		//배열 변수 선언과 배열 생성 : 값 목록은 없고 배열만 만들었기에 값은 null만 나옴(문자)
		String[] arr3 = new String[3];
		// 배열 초기값
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();

		// 배열 항목 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";

		// 배열 항목 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");

		}
	}

}
