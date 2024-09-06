package day3.methodexam;

public class CarMethod {
    public static void main(String[] args) {
// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.
        //v1. 1개의 자동차가 3번 달리게 해주세요.

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.name = "k3";
        c1.speed = 150;
        c2.name = "k5";
        c2.speed = 180;
        c3.name = "k7";
        c3.speed = 200;


        c1.racing();
        c2.racing();
        c3.racing();


    }
}
