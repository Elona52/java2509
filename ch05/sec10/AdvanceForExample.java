package ch05.sec10;

public class AdvanceForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인덱스가 필요하지 않다면 해당값을 하나씩 가져와서 더하는 반복문을 만들어 코드 간소화가능 
		int[] scores = { 95, 71, 84, 93, 87 };

//배열항목 전체 합 구하기
		int sum = 0;
		
		//int변수에 기존 변수값을 하나씩 더해서 전체 합을 구함.
		for (int score : scores) {
			sum = sum + score;
		}

		System.out.println("점수 총합 = " + sum);

//배열 항목 전체 평균 구하기: 전체합/전체길
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
