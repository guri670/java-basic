package day1;

public class LoopExam {
    public static void main(String[] args) {

        // 문제 : 1부터 100까지 출력해주세요.
        // 출력
        // 1
        // 2
        // 3
        // 4
        // 5
        // ...
        // 100
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int count = 10;
        while (count <= 20) { // false 까지 반복 출력
            System.out.println(count);
            count++;
        }
        // 문제1. 1 ~ 100까지 수중 짝수만 출력
        //2
        //4
        //6
        //8
        //...
        //100

        for (int i = 0; i <= 100; i++) { // true 값만 출력 if(i% == 0) => true -> for문에 들어가서 출력
            if (i % 2 == 0) {
                System.out.println(i);
                // i 값을 2로 나누었을때 0이 되는 값 을 출력 -> 반복문에 들어가서 100까지 반복 값을 출력
            }
        }

        // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
        //1:odd
        //2:even
        //3:odd
        //4:even
        //100:even

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ": even");
            } else {
                System.out.println(i + ": odd");
            }



          /*
        축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,

        현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.

        손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

        만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

        (90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)

        현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.
        */

//         5분마다 골을 넣는다 반복문 time 5 => score 증가값이 1씩 증가
//         time ++ 할때마다 false 4번 true 1번
            int time = 74;
            int score = 0;
            // 74 79 84 89 / 값이 true
            for(time =74 ; time > 90 ; time ++) {
                if (time%5 == 4) { // ->true
                }
              //  score++;
               // System.out.println(socre);
            }
//
//        System.out.println();
            // 출력 : 4


        }
    }
}