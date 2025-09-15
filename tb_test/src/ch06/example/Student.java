package ch06.example;

public class Student {

    private String name;
    public int age;  // private 권장
    public String studentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void introduce() {
        System.out.println(this.name + "를 소개합니다.");
    }

    void study() {
        System.out.println(this.studentId + "번이 공부합니다.");
    }

    @Override
    public String toString() {
        return "Student[name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }
}
