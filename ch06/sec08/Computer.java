package ch06.sec08;

public class Computer {
	//가변길이 매개변수 갖는 메소드 선언(매개값이 지정되지 않음)
	int sum(int... values) {
		int sum = 0;
		
		//values는 배열 타입의 변수처럼 사용(배열 개수를 모르기 때문에 배열 길이 만큼 반복하라는 코드 적용: values.length
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
