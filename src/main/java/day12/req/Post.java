package day12.req;

public class Post {
    int id;
    String title;
    String body;
    String writeDate;
    int hit;

    public Post(int id, String title, String body, String writeDate, int hit) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.writeDate = writeDate;
        this.hit = hit;
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

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
    public void increaseHit(){
        this.hit++;
    }
}