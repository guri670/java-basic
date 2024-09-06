package day3.methodexam;

public class Hi {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.greeting1(1); //= "안녕하세요";
        p1.greeting1(2); //= "하이~";
        p1.greeting1(3); //= "봉쥬";

        System.out.println();

        p1.greeting2(1, 3);
        System.out.println();
        p1.greeting2(2, 5);
        System.out.println();
        p1.greeting2(3, 7);

    }
}
