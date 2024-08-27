package day2;


public class Practice {
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

//*/
        for(int i = 2 ; i < 10 ; i ++){
            for(int j = 1 ; j < 10 ; j++){
                if(j % 2 == 0) {
                    System.out.println(i + "X" + j + " = " + (i * j));
                }
            }
        }
    }
}
