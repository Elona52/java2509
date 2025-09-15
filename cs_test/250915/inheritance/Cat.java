package inheritance;

public class Cat extends Animal {

    boolean inDoor;

    public Cat(String name, int age, boolean inDoor) {
        super(name, age);
        this.inDoor = inDoor;
    }

    public Cat() {
        super();
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("야옹");
    }

    public void climb() {
        System.out.println("고양이가 점프");
    }

//    public Cat() {
//
//    }
}
