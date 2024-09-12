package day11.textBorad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardController {

    private BoardRepository boardRepository = new BoardRepository();
    private BoardView boardView = new BoardView();
    private Scanner sc = new Scanner(System.in);
    private int lastestId = 4;

    public BoardController() {

        Post p1 = new Post(1, "안녕하세요 반갑습니다. java공부중이에요", "내용없음", getCreateDate(), 0);
        Post p2 = new Post(2, "java 질문좀 할게요~", "내용없음", getCreateDate(), 0);
        Post p3 = new Post(3, "정처기 따야되나요?", "내용없음", getCreateDate(), 0);

        boardRepository.save(p1);
        boardRepository.save(p2);
        boardRepository.save(p3);
    }


    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = boardRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }
        post.increaseHit();

        boardView.printPostDetail(post);

    }

    public void list() {
        ArrayList<Post> posts = boardRepository.getPosts();
        boardView.printPostList(posts);
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> searchedPostList = boardRepository.getPostBykeyword(keyword);
        boardView.printPostList(searchedPostList);
    }


    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = boardRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("없는 게시물 번호 입니다.");
            return;
        }
        boardRepository.delete(post);
        System.out.println("삭제가 완료되었습니다.");
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = boardRepository.findPostById(targetId);
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

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(lastestId, title, body, getCreateDate(), 0);

        boardRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastestId++;
    }

    public String getCreateDate() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}

