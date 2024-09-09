package day9.require;

public class Text { // Text ArrayList

    private int textnumid;
    private String title;
    private String index;
    private String textWriteTime;
    private int textView;

    public Text(int textnumid, String title, String index, String textWriteTime, int textView) {
        this.textnumid = textnumid;
        this.title = title;
        this.index = index;
        this.textWriteTime = textWriteTime;
        this.textView = textView;
    }

    public int getTextnumid() {
        return textnumid;
    }

    public void setTextnumid(int textnumid) {
        this.textnumid = textnumid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTextWriteTime() {
        return textWriteTime;
    }

    public void setTextWriteTime(String textWriteTime) {
        this.textWriteTime = textWriteTime;
    }

    public void increaseTextView() {
        this.textView++;
    }

    public int getTextView() {
        return textView;
    }

    public void setTextView(int textView) {
        this.textView = textView;
    }
}
