package ch07.example.inheritance;

public class Circle extends Shape {

    public Circle(String string, double d, double e, double f) {

    };

    @Override
    public String getShapeType() {
        return ("나는 원이야");
    }
}
