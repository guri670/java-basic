package day12.textBorad;

public class Text {
    int id;
    String title;
    String body;
    String createTime;
    int viewPont;

    public Text(int id, String title, String body, String createTime, int viewPont) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createTime = createTime;
        this.viewPont = viewPont;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getViewPont() {
        return viewPont;
    }

    public void setViewPont(int viewPont) {
        this.viewPont = viewPont;
    }
    public void increaseViewPoint(){
        viewPont++;
    }
}