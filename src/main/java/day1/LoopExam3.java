package day1;

public class LoopExam3 {
    public static void main(String[] args) {

// 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/
        ;

        // 변수가 2개 i 와 dan
        // 출력값
        for (int i = 2; i <= 9; i++) { //for문에서 2단부터 9단까지 진행
            int dan = 1;
            while (dan <= 9) {
                dan++;
                if (dan % 2 == 0) { //if문을 통해 짝수번째만 곱하는 구구단을 반환
                    System.out.println(i + " * " + dan + "=" + i * dan);
                }
            }
        }

// 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        // 4단 ~ 20단 중 홀수단. 1~limit 까지 곱 중 짝수곱
    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190
     */
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for(int i = n; i <= m; i ++){
            if(i%2 != 0){
                for(int j = 1 ; j <= limit ; j++)
                    if(j%2 == 0){
                        System.out.println(i + "*" + j + "="+ (i*j));
                    }
            }
        }

    // 구구단은 2 ~ 9까지
//        while(n <= m) {
//            if (n % 2 != 0) {
//                n++;
//                continue;
//            }
//            int count = 1;
//
//                int limit = 1;
//                    while (limit <= 10){
//                     limit++;
//                     if(limit % 2 == 0){
//                         limit++;
//                    System.out.println(n+ "*" + limit + "=" + n * limit);
//                }
//            }
//        }

    }
}