package ch06.sec13.package2;

import ch06.sec13.package1.A2;

public class C2 {
	A2 a1 = new A2(true);
	
	//default는 같은 패키지안에서만 사용가능
//	A2 a2 = new A2(1);
	
	//private는 해당 클래스 안에서만 가용 가능
//	A2 a3 = new A2("문자열");
}
