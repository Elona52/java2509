package ch07.sec07;

public class ChildExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent2 parent = new Child2();
		
		Parent2.field1 = "data1";
		Parent2.method1();
		Parent2.method2();
		
		/*
		 * 불가능
		 * Parent.field1 = "data2";
		 * Parent.method3();
		 */
		
		Child child = (Child) parent;
		
		child.field2 = "data2";
		child.method3();
	}

}
