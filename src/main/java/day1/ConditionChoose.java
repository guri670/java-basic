package day1;

public class ConditionChoose {
    public static void main(String[] args) {

        //택일구조 ex) 남여(양자택일), 학적(사자택일) 등..

        int age;
        age = 13;

        if (age <= 8) {
            System.out.println("초등학생 입니다.");
        } else if (age <= 16) {
            System.out.println("중학생 입니다.");
        } else if (age <= 19) {
            System.out.println("고등학생 입니다.");
        } else {
            System.out.println("성인 입니다.");
        }

        // 성적 출력
        int score;
        score = 100;

        // 점수가 90~ 100 : A, 80 ~ 89 : B, 70 ~ 79 : C, 60 ~ 69 : D, 60 미만 : F

        if (score >= 90) {
            System.out.println("성적은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("성적은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("성적은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("성적은 D 입니다.");
        } else {
            System.out.println("성적은 F 입니다.");
        }
    }
}
