package day4.methodReturn;

public class Test {
    public int plus(int num1, int num2) {
        System.out.println((num1 + num2));
        return num1 + num2;
        //메서드가 리턴(돌아갈 때) 10이라는 값을 가지고 돌아감.
        //자신이 사용되던 지점에 아무것도 남기지 않는다.
    }

    public double pi(int num1, int num2, double pi) {
        System.out.println((num1 * num2 * pi));
        return num1 * num2 * pi;
    }

    public double pi2(int num3, int num4, double pi) {
        System.out.println((num3 * num4 * pi));
        return num3 * num4 * pi;
    } // 연습문항

    //실수와 정수를 계산하면 결과는 무조건 실수.
    public double circleArea(int radius){
        return radius * radius * 3.14;
    }
}
