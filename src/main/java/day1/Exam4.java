package day1;

import javax.swing.*;

public class Exam4 {
    public static void main(String[] args) {
        //홀수와 짝수를 구별해주세요.
        // num이 짝수면 even, 홀수면 odd 출력해주세요.
        // 짝수 판별 : 2로 나누어서 떨어지면 짝수

        int num = 6;
        if (num % 2 > 0) { //남으면 false 없으면 true
            System.out.println("odd");
        }
        else if (num % 2 == 0) {
            System.out.println("even");
        }

        // 두수 num1과 num2가 주어집니다.
        // 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.

        int num1 = 10;
        int num2 = 15;

        if (num1 > num2) { // num1이 num2보다 클때 true , 작으면 false
            System.out.println(num1 - num2);
        } else {
            System.out.println(num2 - num1);
        }
        // 문제 : 할인 대상인지 아닌지 출력해주세요.
        // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
        // 조건 : 출력예시 처럼 출력되어야 합니다.
        // 조건 : `구현시작` 부분만 수정 할 수 있습니다..
        // 조건 : 2가지 이상의 방법으로 풀어야 합니다.

        int age = 11; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");
        // 구현시작
        if (age <= 19) { // 19세 이하 또는 60세 이상 if문 2개 19세 이하, 60세 이상 / else로 할인대상 x
            System.out.println("할인 대상입니다.");
        } else if (age >= 60) {
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }
        // 구현 끝
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.

        /*
        어떤 차의 높이가 170cm 입니다..

        이 차는 3개의 터널을 차례대로 지나게 될 것입니다.

        터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 납니다.

        차가 모든 터널을 무사히 잘 통과하면 PASS 를 출력하고, 충돌한다면 CRASH 를 출력하세요.
        */

        int tunnel1 = 180;
        int tunnel2 = 182;
        int tunnel3 = 172;

        int carHeight;
        carHeight = 170;

        if (carHeight >= tunnel1) {
            System.out.println("CRASH");
        }
        else if (carHeight >= tunnel2) {
            System.out.println("CRASH");
        }
        else if (carHeight >= tunnel3) {
            System.out.println("CRASH");
        }
        else{
            System.out.println("PASS");
        }
        //

    }
}




