package day1;

import java.sql.SQLOutput;

public class Operator {
    public static void main(String[] args) {
        // 산술연산자 +, -, *, /, %

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);
        System.out.println(10 / 3); //정수 표현 3
        System.out.println(10.0 / 3.0); //실수 3.333333...

        System.out.println(10 % 3); //나머지를 구하는 함수

        //비교 연산자 -> 논리값으로 결과가 나옴
        // <, >, <=, >=, ==(같다), !=(같지않다)
        System.out.println(10 > 5); //True
        System.out.println(10 < 5); //False

        // 자료형(타입)
        // 숫자(정수) - int , 숫자(실수) - double , 문자 - String , 논리값(참/거짓) -boolean
        System.out.println(10 > 10); // f
        System.out.println(10 >= 10); // t
        System.out.println(10 == 10); // t
        System.out.println(10 != 10); //f
        System.out.println(!true); // f
        System.out.println(!false); //t
    }
}
