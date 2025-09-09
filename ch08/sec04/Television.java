package ch08.sec04;

public class Television implements RemoteControl {
	//외부에서 볼륨값 바꿀 수 없도록 설정  
	private int volume;

	//추상메소드로 선언했기 때문에 값을 가지고 있는 메소드로 재정의 해주어야함.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	//볼륨값을 private설정했기에 세터를 통해 값을 검사하여 올바른 값을 저장해야함
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) { //max값보다 높은 값이 들어오면 
			this.volume = RemoteControl.MAX_VOLUME; //max 값으로 맞추기 
		} else if (volume > RemoteControl.MIN_VOLUME) { //min값보다 낮은 값이 들어오면 (음수) 
			this.volume = RemoteControl.MIN_VOLUME; //min 값으로 맞추기 
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨: " + this.volume);

	}
}
