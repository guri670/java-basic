package day12.req;

import java.util.ArrayList;

public class PostRepository {

    private ArrayList<Post> posts = new ArrayList<>();

    public void save(Post post) {
        posts.add(post);
    }

    public void delete(Post post){
        posts.remove(post);
    }

    public ArrayList<Post> getPosts () {
        return posts;
    }

    public ArrayList<Post> getPostsByKeyword(String keyword) {
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