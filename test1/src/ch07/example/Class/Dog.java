package ch07.example.Class;

public class Dog extends Animal {

    String breeds;

    public Dog(String name, int age, String breeds) {
        super(name, age);
        this.breeds = breeds;
    }
        public void wagTail(){
            System.out.println("꼬리 흔들흔들");
        }

    public void eat(){
        super.eat();
        System.out.println(this.name + "가 뼈다귀를 먹어요");
    }
    }
