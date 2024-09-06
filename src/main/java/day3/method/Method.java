package day3.method;

public class Method {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";

        // 변수 -> 정보를 저장
        // 메서드 -> 동작을 수행

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        p1.walk();
        p1.introduce(); // p1 이라는 객체가 실행함.
        p2.introduce();
    }
}
