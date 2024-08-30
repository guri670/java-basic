//package day6.exam;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class NameTag {
//
//    Scanner sc = new Scanner(System.in);
//    ArrayList<NameTagClass> people = new ArrayList<>();
//        while (true) {
//        System.out.print("명령어 입력 :");
//        String st1 = sc.nextLine();
//        if (st1.equals("help")) {
//            System.out.println("add : 이름 입력");
//            System.out.println("age : 나이 입력");
//            System.out.println("list : 이름 목록");
//            System.out.println("exit : 종료");
//        } else if (st1.equals("add")) {
//            System.out.print("이름을 입력해주세요 : ");
//            String name = sc.nextLine();
//            System.out.println(people.get() + "이 명부에 저장되었습니다.");
//        } else if (st1.equals("age")) {
//            System.out.print("나이를 입력해 주세요 :");
//            int age = Integer.parseInt(sc.nextLine());
//        } else if (st1.equals("list")) {
//            System.out.println("===== 이름목록 =====");
//            for(int i = 0; i < people.size() ; i++){
//                NameTagClass p1 = people.get(i);
//                System.out.println(p1.name);
//                System.out.println(p1.age;
//
//            }
//            System.out.println(index+1 + "." + nameList[index] + " , " + ages[index]);
//            System.out.println("===================");
//        } else if (st1.equals("exit")) {
//            System.out.println("프로그램이 종료됩니다.");
//            break;
//        }
//    }
//}
