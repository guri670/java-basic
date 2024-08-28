package day4.vending;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int remainder = 0; //잔액
        String[] names = {"콜라", "사이다", "커피"};
        int[] prices = {1000, 1200, 800};

        while (true) {
            System.out.println("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) :");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                System.out.println("돈을 투입해주세요 : ");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("현재 투입된 금액은 " + money + "원 입니다.");
                remainder = remainder + money; // 잔액에 투입 금액 합산
            } else if (menu == 2) {

            } else if (menu == 3) {
                System.out.println("== 음료수 목록 ==");
                for(int j = 0 ; j < names.length ; j++){
                    System.out.println(j + "." + names[j] + " : " + prices[j] + "원");
                }
            } else if (menu == 4) {
                System.out.println("현재 잔액은 " +remainder+ "원 입니다.");
            } else if (menu == 5) {
                System.out.println("자판기 프로그램을 종료합니다. 남은 돈" +remainder+ "이 반환됩니다.");
                break;
            }
        }
    }
}

