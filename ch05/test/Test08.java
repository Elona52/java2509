package ch05.test;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // 2차원 배열 선언 및 초기화
        // 각 행별로 길이가 다른 가변 배열(jagged array) 형태임
		int[][] array = {  
				{ 95, 86 },      // 0행: 2개의 요소
				{ 83, 92, 96 }, // 1행: 3개의 요소
				{ 78, 83, 93, 87, 88 } // 2행: 5개의 요소
				};
		
		int sum = 0;        // 점수의 총합을 저장할 변수
		double avg = 0.0;   // 평균 점수를 저장할 변수
		int count = 0;      // 전체 점수 개수(요소의 수)를 저장할 변수
		
		
		// 2중 for문을 이용해 2차원 배열 모든 요소를 순회
		for (int i = 0; i < array.length; i++) {         // 행을 순회
			for (int j = 0; j < array[i].length; j++) {  // 각 행의 열(요소)를 순회
				sum += array[i][j];                      // 현재 요소 값을 sum에 누적
				count++;                                 // 요소 개수를 1 증가(현재까지 누적한 점수의 개수)
			}
		}
		
		// 평균 계산: 총합을 요소 개수로 나누어 double로 형변환하여 소수점까지 계산
		avg = (double) sum / count;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
