package day11.textBorad;

public class Post {
    private int Id;
    private String title;
    private String body;
    private String CreateDate;

    public Post(int id, String title, String body, String createDate) {
        Id = id;
        this.title = title;
        this.body = body;
        CreateDate = createDate;
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

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }
}