package day9.textPost;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();

        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (command.equals("add")) {
                System.out.println("명령어 add : ");
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine(); // 이시점에서 배열 생성 2개니까 묶어서 저장
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = sc.nextLine();

                Post post = new Post(title, body); // 비어있는 객체 생성

//                post.setTitle(title);
//                post.setBody(body);

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");

            } else if (command.equals("list")) {
                System.out.println("명령어 : list");
                System.out.println("=================");
                for(int i = 0 ; i < posts.size(); i++){
                    System.out.printf("번호 : %d\n", i+1);
                    System.out.printf("제목 : %d\n", posts.get(i).getTitle());
//                    System.out.printf("내용 : %s\n", posts.get(i).getBody());
                    System.out.println("=================");

//                for (Post post : posts) { // 타입 post : 배열 (순서대로 꺼내서 담는다)
//                    System.out.printf("제목 : %d\n", post.getTitle());
//                    System.out.printf("내용 : %s\n", post.getBody());
//                    System.out.println("=================");

                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetIdx = Integer.parseInt(sc.nextLine());




            }

        }
    }
}
