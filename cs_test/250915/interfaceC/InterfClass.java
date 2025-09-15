package interfaceC;

public class InterfClass {

    public InterfClass(){
        Bird bird = new Bird("참새",1,25.5);
        Duck duck = new Duck("도널드",3);

        bird.makeSound();
        bird.walk();
        bird.fly();
        System.out.println("----------");
        duck.makeSound();
        duck.walk();
        duck.swim();
        System.out.println("===========");

        Walkable[] walkAni = {bird, duck};
        for(Walkable w : walkAni){
            w.walk();
        }
        //다형성 인터페이스
        testWalk(bird);
        testWalk(duck);
        testSwim(duck);
    }

    private void testSwim(Swimmable swimmer) {
        swimmer.swim();
    }

    public static void testWalk(Walkable walker) {
        walker.walk();
    }
}
