package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------1번: 변수와 타입--------");
		String name="철수";
		int age;
		double height;
		boolean isStudent; ;
		char grade;
		
		age=20;
		height=170;
		grade='A';
		isStudent = true;
		
		System.out.println("name: " + name );
		System.out.println("age: " + age );
		System.out.println("isStudent: " + isStudent );
		System.out.println("height: " +  (int)height );
		System.out.println("grade: " + grade );
	
		System.out.println("--------2번: 연산자--------");
		
		int a = 10;
		int b = 3;
		System.out.println("산술연산자");
		System.out.println("a + b= " + a + b); 
	    System.out.println("a - b= " + (a - b)); 
	    System.out.println("a * b= " + a * b); 
	    System.out.println("a / b= " + a / b); 
	    System.out.println("a % b= " + a % b);
	    
	    System.out.println("비교연산자");
	    System.out.println("a < b= " + (a < b));
	    System.out.println("a = b= " + (a == b));
	    
	    System.out.println("논리연산자");
	    System.out.println("a < 3 , b > 10 = " + (a < 3 && b > 10));
	    System.out.println("a < 3 , b > 10 = " + (!(a < 3 && b > 10)));
	    
	    System.out.println("증감연산자");
	    System.out.println("a + 1= " + a++);
	    System.out.println("b + 1= " + ++b);
	    System.out.println("a - 1= " + a--);
	    System.out.println("b - 1= " + --b);
	    
	    System.out.println("--------3번: 반복문1--------");
	    System.out.println("학점 출력-if문");
	    int score = 85;
	    String grade2;
	    
	     if(score >=90) {
	    	 grade2 = "A";
	     }else {
	    	 grade2 = "B";
	     }
	    System.out.println(score + "점은 " + grade2 + "입니다");
	    
	    System.out.println("학점 출력-switch문");
	    
	    switch(score/10){
	    case 10 :
		case 9 : 
	    	grade2= "A";
	    break;
		case 8 :
	    	grade2= "B";
	    break;
	    }
	    System.out.println(score + "점은 " + grade2 + "입니다");
	    
	    System.out.println("합격 여부");
	    String result = (score >= 80)? "합격":"불합격";
	    System.out.println(score + "점은 " + result + "입니다.");
	    
	    System.out.println("--------4번: 반복문2(구구단)--------");
		for(int i=2; i<=9;i++) {
			System.out.println("*** " + i + "단 ***");
		for(int j=1; j<=9; j++) {
			System.out.println(i + "x" + j +" = " + (i*j));
		}
		}
	
	
	}
}

