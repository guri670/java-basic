package day12.req;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {

    private Scanner sc = new Scanner(System.in);
    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private int lastestid = 4;

    public PostController() {
        Scanner sc = new Scanner(System.in);
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "내용 없음", writeDate(), 0);
        Post p2 = new Post(2, "java 질문좀 할게요", "내용 없음", writeDate(), 0);
        Post p3 = new Post(3, "정처기 따야되나요?", "내용없음", writeDate(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();
        Post post = new Post(lastestid, title, body, writeDate(), 0);
        postRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastestid++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.println("제목 : ");
        String newtitle = sc.nextLine();
        System.out.println("내용 : ");
        String newBody = sc.nextLine();

        post.setTitle(newtitle);
        post.setBody((newBody));
        System.out.println(targetId + "번 게시물이 수정되었습니다.");
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetid = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetid);
        if (post == null) {
            System.out.println("없는 게시물 번호 입니다.");
            return;
        }
        postRepository.delete(post);
        System.out.println("삭제가 완료되었습니다.");
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }
        post.increaseHit();
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();
        ArrayList<Post> searchedPostList = postRepository.getPostsByKeyword(keyword);
        postView.printPostList(searchedPostList);
    }

    public String writeDate() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}



