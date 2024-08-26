package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        //while, for
        //구구단 2단 만들기
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + "x" + j + "=" + i * j);

        int a = 2;
        while (a <= 9) {
            int b = 2;
            while (b <= 9) {
                System.out.println(a + "x" + b + "=" + a * b);
                b++;
            }
            a++;
        }
    }
}

