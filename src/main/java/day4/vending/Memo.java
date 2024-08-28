package day4.vending;

import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int remainder = 0;
        String [] drink = {"콜라", "사이다", "커피"};
        int [] prices = {1000, 1200, 800};

        while (true){
            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : ");
            int condition = Integer.parseInt(sc.nextLine());

            if( condition == 1) {
                System.out.print("돈을 투입해주세요 : ");
                int money = Integer.parseInt(sc.nextLine());
                total += money;
                System.out.println("현재 잔액은 "+ money + "원 입니다.");
            }else if (condition == 2){
                System.out.println("음료를 선택해주세요");
                int target = Integer.parseInt(sc.nextLine());
                if(prices[target] > total){
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
                System.out.println(drink[target]+"을 뽑으셨습니다.");
                total -= prices[target];
                System.out.println("잔액은 " +total+"원 입니다.");
            }else if (condition == 3){
                System.out.println("==음료수 목록==");
                for(int i = 0 ; i < drink.length ; i++){
                    System.out.println(i +". " + drink[i] + " : " + prices[i] + "원");
                }
            }else if (condition == 4) {
                System.out.println("현재 잔액은 " + total + "원 입니다.");
            }else {
                System.out.println("자판기 프로그램을 종료합니다. 남은 돈 "+remainder+"원이 반환됩니다.");
                break;
            }

        }
    }
}
