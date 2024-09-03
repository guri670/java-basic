package day8.accessModifier;

public class Exam2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.getId();
        // 구현시작
        // 구현끝
        System.out.println("제 번호는 "+p1.getId()+" 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

class Person1 {
    private int id = 20;

    public int getId() {
        return id;
// 힌트 : 여기에 메소드 2개 추가해야 합니다.
    }


}