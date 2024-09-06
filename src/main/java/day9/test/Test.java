package day9.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
        Person p1 = new Person();

        setPerson(p1);

        p1.intro();

        Person p2 = getPerson();

        p2.intro();

//        ArrayList<String> setArr = new ArrayList<>();
//
//        System.out.println(setArr.get(0));
//    }
//
//    public static void setArr(ArrayList<String> param) { //set은 매개변수
//        param.add("apple");
//        param.add("banana");
//        param.add("orange");

    }

    public static Person getPerson() {
        Person p = new Person();
        p.age = 30;
        p.name = "이순신";

        return p;
    }

    public static void setPerson(Person a) {
        a.age = 20;
        a.name = "홍길동";
    }
}

class Person {
    int age;
    String name;

    public void intro() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }
}

