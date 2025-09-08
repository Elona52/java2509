package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strArray = new String[3];
strArray[0] = "Java"; //10번
strArray[1] = "Java"; //10번
strArray[2] = new String("Java"); //새로운 객체를 만들었기 때문에 번지가 달라짐 


System.out.println(strArray[0] == strArray[1]); //같은 메모리 
System.out.println(strArray[0] == strArray[2]); //다른 메모리 

//strArray[0].equals(strArray[2]) : 0번째에 가지고 있는 객체가 2번째 가지고 있는 객체랑 같은가?
System.out.println(strArray[0].equals(strArray[2])); //문자내용이 같음 
	}

}
