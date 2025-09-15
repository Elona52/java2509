package interfaceC;

import inheritance.Animal;

public class Duck extends Animal implements Swimmable, Walkable{
    public Duck(String name, int age) {
        super(name, age);
    }

    public void swim(){
        System.out.println("Duck swimming");
    }

    @Override
    public void walk() {
        System.out.println("Duck walking");
    }
}
