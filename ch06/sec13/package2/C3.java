package ch06.sec13.package2;

import ch06.sec13.package1.A3;

public class C3 {
	public C3() {

		// 클래스 사용. 생성자 호출.
		A3 a = new A3();

		a.field1 = 1;

		// default, private
//	 a.field2 = 1;
//	 a.field3 = 1;

		a.method1();
		// default, private
//	 a.method2();
//	 a.method3();
	}
}
