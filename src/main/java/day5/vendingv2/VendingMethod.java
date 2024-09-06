package day5.vendingv2;

public class VendingMethod {

}

//    int remainder = 0;
//    String[] drink = {"콜라", "사이다", "커피"};
//    int[] quantities = {1 ,2 ,1};
//    int[] prices = {1000, 1200, 800};
//
//    public void inputMoney(int money) { //돈을 넣었을때 바로 나올 필요가 없으니 void
//        remainder += money ;
//    }
//
//    public int selectBeverage(int target) {
//        if(remainder < prices[target]) {
//            System.out.println("잔액부족");
//        }
//        if() {
//            System.out.println("수량 부족");
//        }
//        return;
//    }

//}

















//    int remainder = 0;
//    String[] drink = {"콜라", "사이다", "커피"};
//    int[] quantities = {1 , 2 ,1};
//    int[] prices = {1000, 1200, 800};
//
//    public void inputMoney(int money) {
//        remainder = remainder + money;
//    }
//
//    public String selectBeverage(int target) {
//        if (prices[target] > remainder) {
//            return "잔액 부족";
//        }
//        if(quantities[target] <= 0) {
//            return "수량 부족";
//        }
//        //remainder = remainder - prices[target];
//        remainder -= prices[target];
//        quantities[target] = quantities[target] -1;
//        //quantities[target] -= 1;
//        return drink[target] ;
//    }
//    public void printBeverages(){
//        System.out.println("== 음료수 목록 ==");
//        for(int i = 0 ; i < drink.length ; i++){
//            System.out.println(i +". " + drink[i] + " : " + prices[i] + "원, 남은 수량 : " +quantities[i]);
//        }
//    }
//    public int getRemainder(){
//        return remainder;
//    }
//
//}