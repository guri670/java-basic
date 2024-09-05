package day9.require;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppRequireProject {
    ArrayList<Text> texts = new ArrayList<>();

    int textnumid = 4;

    public AppRequireProject() {
        Text t1 = new Text(1, "안녕하세요 반갑습니다. java 공부중이에요.", "내용없음", getTextWriteTime(),0);
        Text t2 = new Text(2, "java 질문좀 할게요 ~.", "내용없음", getTextWriteTime(),0);
        Text t3 = new Text(3, "정처기 따야되나요?", "내용없음", getTextWriteTime(),0);

        texts.add(t1);
        texts.add(t2);
        texts.add(t3);

    }

    public void run() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                addText(sc);
            } else if (command.equals("list")) {
                listText(sc);
            } else if (command.equals("update")) {
                updateText(sc);
            } else if (command.equals("delete")) {
                deleteText(sc);
            } else if (command.equals("detail")) {
                detailText(sc);
            } else if (command.equals("search")) {
                searchText(sc);
            }
        }
    }

    public void addText(Scanner sc) {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String index = sc.nextLine();


        Text text = new Text(textnumid, title, index, getTextWriteTime()); // 비어있는 객채 생성
        texts.add(text);
        System.out.println("게시물이 등록되었습니다.");
        textnumid++;
    }

    public void listText(Scanner sc) {
        System.out.println("명령어 : list");
        System.out.println("==================");
        for (int i = 0; i < texts.size(); i++) {
            System.out.printf("번호 : %d\n", texts.get(i).getTextnumid());
            System.out.printf("제목 : %s\n", texts.get(i).getTitle());
//                    System.out.printf("내용 : %s \n" , texts.get(i).getIndex());
            System.out.println("==================");
        }
    }

    public void updateText(Scanner sc) {
        System.out.println("명령어 : update");
        System.out.print("수정할 게시물 번호 : ");
        int updatei = Integer.parseInt(sc.nextLine());

        Text text = findTextbyId(updatei);
        if (text == null) {
            System.out.println("없는 게시물 번호 입니다.");
            return;
        }

        System.out.print("제목 : ");
        String newtitle = sc.nextLine();
        System.out.print("내용 : ");
        String newindex = sc.nextLine();

        text.setTitle(newtitle);
        text.setIndex(newindex);
        System.out.println(updatei + "번 게시물이 수정되었습니다.");
    }


    public void deleteText(Scanner sc) {
        System.out.println("명령어 : delete");
        System.out.print("삭제할 게시물 번호 : ");
        int deletei = Integer.parseInt(sc.nextLine());

        Text text = findTextbyId(deletei);
        if (text == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        texts.remove(text);
        System.out.println(deletei + "번 게시물이 삭제되었습니다.");

    }


    public void detailText(Scanner sc) {
        System.out.println("명령어 : detail");
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int detaili = Integer.parseInt(sc.nextLine());

        Text text = findTextbyId(detaili);
        if (text == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }
        text.increaseTextView();

        System.out.println("==================");
        System.out.printf("번호 : %d\n", text.getTextnumid());
        System.out.printf("제목 : %s\n", text.getTitle());
        System.out.printf("내용 : %s\n", text.getIndex());
        System.out.printf("등록날짜 : %s\n", text.getTextWriteTime());
        System.out.printf("조회수 : %d\n", text.getTextView());


    }

    public void searchText(Scanner sc) {
        System.out.println("명령어 : search");
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyWord = sc.nextLine();

        System.out.println("==================");

        for (Text text : texts) {
            if (text.getTitle().contains(keyWord)) {
                System.out.printf("번호 : %d\n", text.getTextnumid());
                System.out.printf("제목 : %s\n", text.getTitle());

                System.out.println("==================");

            }else{
                System.out.println("검색 결과가 없습니다.");
                System.out.println("==================");

            }
        }
    }

    public Text findTextbyId(int id) {
        for (Text text : texts) {
            if (text.getTextnumid() == id) {
                return text;
            }
        }
        return null;
    }

    public String contain (String keyWord) {
        return keyWord;
    }


    public String getTextWriteTime() {

        // 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 원하는 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // 포맷 적용하여 출력하기
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }
}


