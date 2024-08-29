package day5.arrayList;

import java.util.ArrayList;

public class ArrayTest3 {
    public static void main(String[] args) {

        // ArrayList<> 에 들어갈때 int -> integer

        // ArrayList는 타입(자료형)을 객체만 다룬다.

        // 객체형 자료형(리모콘), 원시형 자로형(int, boolean, double) 두가지로 구분.

        // 원시형의 객체형 자료형을 제공.
        // int -> Integer
        // char -> Character
        // 원시형 타입명에서 앞글자만 대문자로 바꾸면 객체형
        // > ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Person> arr = new ArrayList<>(); // 객체 타입으로 상자를 만들 수 있다.

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        ArrayList<Person> People = new ArrayList<>();

        People.add(p1);
        People.add(p2);
        People.add(p3);
        People.add(p4);

        for(int i = 0 ; i < People.size(); i++){
            Person p = People.get(i);
            p.introduce();
        }

        People.remove(1);
        System.out.println("===================================");
        for(int i = 0 ; i < People.size() ; i++){
        }



        // 1. 네 사람을 ArrayList에 저장
        ArrayList<String>list = new ArrayList<>();
        list.add("p1");
        list.add("p2");
        list.add("p3");
        list.add("p4");
        // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
//        p1.introduce();
//        p2.introduce();
//        p3.introduce();
//        p4.introduce();
        // 3. 30대인 사람에게만 자기소개 시키기
        p1.introduce30();
        p2.introduce30();
        p3.introduce30();
        p4.introduce30();




    }
}
