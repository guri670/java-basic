package day12.req;

import java.util.ArrayList;

public class PostView {

    public void printDetail (Post post){
        System.out.println("==================");
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getWriteDate());
        System.out.printf("조회수 : %d\n", post.getHit());
        System.out.println("==================");
    }

    public void printPostList (ArrayList<Post> targetList){
        System.out.println("==================");
        for(Post post : targetList){
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("==================");

        }

    }
}
