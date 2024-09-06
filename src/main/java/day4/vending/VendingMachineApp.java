package day4.vending;

import java.util.Scanner;

public class VendingMachineApp {
    public static void main(String[] args) {

//        int [] arr = {"콜라", "사이다", "커피"};
//        App a1 = new App();
//        a1.deposit(2000);

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int money = 0;
        int remainder = 0;
        String[] names = {"콜라", "사이다", "커피"};
        int[] prices = {1000, 1200, 800};

        while (true) {
            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : ");
            int i = Integer.parseInt(sc.nextLine());
            if (i == 1) {
                System.out.print("돈을 투입해주세요: ");
                money = sc.nextInt();
                total += money;
                System.out.println("현재 투입된 금액은 " + money + "원 입니다.");
            } else if (i == 2) { // 음료수 선택, 선택한 음료수 출력, 잔액 출력
                System.out.print("음료수를 선택해주세요 : ");
                int target = Integer.parseInt(sc.nextLine());
                if(prices[target] > total) {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
                System.out.println(names[target] + "를 뽑으셨습니다.");
                remainder = remainder - prices[target]; // 잔액 = 잔액 - 음료수가격
                System.out.println("잔액은 " + remainder + "입니다.");
            } else if (i == 3) {
                System.out.println("== 음료수 목록 ==");
                for (int j = 0; j < names.length; j++) {
                    System.out.println(j + ". " + names[j] + " : " + prices[j] + "원");
                }
            } else if (i == 4) {
                System.out.println("현재 잔액은" + total + "원 입니다.");
            } else {
                System.out.println("자판기 프로그램을 종료합니다. 남은 돈 " + total + "원이 반환됩니다.");
                break;
            }
        }
    }
}


