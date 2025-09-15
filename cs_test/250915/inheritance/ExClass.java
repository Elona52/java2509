package inheritance;

public class ExClass {

    public ExClass() {

        Dog dog9 = new Dog();
        Cat cat9 = new Cat();
        Dog dog = new Dog("멍멍이",3,"골든리트리버");
        Cat cat = new Cat("고양이",2,true);

        System.out.println(dog.getname() + " " + dog.age + " " + dog.breeds);
        System.out.println(dog.breeds);
        System.out.println(cat.getname() + " " + cat.age + " " + cat.inDoor);

    dog.makeSound();
    cat.makeSound();

    }
}
