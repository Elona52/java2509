package ch09.sec06;

public class Button {

	// 정적 중첩 인터페이스
	public static interface ClickListenr {
		// 추상 메소드
		void onClick();
	}
}
