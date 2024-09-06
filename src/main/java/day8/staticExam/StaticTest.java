package day8.staticExam;

public class StaticTest {
    public static void main(String[] args) {
        StaticClass p1 = new StaticClass();
        p1.name = "홍길동";
        p1.age = 22;

        p1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.

        StaticClass p2 = new StaticClass();
        p2.name = "홍길순";
        p2.age = 25;

        p2.introduce();
        // 출력 : 저는 25살 홍길순 입니다.

        p1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}