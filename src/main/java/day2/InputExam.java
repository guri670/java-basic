package day2;

import java.util.Scanner;

public class InputExam {
    public static void main(String[] args) {

        //반복문 강제 종료 : break
        //반복문 강제로 다음회차에 넘기기 : continue
//        for (int i = 1; i < 10; i++) {
//            if(i%2 == 0){
//                continue;
        //break; // if문과 함께 사용 강제종료
        //continue; // continue 를 만나면 해당 조건을 제외하고 다시시작
//            }
//            System.out.println(i);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("값을 입력해주세요 : ");
            int num = sc.nextInt();
            if (num == 0) { // num이 0 이면 if문 실행
                break;
            }
            System.out.println("당신이 입력한 값은 : " + num);
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}

