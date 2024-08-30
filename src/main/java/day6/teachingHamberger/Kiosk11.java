//package day6.teachingHamberger;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Kiosk11 {
//    public static void main(String[] args) {
//
//        ArrayList<TeachHamClass> burgers = new ArrayList<>();
//        ArrayList<TeachHamClass> burgerCart = new ArrayList<>();
//
//        TeachHamClass b1 = new TeachHamClass("버거1",6000);
//        TeachHamClass b2 = new TeachHamClass("버거2",5000);
//        TeachHamClass b3 = new TeachHamClass("버거3",4000);
//        TeachHamClass b4 = new TeachHamClass("버거4",3000);
//        burgers b1 = new burgers;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("햄버거 키오스크");
//
//        while(true){
//            System.out.println("1. 햄버거 선택\n2. 사이드 선택\n3. 음료수 선택\n4. 메뉴 취소\n5. 주문 하기");
//            System.out.print("===== 주문 목록 =====");
//
//            System.out.print("버거: [");
//            for(int i = 0 ; i < burgerCart.size(); i ++){
//                System.out.println(burgerCart.get(i).name + " ");
//            }
//            System.out.println("]");
//
//            System.out.print("사이드 : []");
//            System.out.print("음료수 : []");
//            System.out.print("총금액 : " + ks.total);
//            System.out.print("무엇을 하시겠습니까 : ");
//
//            int menu = Integer.parseInt(sc.nextLine());
//
//            if(menu ==1){
//                System.out.println("=== 버거 목록 ===");
//                for(int i = 0 ; i < burgers.size; i++){
//                    System.out.printf("%d.%s %d\n", i+1, bugers.get(i).name,bugers.get(i).price);               }
//            }
//            System.out.println("어떤 버거를 고르시겠습니까 : ");
//            int selectNo = Integer.parseInt(sc.nextLine()); //번호로 버거 선택
//
//            TeachHamClass burger = burgers.get(selectNo -1); // 선택한 번호로 버거 가져오기
//            burgerCart.add(burger); // 카트에 선택한 버거 추가
//        }
//
//    }
//}
