package ch05.test;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // 최대값을 저장할 변수 max를 0으로 초기화
		int max = 0;
		
		// 정수 배열 array 선언 및 초기화
		int[] array = { 1, 5, 3, 8, 2 };
		
		 // 배열의 모든 요소를 순회하면서 최대값 찾기
		for (int i = 0; i < array.length; i++) {
			
			 // 현재 max보다 array[i]가 크면 max 갱신
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
	}
}