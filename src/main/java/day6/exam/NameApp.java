package day6.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NameAppClass> persons = new ArrayList<>();
//        NameAppClass[] persons = new NameAppClass[5];
        int index = 0;

        while(true){
            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print("나이를 입력하세요 :");
            int age = Integer.parseInt(sc.nextLine());

            NameAppClass p1 = new NameAppClass();
            p1.age = age;
            p1.name = name;
            persons.add(p1);

            // 객체 -> 리모콘(참조값)
            System.out.println(p1);

            // 객체 -> 변수(상태) + 메서드(동작)
            System.out.println(p1.age);
        }

    }
}
