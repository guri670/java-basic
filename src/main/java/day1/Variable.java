package day1;

public class Variable {
    public static void main(String[] args) {
        //홍길동의 나이 20.
        //홍길동의 나이 21로 올라감
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);
        System.out.println(20);

        // 변수는 상자 , 상자에는 이름이 있어야하고 상자는 크기와 모양이 있어야 한다.
        // 숫자는 상자(변수)를 만들어야함. 숫자(int) 이름;
        int age;

        //  값을 변수에 담아야함.
        age = 20;

        // 문자 문자(String) 이름;
        String name;
        name = "홍길동";
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");
        System.out.println("안녕하세요 저는 " + age +"살 " + name + "입니다.");


        age = 21;
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");
        System.out.println(name + "의 나이가" + age + "살이 되었습니다.");


        name = "홍길동";

        String name1;
        name1 = "홍길만";
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");
        System.out.println(name + "이 " + name1 + "으로 개명을 했습니다.");

        // 변수 사용시 주의사항
        // 동일한 이름의 변수가 2개 이상 존재 할 수 없다. 그렇기 때문에 새로 변수를 선언하고 사용해야 함.
        // 변수명이 숫자나 특수기호로 시작할 수 없다.
        // 변수는 재활용이 가능하다.
        int a;
        a = 10;
        System.out.println(a); // 결과값 10
        a = 20;
        System.out.println(a); // 결과값 20


    }
}
