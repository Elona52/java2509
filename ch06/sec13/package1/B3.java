package ch06.sec13.package1;

public class B3 {
public void method() {
	
	//A클래스와 생성자에 public이기에 가능
	 A3 a = new A3();
		 a.field1 = 1;
		 a.field2 = 1;
		 //private이기에 해당 클래스에서만 가능
//		 a.field3 = 1;
		 
		 //녹색-public, 파란색-default
		 a.method1();
		 a.method2();
		 
		//private이기에 해당 클래스에서만 가능
//		 a.method3();
	 }
	
}
