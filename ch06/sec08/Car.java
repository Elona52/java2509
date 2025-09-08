package ch06.sec08;

public class Car {
	int gas; //초기값 0 

	//리턴값 없는 메서드로 매개값 gas를 받아서 
	void setGas(int gas) {
	//gas 필드값 변경
		this.gas = gas;
	}

	//리턴값이 boolean메서드로 gas필드값이 0이면 false, 0이 아니면 true
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	//리턴값없는 메서드 
	//true가 있기에 무한 재생
	void run() {
		while (true) {
			
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				//0보다 크지 않다면 = 0이되면 
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;  //메서드 종료 ( = break; : while만 빠져나오는 것)
			}
		}
	}
}
