package ch09.sec06;

public class Button3 {
	//정적 멤버 중첩 인터페이스
	public static interface ClickListener {
		//추상메소드
		void onClick();
	}

	//필드(중첩 인터페이스 타입)
	private ClickListener clickListener;

	//메소드(세터: 외부에서 값 받아서 필드에 저장)
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	//클릭 메소드는 사용자가 버튼을 클릭했을때 실행
	public void click() {
		this.clickListener.onClick();  //인터페이스 타입(on click이 실행되는 객체는 해당 클래스에 없음)
	}
}


//이벤트를 처리할 객체를 넣어주어야함 
//세터를 통해 객체 제공 - 객체가 인터페이스에 대입 - 인터페이스가 갖고 있는 on click 실행
//인터페이스를 구현해서 만들어야 대입가능(이벤트를 처리해주는 리스너 객체 - 처리 내용 작성해줌)
