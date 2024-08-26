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

//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("값을 입력해주세요 : ");
//            int num = sc.nextInt();
//            if (num == 0) { // num이 0 이면 if문 실행
//                break;
//            }
//            System.out.println("당신이 입력한 값은 : " + num);
//        }
//        System.out.println("프로그램이 종료되었습니다.");
//    }
//}

        // == 계산기 프로그램 v1 ==
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 1
        // 첫번째 숫자를 입력해주세요 : 22
        // 두번째 숫자를 입력해주세요 : 44
        // 결과 : 22 + 44 = 66
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 3(입력)
        // 첫번째 숫자를 입력해주세요 : 2(입력)
        // 두번째 숫자를 입력해주세요 : 4(입력)
        // 결과 : 2 * 4 = 8
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 6(입력)
        // 그런 기능은 존재하지 않습니다.
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 7(입력)
        // 그런 기능은 존재하지 않습니다.
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 5(입력)
        // 계산기 프로그램을 종료합니다.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("기능을 선택해주세요 (1. 더하기, 2. 뺴기, 3. 곱하기, 4. 나누기, 5. 종료) :");
            int i = sc.nextInt();
            if (i == 1) {
                System.out.print("첫번째 숫자를 입력해주세요 :");
                int num1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 :");
                int num2 = sc.nextInt();
                System.out.println("결과 :" + num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (i == 2) {
                System.out.print("첫번째 숫자를 입력해주세요 :");
                int num1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 :");
                int num2 = sc.nextInt();
                System.out.println("결과 :" + num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (i == 3) {
                System.out.print("첫번째 숫자를 입력해주세요 :");
                int num1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 :");
                int num2 = sc.nextInt();
                System.out.println("결과 :" + num1 + " * " + num2 + " = " + (num1 * num2));
            } else if (i == 4) {
                System.out.print("첫번째 숫자를 입력해주세요 :");
                int num1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 :");
                int num2 = sc.nextInt();
                System.out.println("결과 :" + num1 + " % " + num2 + " = " + (num1 / num2));
            } else if (i == 5) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("그런 기능은 존재하지 않습니다.");
            }
        }
    }
}
