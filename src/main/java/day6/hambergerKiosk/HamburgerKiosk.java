package day6.hambergerKiosk;

import day6.constructor.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class HamburgerKiosk {
    public static void main(String[] args) {
        // 햄버거 키오스크 만들기

        Scanner sc = new Scanner(System.in);
        KioskClass ks = new KioskClass();


        System.out.println("햄버거 키오스크 v1");
        while (true) {
            System.out.println("1. 햄버거 선택\n2. 사이드 선택\n3. 음료수 선택\n4. 메뉴 취소\n5. 주문 하기");
            System.out.println("===== 주문 목록 =====");
            System.out.print("버거: [");
            for (int i = 0; i < ks.burgerCart.size(); i++) {
                System.out.print(ks.burgerCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.print("사이드 : [");
            for (int j = 0; j < ks.sideCart.size(); j++) {
                System.out.print(ks.sideCart.get(j).name + " ");
            }
            System.out.println("]");
            System.out.print("음료수 : [");
            for (int k = 0; k < ks.dCart.size(); k++) {
                System.out.print(ks.dCart.get(k).name + " ");
            }
            System.out.println("]");
            System.out.println("총금액 : " + ks.total);
            System.out.print("무엇을 하시겠습니까 : ");

            int menu = Integer.parseInt(sc.nextLine());
            if (menu == 1) {
                System.out.println("=== 햄버거 목록 ===");
                for (int i = 0; i < ks.hamlist.size(); i++)
                    System.out.printf("%d. %s %d\n", i + 1, ks.hamlist.get(i).name, ks.hamlist.get(i).price);
                System.out.print("어떤 버거를 고르시겠습니까 : ");
                int selectBurger = Integer.parseInt(sc.nextLine());
                Hamburgers hamburgers = ks.hamlist.get(selectBurger - 1); //선택한 번호로 버거 가져오기
                System.out.println(ks.hamlist.get(selectBurger-1).name +"를 고르셨습니다.");
                ks.burgerCart.add(hamburgers);

            } else if (menu == 2) {
                System.out.println("=== 사이드 목록 ===");
                for (int j = 0; j < ks.sidelist.size(); j++) {
                    System.out.printf("%d. %s %d\n", j + 1, ks.sidelist.get(j).name, ks.sidelist.get(j).price);
                }
                System.out.print("어떤 사이드를 고르시겠습니까 : ");
                int selectSide = Integer.parseInt(sc.nextLine());
                SideMenu sideMenus = ks.sidelist.get(selectSide - 1);
                System.out.println(ks.hamlist.get(selectSide-1).name +"를 고르셨습니다.");
                ks.sideCart.add(sideMenus);

            } else if (menu == 3) {
                System.out.println("=== 음료수 목록 ===");
                for (int k = 0; k < ks.dlist.size(); k++) {
                    System.out.printf("%d. %s %d\n", k + 1, ks.dlist.get(k).name, ks.dlist.get(k).price);
                }
                System.out.print("어떤 음료수를 고르시겠습니까 : ");
                int selectDrink = Integer.parseInt(sc.nextLine());
                Drink drinks = ks.dlist.get(selectDrink - 1);
                System.out.println(ks.hamlist.get(selectDrink-1).name +"를 고르셨습니다.");
                ks.dCart.add(drinks);

            } else if (menu == 4) {
                System.out.println("어떤 메뉴를 취소하겠습니까?\n 1. 버거 \n 2. 사이드 \n 3. 음료수 \n 선택 : ");
                int selectCancel = Integer.parseInt(sc.nextLine());
                if (selectCancel == 1){
                    System.out.print("품목을 선택해주세요.");
                    for(int i =0 ; i < ks.burgerCart.size(); i++){
                        System.out.println(i+1+". " +ks.burgerCart.get(i).name);
                        int selectCancelBurger = Integer.parseInt(sc.nextLine());
                        Hamburgers hamburgers = ks.burgerCart.get(selectCancelBurger-1);
                        System.out.println(ks.burgerCart.get(selectCancelBurger-1));
                    }
                }
            } else if (menu == 5) {
                // 주문하기
            } else {
                break;
            }
        }
    }
}
