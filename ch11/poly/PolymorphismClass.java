package poly;

public class PolymorphismClass {
//다형성 배열

	public PolymorphismClass() {
		Animal[] animals = { new Dog("바둑이", 5, "진돗개"), new Cat("나비", 3, false), new Dog("체리", 2, "푸들"),
				new Cat("까망이", 4, true) };
		System.out.println("---1.동물들의 소리----");

		animals[0].makeSound();
		animals[1].makeSound();
		animals[2].makeSound();
		animals[3].makeSound();

		System.out.println("..............");
		for (Animal animal : animals) {
			animal.makeSound();
		}

		System.out.println("---2.동물들의 행동----");
		for (Animal animal : animals) {
			if (animal instanceof Dog) {
				Dog dog = (Dog) animal;
				dog.wagTail();
			} else if (animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cat.climb();
			}
		}
		
		//다형성 메소드
		playWithAnimal(new Dog("루피", 1, "비글"));
		playWithAnimal(new Cat("츄츄", 2, true));
	}

	public static void playWithAnimal(Animal animal) {
		System.out.println("---3.나의 아가들과 놀아주기---");
		animal.eat();
		animal.makeSound();

		System.out.println("---4.아가들의 행동---");
		if (animal instanceof Dog) {
			((Dog) animal).wagTail();
		} else if (animal instanceof Cat) {
			((Cat) animal).climb();
		}
	}
}
