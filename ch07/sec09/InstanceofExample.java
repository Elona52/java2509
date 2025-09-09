package ch07.sec09;

public class InstanceofExample {

	//메인 메소드애서 바로 호출하기 위해 정적 메소드 선언(정적 메소드 쓰지 않으면 객체 생성 다시 해주어야함)
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		//부모 클래스가참조하는 객체가 자식클래스 타입인지 확인 -> 맞다면 타입변환 ->자식 클래스 메소드 호출가능(studentNo, study() )
		if(person instanceof Student student) {
			System.out.println("studendtNo: " + student.studentNo);
			student.study();
		}
	}
	
		//부모 클래스의 객체를 매개값으로 제공하고 personInfo() 메소드 호출 
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
	
		//자식 클래스의 객체를 매개값으로 제공하고 personInfo() 메소드 호출 
		Person p2 = new Student("김길동", 10);
		personInfo(p2);

	}
}
