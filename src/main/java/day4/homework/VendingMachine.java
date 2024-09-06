package day4.homework;

public class VendingMachine {

    //초기화 세팅 X

    //연습용으로 하나의 객체만 사용할땐 미리 넣어두는 것이 편함.
    int remainder = 0;
    String[] names = {"콜라", "사이다", "커피"};
    int[] prices = {1000, 1200, 800};

    public void inputMoney(int money) {
        remainder = remainder + money;

    }
    public String selectBeverage(int target) {
        if (prices[target] > remainder) {
            return "잔액부족"; //return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감(break?)
        }
        remainder = remainder - prices[target];
        return names[target];
    }
    public int getRemainder() {
        return remainder;
    }
    public void printBeverages() {
        System.out.println("== 음료수 목록 ==");
        for (int j = 0; j < names.length; j++) {
            System.out.println(j + "." + names[j] + " : " + prices[j] + "원");
        }
    }
}
