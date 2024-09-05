package day9.textPost;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    Scanner sc = new Scanner(System.in);
    int lastestId = 4;
    PostRepository postRepository = new PostRepository();

    // 값의 초기화는 대부분 생성자에서 해주는 것을 권장합니다. 다양한 로직 수행 가능합니다.
    public BoardApp() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "냉무", getCurrentDateTime(), 0);
        Post p2 = new Post(2, "java 질문좀 할게요~.", "냉무", getCurrentDateTime(), 0);
        Post p3 = new Post(3, "정처기 따야되나요?", "냉무", getCurrentDateTime(), 0);
        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    public void run() {
        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("update")) {
                update();
            } else if (command.equals("delete")) {
                delete();
            } else if (command.equals("detail")) {
                detail();
            } else if (command.equals("search")) {
                search();
            }
        }
    }

    private void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        printPostList(posts);
    }

    private void search() {
        System.out.print("검색 키워드 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> posts = postRepository.getPosts();
        ArrayList<Post> searchedPostList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }

        printPostList(searchedPostList);
    }

    private void detail() {
        System.out.print("상세보기 할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호 입니다.");
            return;
        }
        post.increaseHit();

        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("조회수 : %d\n", post.getHit());
    }

    private void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        postRepository.delete(post);
        System.out.println("삭제가 완료되었습니다.");

    }

    private void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.print("수정할 제목 : ");
        String newTitle = sc.nextLine();
        System.out.print("수정할 내용 : ");
        String newBody = sc.nextLine();

        post.setTitle(newTitle);
        post.setBody(newBody);
        System.out.println("수정이 완료되었습니다.");
    }

    private void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();
        Post post = new Post(lastestId, title, body, getCurrentDateTime(), 0);
        postRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastestId++;
    }

    public Post findPostById(int id) {
        ArrayList<Post> posts = postRepository.getPosts();
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }

        return null;
    }

    public String getCurrentDateTime() {

        // 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 원하는 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // 포맷 적용하여 출력하기
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;

    }

    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==================");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("작성자 : hong");
            System.out.println("==================");
        }
    }
}