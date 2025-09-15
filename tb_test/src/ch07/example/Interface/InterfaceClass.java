package ch07.example.Interface;

public class InterfaceClass {

    public InterfaceClass() {
        Bird bird = new Bird("참새", 1, 25.5);
        Duck duck = new Duck("도널드", 3);

        bird.fly();
        bird.walk();
        bird.swim();

        duck.fly();
        duck.swim();
        duck.dive();
        duck.walk();
    }

}