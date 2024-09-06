package day8.staticExam;

public class StaticClass {

    static int age;
    static String name;

    public static void introduce() {
        System.out.println("저는 " + age + "살 " + name + " 입니다.");
    }
}