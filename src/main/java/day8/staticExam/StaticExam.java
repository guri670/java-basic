package day8.staticExam;

public class StaticExam {
    public static void main(String[] args) {

        Person p1 = new Person(20,"홍길동");
        Person p2 = new Person(30,"이순신");

        p1.introduce();
        p2.introduce();

        p1.age++;
        p1.introduce();

        // 클래스와 객체를 따로 만드는 이유. 같은 구조인데 서로 다른 정보를 갖게 하기위해서.
        // 복사본인 객체를 만들어서 서로 다른 정보를 저장해야 한다.

        p2.introduce(); // p1의 나이를 올렸기 때문에 p2의 나이는 변경되지 않는다.


        p1.printAveAge();
        p2.printAveAge();

        // 인류 펴균 나이 81로 정정
        p1.avgAge = 81;
        p1.printAveAge(); // static 붙이기 전 : p1의 인류평균나이는 81로 수정됨.
        p2.printAveAge(); // static 붙인 후 : 인류 평균나이는 80으로 수정되지 않음

        // 객체는 자신만의 개성을 표현하기 위해 존재. 간혹 모든 객체가 공유하는 정보가 있을 수 있다.
        // 객체간 공유 정보를 static으로 표현.

        // 메서드는 일반적으로 객체화 한 후에 사용 가능하지만, static을 붙이면 class에서 바로 사용 가능
        Person.printAveAge(); // new를 통해 생성하지 않아도 되므로 사용이 편리하다.

        // static은 꼭 필요한 경우에만 사용해야 하며, 메서드에서도 static변수를 사용할 떄나 객체가
        // 가지고 있는 변수를 사용하지 않는 경우에만 static을 붙여야 한다. -> static 남용x

    }
}
