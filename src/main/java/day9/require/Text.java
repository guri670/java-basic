package day9.require;

import java.util.ArrayList;

public class Text {

    private int textnumid;
    private String title;
    private String index;

    public Text(int textnumid, String title, String index) {
        this.textnumid = textnumid;
        this.title = title;
        this.index = index;
    }

    public int getTextnumid() {
        return textnumid;
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
}
