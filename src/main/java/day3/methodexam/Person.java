package day3.methodexam;

public class Person {
    String name;
    int age;

    public void greeting1(int lang) {
        if (lang == 1) {
            System.out.println("안녕하세요");
        } else if (lang == 2) {
            System.out.println("하이~");
        } else
            System.out.println("봉쥬");
    }

    public void greeting2(int lang, int loop) {
        for (int j = 0; j <= loop; j++) {
//            if (lang == 1) {
//                System.out.println("안녕하세요");
//            } else if (lang == 2) {
//                System.out.println("하이~");
//            } else {
//                System.out.println("봉쥬");
//            }
            greeting1(lang);
        }
    }
}
