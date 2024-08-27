package day3;

public class Object {
    public static void main(String[] args) {

        // 폴더는 배열과 비슷하다.
        // 폴더 -> 숫자, 문자 가리지 않고 다 저장 가능한 개념 ==> 객체(object)


        // 사람을 표현하는 방법은 무한가지.
        // 자바는 변수 저장할떄 자료형을 요구
        // 객체는 먼저 어떻게 생겼는지 정의가 되어야 자바가 만들어줄 수 있다.

        // 설계도  class를 먼저 만든다.

        Person hong = new Person();
        Person lee = new Person();
        Person jang = new Person();

        hong.name = "Hong";
        lee.name = "Lee";
        jang.name = "Jang"; // 변수.name으로 접근가능.

        // 객체, 클래스
        hong.age = 20;
        hong.name = "홍길동";
        hong.home = "서울";


        lee.age = 30;
        lee.name = "이순신";
        lee.home = "대전";


         // person 설계도에 따라서 객체를 하나 만듦
        // 복사본에다가 홍길동 정보를 넣는다.

        System.out.println(hong.age + "살," + hong.home + " 사는 " + hong.name + " 입니다.");
    }
}
