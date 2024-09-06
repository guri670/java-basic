package day7.composition;

public class LeeCorparation {
    public static void main(String[] args) {

        // kildong이와 kilsoon이를 고용해서 leeCorp가 java와 python 수주가 가능하도록
        LeeCorp leeCorp = new LeeCorp();
        leeCorp.dong = new Kildong();
        leeCorp.soon = new Kilsoon();

        leeCorp.java(); // 자바 프로그래밍
        leeCorp.python(); // 파이썬 프로그래밍

        //교체작업이 상당히 불편하다.
    }
}

class LeeCorp {
    Kilsoon soon = new Kilsoon();
    Kildong dong = new Kildong();
    public void java(){
        dong.java();
    }
    public void python(){
        soon.python();
    }
}

class Jinee{
    public void java(){
        System.out.println("아주 뛰어난 자바 프로그래밍");
    }
}

class Kildong {

    public void java (){
        System.out.println("자바 프로그래밍");
    }
}

class Kilsoon {

    public void python(){
        System.out.println("파이썬 프로그래밍");
    }
}