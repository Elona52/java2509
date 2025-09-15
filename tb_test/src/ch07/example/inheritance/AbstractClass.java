package ch07.example.inheritance;

public class AbstractClass {

    public AbstractClass() {

//도현만들기-color,x,y,r,(w,h)
            Circle circle = new Circle("red", 10.0, 10.0, 5.0);
            Rectangle rectangle = new Rectangle("blue", 30.0, 10.0, 8.0, 5.0);

            System.out.println(circle.getShapeType());
            System.out.println(rectangle.getShapeType());
        }
    }
