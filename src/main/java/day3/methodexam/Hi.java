package day3.methodexam;

public class Hi {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.name = "홍길동";

        t1.hi();
        t1.bye();


        t1.print(4);
        t1.print(10);
        t1.print(100);

        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.lan1 = "안녕하세요";
        p1.lan2 = "하이~";
        p1.lan3 = "봉쥬";

        p1.introduce(3);
        for(int i = 0 ; i > 2 ; i++) {
            System.out.println(i);
        }

        p1.introduce(5);
        System.out.println();
        p1.introduce(10);

        p1.greetting(2);

        p1.greetting(3);

        p1.greetting(1);

        p1.greetting(1, 3);

        p1.greetting(2, 5);

        p1.greetting(3, 7);




    }
}
