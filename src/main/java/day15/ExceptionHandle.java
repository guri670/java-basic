package day15;

import java.util.ArrayList;

public class ExceptionHandle {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("apple");
        arr.add("banana");
        arr.add("orange");

        try {
            System.out.println(arr.get(3)); //예외처리 시도 catch로 받아서 다으
        } catch (IndexOutOfBoundsException e) { //자바에선 오류도 하나의
            System.out.println("3번 인덱스는 없습니다.");
        }

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다.");
        }

        // >> 한군데에 모아서 할 수 있다.

        try {
            System.out.println(arr.get(3));
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("3번 인덱스는 없습니다.");
        }

        System.out.println("hihi");

    }
}
