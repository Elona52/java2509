package ch07.sec06_1;

import ch07.sec06.A;

public class D extends A {
	public D() {
		super();
	}

	public void method() {
		this.field = "value";
		this.method();
		
		/** 
		 * 직접 객체를 생성해서 사용하는 것은 안됨
		 * 
		 * public void method2(){
		 * A a = new A();
		 * a.field = "value";
		 * a.method();
		 * }
		 * */
	}
}
