package day6.vending;

import day5.arrayList.VendingArrayList;

import java.util.Scanner;

public class VendingMachineApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VendingMachine va = new VendingMachine();

        while (true) {
            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : ");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                System.out.print("돈을 투입해주세요 : ");
                int money = Integer.parseInt(sc.nextLine());
                va.inputMoney(money);

                System.out.println("현재 투입된 금액은 " + money + "원입니다.");
            } else if (menu == 2) {

                System.out.print("음료수를 선택해주세요 : ");
                int target = Integer.parseInt(sc.nextLine());
                String drink = va.selectdrink(target);
                if (drink.equals("잔액 부족")) {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
                if (drink.equals("수량 부족")) {
                    System.out.println("수량이 부족합니다.");
                    continue;
                }

                System.out.println(drink + "을/를 뽑으셨습니다.");
                int remainder = va.getRemainder();
                System.out.println("잔액은 " + remainder + " 원입니다.");

            } else if (menu == 3) {
                va.printBeverages();
            } else if (menu == 4) {
                int remainder = va.getRemainder();
                System.out.println("현재 잔액은 " + remainder + "원 입니다.");
            } else if (menu == 5) {
                int remainder = va.getRemainder();
                System.out.println("자판기 프로그램을 종료합니다. 남은 돈 " + remainder + "원이 반환됩니다.");
                break;
            }
        }
    }
}

