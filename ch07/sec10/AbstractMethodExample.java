package ch07.sec10;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

//매개변수의 다형성 - 자동 타입변환 
		animalSound(new Dog());
		animalSound(new Cat());
	}

	//animal 상속 받았기 떄문에 animal 타입과 동일 -> 자식클래스에서 재정의한 메소드 값 호출 
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
