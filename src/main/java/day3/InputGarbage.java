package day3;

import java.util.Scanner;

public class InputGarbage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("이름을 입력해주세요 :");
//        String name = sc.nextLine();
//
//        System.out.print("나이를 입력해주세요 :");
//        int age = sc.nextInt();
//
//        System.out.println("안녕하세요 " + age + "세 " + name + "입니다." );

        //숫자를 입력받을 때 문자로 받고 숫자로 변환하기.

//        int num = Integer.parseInt("123");
//        System.out.println(num);

        System.out.print("나이를 입력해주세요 :");
        int age = Integer.parseInt( sc.nextLine()); // 출력할때 nextInt 쓰지말고 nextLine을 쓰자

        System.out.print("이름을 입력해주세요 :");
        String name = sc.nextLine();

        System.out.println("안녕하세요 " + age + "세 " + name + "입니다." );
    }
}
