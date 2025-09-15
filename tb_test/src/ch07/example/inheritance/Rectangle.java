package ch07.example.inheritance;

public class Rectangle extends Shape {

    public boolean getShapeType;

    public Rectangle(String string, double d, double e, double f, double v) {

    };

    @Override
    String getShapeType() {
        return "나는 사각형이야";
    }
}
