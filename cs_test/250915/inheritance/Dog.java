package inheritance;

public class Dog extends Animal {

    //선언부
    public String breeds = "골든리트리버";

    //구현부
    public Dog(String name, int age, String breeds) {
        super(name, age);
        this.breeds = breeds;
    }

    public Dog() {
        super();
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍");
    }

    public void wagTail() {
        System.out.println("개가 꼬리를 살랑");
    }


//    public Dog() {
//
//    }
}
