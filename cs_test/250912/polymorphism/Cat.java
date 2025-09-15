package poly;

public class Cat extends Animal {

	boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.isIndoor = isIndoor;
	}

	public void climb() {
		System.out.println(name + " 점프점프");
	}

	public void eat() {
		super.eat();
		System.out.println(this.name + "가 츄루를 먹어요");
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("애완묘: " + (isIndoor ? "예" : "아니요"));
	}
	
	public void makeSound() {
		System.out.println(name + " 야옹");
	}
	
}
