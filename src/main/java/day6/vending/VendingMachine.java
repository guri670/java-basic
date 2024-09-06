package day6.vending;

import java.util.ArrayList;

public class VendingMachine {

    ArrayList<Beverage> beverages = new ArrayList<>();

    public VendingMachine() {
        Beverage b1 = new Beverage("콜라", 1000, 1);
        Beverage b2 = new Beverage("사이다", 1200, 2);
        Beverage b3 = new Beverage("커피", 800, 1);
        beverages.add(b1);
        beverages.add(b2);
        beverages.add(b3);
    }
    int remainder = 0;

    public void inputMoney(int money) { // 1
        remainder += money;
    }

    public String selectdrink(int target) {
        Beverage beverage = beverages.get(target);
        if(beverage.price > remainder){
            return "잔액 부족";
        }
        if (beverage.quantity <= 0) {
            return "수량 부족";
        }
        remainder -= beverage.price;
        //quantities.set(target, quantities.get(target) - 1);
        beverage.quantity--;

        return beverage.name;
    }

    public void printBeverages() { // 3
        System.out.println("== 음료수 목록 ==");
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println(i + ". " + beverages.get(i).name + " : " + beverages.get(i).price + "원, " + "남은수량 : " + beverages.get(i).quantity);
        }
    }

    public int getRemainder() { //4
        return remainder;
    }

}

