package day9.require;

import java.util.ArrayList;

public class Text {

    private int textnumid;
    private String title;
    private String index;
    private String textWriteTime;

    public Text(int textnumid, String title, String index, String textWriteTime) {
        this.textnumid = textnumid;
        this.title = title;
        this.index = index;
        this.textWriteTime = textWriteTime;
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
}