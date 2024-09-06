package day4.instanceVar;

public class InstanceVar {
    public static void main(String[] args) {

        // 매개변수마다 변수를 넣어줘야함.
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.intro();
        p1.walk();

        Person p2 = new Person();
        p2.name = "이순신";
        p2.intro();
        p2.walk();
    }
}
