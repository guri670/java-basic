package day9.require;

public class Comment {
    private String registcomment;
    private String TextWriteTime;

    public Comment(String registcomment, String getTextWriteTime) {
        this.registcomment = registcomment;
        this.TextWriteTime = getTextWriteTime;
    }

    public String getRegistcomment() {
        return registcomment;
    }

    public void setRegistcomment(String registcomment) {
        this.registcomment = registcomment;
    }

    public String getTextWriteTime() {
        return TextWriteTime;
    }

    public void setTextWriteTime(String textWriteTime) {
        TextWriteTime = textWriteTime;
    }
}

