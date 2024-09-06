package day1;

public class Loop {
    public static void main(String[] args) {
//        int num;
//        num = 1;
//        System.out.println(num);
//        num ++;
//        System.out.println(num);

        int count;
        count = 0; //초기화

        while (count < 10) { // count가 0 일때 true
            System.out.println("안녕하세요");
            count++; // count 값이 1씩 증가
        }

        for(int count3 = 0 ; count3 <10 ; count3++) {
            System.out.println("반갑습니다.");
        }



        int count2 = 0; // 변수를 만듬과 동시에 값 저장
        while (count2 > 10){
            System.out.println("반갑습니다.");
        }

        // 반복문에서는 반복문, 증가값, 증가 횟수 가 있어야 반목문을 제어 할 수 있다.


        for(int i = 1 ; i <= 100 ; i ++) {
            System.out.println(i);
        }
    }
}
