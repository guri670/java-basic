//package day5.homework;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class NameApp {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<String> names = new ArrayList<>(); //
//        ArrayList<Integer> ages = new ArrayList<>();
//
//        int index = 0;
//
//        while (true) {
//            System.out.print("명령어 입력 :");
//            String st1 = sc.nextLine();
//
//            if (st1.equals("help")) {
//                System.out.println("add : 이름 입력");
//                System.out.println("age : 나이 입력");
//                System.out.println("list : 이름 목록");
//                System.out.println("exit : 종료");
//
//            } else if (st1.equals("add")) {
//                System.out.print("이름을 입력해주세요 : ");
//                String name = sc.nextLine();
//                names.add(name);
//                System.out.println(name + "이 명부에 저장되었습니다.");
//
//            } else if (st1.equals("age")) {
//                System.out.print("나이를 입력해 주세요 :");
//                ages.add(Integer.parseInt(sc.nextLine()));
//
//            } else if (st1.equals("list")) {
//                System.out.println("===== 이름목록 =====");
//                for (int i = 0; i < names.size(); i++) {
//                    System.out.println(names.get(i) + 1 + " , " + ages.get(i));
//                }
//                System.out.println("===================");
//            } else if (st1.equals("exit")) {
//                System.out.println("프로그램이 종료됩니다.");
//                break;
//            }
//        }
//    }
//}

