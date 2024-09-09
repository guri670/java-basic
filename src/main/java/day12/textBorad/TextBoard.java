package day12.textBorad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextBoard {
        RepositoryBoard repositoryBoard = new RepositoryBoard();

    public TextBoard {
        Scanner sc = new Scanner(System.in);

        Text t1 = new Text(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "내용 없음", getCreatTime(), 0);
        Text t2 = new Text(2, "자바 질문좀 할게요~", "내용 없음", getCreatTime(), 0);
        Text t3 = new Text(3, "정처기 따야되나요?", "내용없음", getCreatTime(), 0);

        texts.add(t1);
        texts.add(t2);
        texts.add(t3);


        public void start () {
            while (true) {
                System.out.print("명령어 : ");
                String command = sc.nextLine();
                if (command.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");

                } else if (command.equals("add")) {
                    repositoryBoard.add();
                } else if (command.equals("list")) {
                    repositoryBoard.list();
                    System.out.println("==================");
                    for (Text text : texts) {
                        System.out.printf("번호 : %d\n", text.getId());
                        System.out.printf("제목 : %s\n", text.getTitle());
                        System.out.println("==================");

                    }
                } else if (command.equals("update")) {
                    System.out.print("수정할 게시물 번호 : ");
                    int targetid = Integer.parseInt(sc.nextLine());
                    if (targetid < 1 || targetid > texts.size()) {
                        System.out.println("없는 게시물 번호 입니다.");
                        continue;
                    }
                    for (Text text : texts) {
                        if (text.getId() == targetid) {
                            System.out.print("제목 : ");
                            String newTitle = sc.nextLine();
                            System.out.print("내용 : ");
                            String newBody = sc.nextLine();

                            text.setTitle(newTitle);
                            text.setBody(newBody);
                            System.out.println("수정이 완료되었습니다.");
                            break;
                        }
                    }
                } else if (command.equals("delete")) {
                    System.out.print("삭제할 게시물 번호 : ");
                    int targetId = Integer.parseInt(sc.nextLine());
                    Text text = findTextById(targetId);
                    if (text == null) {
                        System.out.println("없는 게시물 번호 입니다.");
                        continue;
                    }
                    texts.remove(text);
                    System.out.println("삭제가 완료되었습니다.");

                } else if (command.equals("detail")) {
                    System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                    int targetId = Integer.parseInt(sc.nextLine());
                    Text text = findTextById(targetId);
                    if (text == null) {
                        System.out.println("존재하지 않는 게시물 번호 입니다.");
                        continue;
                    }
                    System.out.println("==================");
                    System.out.printf("번호 : %d\n", text.getId());
                    System.out.printf("제목 : %s\n", text.getTitle());
                    System.out.printf("내용 : %s\n", text.getBody());
                    System.out.printf("등록날짜 : %s\n", text.getCreateTime());
                    System.out.printf("조회수 : %d\n", text.getViewPont());
                    System.out.println("==================");

                } else if (command.equals("search")) {
                    System.out.print("검색 키워드를 입력해주세요 : ");
                    String keyword = sc.nextLine();
                    ArrayList<Text> searchedTextList = new ArrayList<>();
                    for (Text text : texts) {
                        if (text.getTitle().contains(keyword)) {
                            searchedTextList.add(text);
                        }
                    }
                    printTextList(searchedTextList);
                }
            }
        }

        public Text findTextById ( int id){
            for (Text text : texts) {
                if (text.getId() == id) {
                    return text;
                }
            }
            return null;
        }

        public void printTextList (ArrayList < Text > targetList) {
            System.out.println("===================");
            for (Text text : targetList) {
                System.out.printf("번호 : %d\n", text.getId());
                System.out.printf("제목 : %s\n", text.getTitle());
                System.out.println("===================");

            }

        }
    }

    private String getCreatTime() {
        LocalDateTime curry = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = curry.format(formatter);
        return formattedDateTime;
    }
}

