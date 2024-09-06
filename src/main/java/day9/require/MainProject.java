package day9.require;

import java.util.ArrayList;
import java.util.Scanner;

public class RequireProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Text> texts = new ArrayList<>();
        int textnumid = 1;

        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String index = sc.nextLine();

                Text text = new Text(textnumid, title, index); // 비어있는 객체 생성
//                post.setTitle(title);
//                post.setBody(body);
                texts.add(text);
                System.out.println("게시물이 등록되었습니다.");
                textnumid++;

            } else if (command.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < texts.size(); i++) {
                    System.out.printf("번호 : %d\n", texts.get(i).getTextnumid());
                    System.out.printf("제목 : %s\n", texts.get(i).getTitle());
//                    System.out.printf("내용 : %s \n" , texts.get(i).getIndex());
                    System.out.println("==================");
                    textnumid++;
                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int updatei = Integer.parseInt(sc.nextLine());
                if (updatei <= 0 || updatei > texts.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                } else {
                    System.out.print("제목 : ");
                    String newtitle = sc.nextLine();
                    System.out.print("내용 : ");
                    String newindex = sc.nextLine();

                    Text text = texts.get(updatei - 1);
                    text.setTitle(newtitle);
                    text.setIndex(newindex);

                    System.out.println(updatei + "번 게시물이 수정되었습니다.");
                }
            } else if (command.equals("delete")) {
                System.out.println("명령어 : delete");
                System.out.print("삭제할 게시물 번호 : ");
                int deletei = Integer.parseInt(sc.nextLine());
                if (deletei <= 0 || deletei >= texts.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                } else {
                    texts.remove(deletei - 1);
                    System.out.println(deletei + "번 게시물이 삭제되었습니다.");

                }
            } else if (command.equals("detail")) {
                System.out.println("명령어 : detail");
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int detaili = Integer.parseInt(sc.nextLine());
                if (detaili < 0 || detaili >= texts.size()) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                    continue;
                } else {
                    System.out.println("==================");
                    System.out.printf("번호 : %d\n", texts.get(detaili).getTextnumid());
                    System.out.printf("제목 : %s\n", texts.get(detaili).getTitle());
                    System.out.printf("내용 : %s\n", texts.get(detaili).getIndex());
                }
            }
        }
    }
}