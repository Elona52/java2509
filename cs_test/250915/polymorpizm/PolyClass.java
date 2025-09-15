package polymorpizm;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;

public class PolyClass {

    public PolyClass(){
        Animal[]  ani = {new Dog("바둑이",5,"진돗개"),
                new Cat("나비",3,false),
                new Dog("체리",2,"푸들"),
                new Cat("까망이",4,true),
        };
        System.out.println("--다형성 배열로 구성된 객체의 값 접근하기---");
        for (Animal a : ani) {
            System.out.println("**" + a.getname());
            a.makeSound();
        }

        System.out.println("--자식객체의 특성값 접근--");
        for (Animal a : ani) {
            if(a instanceof Dog){
                //임시변수: 타입적용 위해서
                Dog myDog = (Dog)a;
                myDog.wagTail();
            }else if(a instanceof Cat){
                Cat myCat = (Cat)a;
                myCat.climb();
            }
        }
    }
}
