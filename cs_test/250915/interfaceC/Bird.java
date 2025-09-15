package interfaceC;

import inheritance.Animal;

public class Bird extends Animal implements Flyable, Walkable{
    private double wingspan;
    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public void fly(){
        System.out.println("Bird flying");
    }

    @Override
    public void walk() {
        System.out.println("Bird walking");
    }
}
