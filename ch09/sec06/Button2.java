package ch09.sec06;

public class Button2 {

	//정적 인터페이스(버튼객체 없이도 사용가능)
	public static interface ClickListener{
		//추상메소드
		void onClick();}
	
	//필드(private는 외부에서 값 접근불가)
	private ClickListener clickListener;
	
	//setter 사용해서 값 정할 수 있도록 함
	//매개변수 타입의 인터페이스 -> 인터페이스로 사용 가능한 객체를 줄 수 있음(인터페이스를 구현한 객체) -> 필드에 값 반환
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener; 
	}
}
