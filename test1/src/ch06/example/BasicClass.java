package ch06.example;

public class BasicClass {
    public static void main(String[] args) {
        Student str1 = new Student("김철수", 20, "20250715");
        Student str2 = new Student("이명희", "20250716");

        str1.setName("김갑수");

        System.out.println(str1.getName());

        String myName = str1.getName();
        System.out.println(myName);

        str1.introduce();
        str1.study();
        System.out.println(str1.toString());

        str2.introduce();
        str2.study();
        System.out.println(str2.toString());
    }
}