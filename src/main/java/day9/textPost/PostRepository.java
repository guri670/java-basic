package day9.textPost;

import java.util.ArrayList;


// 창고 관리(Model)
public class PostRepository {
    private ArrayList<Post> posts = new ArrayList<>();

    // 누군가에게 Post를 넘겨받아서 창고(ArrayList)에 저장 해주는 기능
    public void save(Post post) {
        posts.add(post);
    }

    // 자신이 가지고 있는 창고(ArrayList)의 내용물을 다른 누군가에게 전달
    public ArrayList<Post> getPosts() {
        return posts;
    }

    // 창고에서 특정 물건을 제거함
    public void delete(Post post) {
        posts.remove(post);
    }

    //keyword가 포함된 Post만 선별해서 ArrayList로 담아 누군가에게 전달
    public ArrayList<Post> getPostsByKeyword(String Keyword) {
        ArrayList<Post> searchedPostList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(Keyword)) {
                searchedPostList.add(post);
            }
        }
        return searchedPostList;
    }

    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}

