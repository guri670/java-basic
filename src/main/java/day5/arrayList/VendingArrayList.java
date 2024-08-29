package day5.arrayList;

import java.util.ArrayList;

public class VendingArrayList {

//    int[] arr = {1,2,3,4};
//    ArrayList<Integer> list = new ArrayList(){{
//        add(1);
//        add(2);
//        add(3);
//        add(4);
//    }}

    ArrayList<String> drink = new ArrayList<>() {{
        drink.add("콜라");
        drink.add("사이다");
        drink.add("커피");
    }};
    ArrayList<Integer> prices = new ArrayList<>() {{
        prices.add(1000);
        prices.add(1200);
        prices.add(800);
    }};
    ArrayList<Integer> quantities = new ArrayList<>() {{
        quantities.add(1);
        quantities.add(2);
        quantities.add(1);
    }};

    int remainder = 0;

    public void inputMoney(int money) { // 1
        remainder += money;
    }

    public String selectBeverage(int target) {
        if (prices.get(target) > remainder) {
            return "잔액 부족";
        }
        if (quantities.get(target) <= 0) {
            return "수량 부족";
        }
        remainder -= prices.get(target);
        quantities.set(target, quantities.get(target) -1);

        return drink.get(target);
    }

    public void printBeverages() { // 3
        System.out.println("== 음료수 목록 ==");
        for (int i = 0; i < drink.size(); i++) {
            System.out.println(i + ". " + drink.get(i) + " : " + prices.get(i) + "원, " + "남은수량 : " + quantities.get(i));
        }
    }

    public int getRemainder() { //4
        return remainder;
    }

}

