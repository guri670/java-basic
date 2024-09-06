//package day7.composition;
//
//public class Composition {
//    public static void main(String[] args) {
//        Kildong dong = new Kildong();
//        Kilsoon soon = new Kilsoon();
//
//        //자바는 길동이, 파이썬은 길순이가
//        dong.java();
//        soon.java();
//    }
//}
//
//class Kildong {
//    public void java() {
//        System.out.println("자바 23버전 프로그래밍");
//    }
//
//}
//
//class Kilsoon {
//
//    Kildong kildong = new Kildong();
//    public void java(){
//        //길동이한테 연락.
//        kildong.java();
//    }
//    public void python() {
//        System.out.println("파이썬 프로그래밍");
//    }
//}