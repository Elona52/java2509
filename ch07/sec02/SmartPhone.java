package ch07.sec02;


//부모클래스 상속(부모클래스를 기반해서 자식클래스 생성:확장)
public class SmartPhone extends Phone{
	//자식클래스에서 필드선언 
  public boolean wifi;
  
  //생성자 선언 
  public SmartPhone(String model, String color) {
	  //부모 클래스로부터 상속받은 필드 
	  this.model = model;
	  this.color = color;
  }
  
  //메소드 선언 
  public void setWifi(boolean wifi) {
	  System.out.println("와이파이 상태를 변경했습니다.");
  }
  
  public void internet() {
	  System.out.println("인터넷에 연결합니다.");
  }
}
