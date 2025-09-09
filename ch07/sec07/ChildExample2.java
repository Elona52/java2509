package ch07.sec07;

public class ChildExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성 및 자동 타입 전환 
		Parent2 parent = new Child2();

		//부모 타입으로 필드와 메소드 사용 
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		/*
		 * 불가능 Parent.field1 = "data2"; Parent.method3();
		 */

		//자식 타입으로 자동 타입 변환 
		Child2 child = (Child2) parent;

		//자식 타입으로 필드와 메소드 사용 
		child.field2 = "data2";
		child.method3();
	}

}
