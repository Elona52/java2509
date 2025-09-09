package ch07.sec11;

//봉인해제 되어 부모클래스로도 사용가능 
public non-sealed class Manager extends Person {

	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
