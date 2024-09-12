package day15.test;

public class Post {

    private int id;
    private String title;
    private String body;
    private String writeDateTime;
    private int viewCount;

    public Post(int id, String title, String body, String writeDateTime, int viewCount) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.writeDateTime = writeDateTime;
        this.viewCount = viewCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getWriteDateTime() {
        return writeDateTime;
    }

    public void setWriteDateTime(String writeDateTime) {
        this.writeDateTime = writeDateTime;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
