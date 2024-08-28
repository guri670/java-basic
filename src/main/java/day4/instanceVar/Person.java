package day4.instanceVar;

public class Person {

    // 두개 이상의 메서드가 공유해야하는 변수 -> 인스턴스 변수 (메서드를 사용하는 변수)
    // 인스턴스변수는 인스턴스가 제거될때 같이 사라진다.
    // 인스턴스는 리모컨을 잃어버리면 사라진다
    // 객체의 상태와 관련이 있으면 인스턴스 변수 사용. 하나의 메서드에서만 국한해서 사용하는 경우 매개변수 사용


    // 메서드 안에서 만들어지는 변수는 -> 지역변수
    // 지역변수는 메서드(함수가) 종료되면 사라진다.

    String name;

    public void intro() {
        System.out.println("안녕하세요 저는 " + name + "입니다.");
    }
    public void walk(){
        System.out.println(name+ "이 걷습니다.");
    }
}
