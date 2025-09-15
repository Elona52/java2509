package ch07.example.Interface;

import ch07.example.Class.Animal;

public class Bird extends Animal implements Flyable, Walkable, Swimmable{

    public Bird(String name, int age, double d) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(" 하늘을 날아요 ");
    }
    @Override
    public void swim() {
        System.out.println(" 수영을 해요 ");
    }
    @Override
    public void dive() {
        System.out.println(" 잠수를 해요 ");
    }
    @Override
    public void walk() {
        System.out.println(" 걸어요 ");
    }
}
