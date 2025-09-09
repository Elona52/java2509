package ch08.sec04;

public interface RemoteControl {
	//상수 필드 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//인터페이스: 추상메소드 선언(실행부 없음) 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
