package inheritance;

public class Animal {
    private String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    public void makeSound() {
        System.out.println("소리를 냅니다.");
    }

    public String getname() {
        return name;
    }

}
