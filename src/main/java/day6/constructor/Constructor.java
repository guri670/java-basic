package day6.constructor;

public class Constructor {
    public static void main(String[] args) {

//        Person p1 = new Person();
//
//        p1.name = "홍길동";
//        p1.age = 20;
//
//        p1.introduce();

        // 객체를 만들고 나서 변수를 잘 세팅해야된다. 그렇지 않으면 객체는 제대로 동작하지 않는다.
        // 객체 변수 세팅은 필수.
        // 실수로 필수작업을 누락 할 수 있다.
        // 객체가 만들어 질 때 반드시 실행하는 코드를 세팅할 수 있다. -> 생성자 이용
        Person p2 = new Person("홍길동", 20); // 객체 변수 X
        p2.introduce();
        Person p3 = new Person("이순신",30 );
        p3.introduce();
        Person p4 = new Person("임꺽정",40 );
        p4.introduce();
    }
}
