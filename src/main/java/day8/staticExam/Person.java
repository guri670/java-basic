package day8.staticExam;

public class Person {
    static int age;
    static String name;
    static int avgAge; // 인류 평균 나이 : 80

    // 생성자는 객체를 만들때 사용하기 때문에 객체를 만들지 않아도 사용 가능한 static변수는
    // static 초기화를 따로 해준다.

    static{
        avgAge = 80;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.avgAge = 80;
    }

    public static void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n",age,name);
    }
    public static void printAveAge(){
        System.out.printf("인류 평균 나이는 %d살 입니다.\n",avgAge);
    }
}

