package ch08.sec05;

	public interface RemoteControl {
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		void turnOn();
		void turnOff();
		void setVolume(int volume);
		int getVolume();

		//디폴트 인터페이스 메소드 - 객체가 있어야 구현가능(모든 객체의 기본 즉 모든 객체가 사용하는 것)
		default void setMute(boolean mute) {
			if(mute) {   //true
				System.out.println("무음 처리합니다.");
				//추상메소드 - 객체가 있어야 실행가능(실행부는 구현객체에 있음)
				setVolume(MIN_VOLUME);  
			}else {     //false 
				System.out.println("무음 해제합니다.");
			}
		}
	}
