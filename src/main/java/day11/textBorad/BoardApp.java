package day11.textBorad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    ArrayList<Post> posts = new ArrayList<>();

    public void run() {
        Scanner sc = new Scanner(System.in);
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java공부중이에요", "내용없음", getCreateDate(), 0);
        Post p2 = new Post(2, "java 질문좀 할게요~", "내용없음", getCreateDate(), 0);
        Post p3 = new Post(3, "정처기 따야되나요?", "내용없음", getCreateDate(), 0);

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);

        int lastestId = 4;

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
                String body = sc.nextLine();

                Post post = new Post(lastestId, title, body, getCreateDate(), 0);

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;

            } else if (command.equals("list")) {
                System.out.println("==================");
//                for(int i = 0; i < posts.size(); i++) {
//                    System.out.printf("번호 : %d\n", posts.get(i).getId());
//                    System.out.printf("제목 : %s\n", posts.get(i).getTitle());
                for (Post post : posts) {
                    System.out.printf("번호 : %d\n", post.getId());
                    System.out.printf("제목 : %s\n", post.getTitle());
                    System.out.println("==================");

                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

//                if(targetIdx < 1 || targetIdx > posts.size()){
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.print("수정할 제목 : ");
                        String newTitle = sc.nextLine();
                        System.out.print("수정할 내용 : ");
                        String newBody = sc.nextLine();

                        post.setTitle(newTitle);
                        post.setBody(newBody);
                        System.out.println("수정이 완료되었습니다.");
                        break;
                    }
                }

            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                Post post = findPostById(targetId);
                if (post == null) {
                    System.out.println("없는 게시물 번호 입니다.");
                    continue;
                }
                posts.remove(post);
                System.out.println("삭제가 완료되었습니다.");

            } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                Post post = findPostById(targetId);
                if (post == null) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                    continue;
                }
                post.increaseHit();

                System.out.println("===================");
                System.out.printf("번호 : %d\n", targetId);
                System.out.printf("제목 : %s\n", post.getTitle());
                System.out.printf("내용 : %s\n", post.getBody());
                System.out.printf("등록날짜 : %s\n", post.getCreateDate());
                System.out.printf("조회수 : %s\n", post.getHit());
                System.out.println("===================");

            } else if (command.equals("search")) {
                System.out.print("검색 키워드를 입력해주세요 : ");
                String keyword = sc.nextLine();

                ArrayList<Post> searchedPostList = new ArrayList<>();
                for(Post post : posts){
                    if(post.getTitle().contains(keyword)){
                        searchedPostList.add(post);
                    }
                }
                printPostList(searchedPostList);
            }

        }
    }

    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }

        return null;
    }

    private String getCreateDate() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
    public void printPostList(ArrayList<Post> targetList){
        System.out.println("===================");
        for(Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("작성자 : hong");
            System.out.println("===================");
        }
    }
}






