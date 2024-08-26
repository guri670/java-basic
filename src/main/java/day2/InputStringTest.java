package day2;

import java.util.Scanner;

public class InputStringTest {
    public static void main(String[] args) {
        //Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45

//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫번째 숫자를 입력해주세요:");
//        int num1 = sc.nextInt();
////        System.out.println();
//        System.out.print("두번째 숫자를 입력해주세요:");
//        int num2 = sc.nextInt();
////        System.out.println();
//        System.out.println(num1 + " + " + num2 + " = " +(num1+num2));

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.
        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)
        // 4단 출력.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("원하는 단을 입력해주세요 :");
//        int dan = sc.nextInt();
//        System.out.println(dan + "단 출력.");
//
//        for (int j = 1; j < 10; j++) {
//            System.out.println(dan + " X " + j + " = " + (dan * j));
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 :");
        String str = sc.nextLine();
        System.out.print("나이를 입력해주세요 :");
        int i = sc.nextInt();
        System.out.println("출력 : 안녕하세요 " + i + "세 " + str + "입니다.");


        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.


        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

    }
}

