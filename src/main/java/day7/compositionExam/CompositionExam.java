package day7.compositionExam;

public class CompositionExam {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.arm = new Arm(); // 원시타입이 아닌 객체타입이다. Arm타입

        System.out.println(p1.arm.length + "cm");
        // 출력 : 100cm
    }
}

class Person {
    int age;
    Arm arm;
}
class Arm {
    int length;

    public Arm(){
        length = 100;
    }
}
