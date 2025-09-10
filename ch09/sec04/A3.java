package ch09.sec04;

public class A3 {

	// 메소드
	public void method1(int arg) { // final int arg
		// 로컬변수 //final int var = 1
		int var = 1;

		// 로컬 클래스
		class B {
			// 메소드
			void method2() {
				// 로컬 변수 읽기
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);

				// 로컬 변수 수정불가(어디에서도 사용하지 않는다면 값을 수정할 수 있음) - final 클래스이기 때문
				// 값을 유지해야하기 때문
				// avg = 2; x
				// var = 2; x

			}
		}

		// 로컬 객체 생성
		B b = new B();
		// 로컬 객체 메소드 호출
		b.method2();
	
	}   //메소드 1 여기 까지 실행

	//-------------------------------------------
	public static void main(String[] args) {
		A3 a = new A3();
		a.method1(10);       //arg: 10, var: 1(로컬 메소드 지정값 바꿀 수 없음)
	} 

}
