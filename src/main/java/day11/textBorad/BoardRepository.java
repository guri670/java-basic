package day11.textBorad;

import java.util.ArrayList;

public class BoardRepository {
    private ArrayList<Post> posts = new ArrayList<>();

    // int i 같은 개념 Post를 넘겨받아 ArrayList에 저장시킴

    public void save(Post post) {
        posts.add(post);
    }

    // 창고에 물건을 다른 누군가에게 전달
    public ArrayList<Post> getPosts() {
        return posts;
    }
    // 물건 제거
    public void delete(Post post) {
        posts.remove(post);
    }
    // 키워드를 받아 제공
    public ArrayList<Post> getPostBykeyword(String keyword) {
        ArrayList<Post> searchedPostList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
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
