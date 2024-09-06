package day11.textBorad;

public class Post {
    int Id;
    String title;
    String body;

    public Post(int id, String title, String body) {
        this.Id = id;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
