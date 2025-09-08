package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	// 열거타입은 참조타입
	public static void main(String[] args) {
		Week today = null;

		// 열거값 대입
		today = Week.MONDAY;

		// 오늘이 월요일이면 첫번쨰, 아니면 두번째 값 반
		if (today == Week.MONDAY) {
			System.out.println("오늘은 불금이 아닙니다.");
		} else {
			System.out.println("오늘은 신나는 금요일 입니다.");
		}

		// 컴퓨터 요일 정보 얻기

//calendar 타입의 변수선언 - 캘런더 객체를 왼쪽에 대입 (get 메소드의 값에 따라 정보얻을 수 있음)
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		
//get 메소드를 통해 주에 몇일을 가져와라 실행 : 오늘 요일(1~7)
//int week = cal.get(Calendar.DAY_OF_WEEK);

		// 숫자를 열거 상수로 변환해서 변수에 대입 
		switch (day) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		//열거타입 변수사용 
		// 오늘이 일요일이면 첫번쨰, 아니면 두번째 값 반환 
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}

	}

}
