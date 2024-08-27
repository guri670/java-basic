package day3;

import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

//        while (true) {
//            if (String e = "exit"){
//      commend.equals("exit") / 숫자는 i == 0 / 과 같다.
//               else if (st1.equals("help")) {
        Scanner sc = new Scanner(System.in);
        String[] nameList = new String[100]; // null값으로 채워진다.
        int[] ages = new int[100];
        int index = 0;
        while (true) {
            System.out.print("명령어 입력 :");
            String st1 = sc.nextLine();
            if (st1.equals("help")) {
                System.out.println("add : 이름 입력");
                System.out.println("age : 나이 입력");
                System.out.println("list : 이름 목록");
                System.out.println("exit : 종료");
            } else if (st1.equals("add")) {
                System.out.print("이름을 입력해주세요 : ");
                nameList[index] = sc.nextLine();
                System.out.println(nameList[index] + "이 명부에 저장되었습니다.");
                index++;
            } else if (st1.equals("age")) {
                System.out.print("나이를 입력해 주세요 :");
                ages[index] = Integer.parseInt(sc.nextLine());
            } else if (st1.equals("list")) {
                System.out.println("===== 이름목록 =====");
                for(int i = 0; i < index ; i++){
                    System.out.println(nameList[i]);
                }
                System.out.println(index+1 + "." + nameList[index] + " , " + ages[index]);
                System.out.println("===================");
            } else if (st1.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }
    }
}
//            for (int i = 0; i > arr1.length; i++) {
// 1. name이 저장된 부분을 반환하는것
// 2. if안에서의 반복문

// 다시 풀어봐야함