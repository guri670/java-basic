package day12.textBorad;

import java.util.ArrayList;

public class RepositoryBoard {
    private ArrayList<Text> texts = new ArrayList<>();

    public void save(Text text){
        texts.add(text);
    }
}
