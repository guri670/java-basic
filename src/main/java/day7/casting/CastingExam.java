package day7.casting;

public class CastingExam {
    public static void main(String[] args) {

        Weapon weapon = new Weapon(); // int(원시자료형) = 10;
        weapon = new Bow();
        weapon = new Spear();

        Weapon w1 = new Spear();
        w1.attack();
        Weapon w2 = new Bow();
        w2.attack();

    }
}

class Weapon { // Weapon이라는 부모 밑에 bow spear 두개의 자식 클래스 생성
    void attack() {
    }
}
class Spear extends Weapon{
    void attack(){
        System.out.println("창으로 공격합니다.");
    }
}
class Bow extends Weapon{ // 자식 클래스
    void attack(){
        System.out.println("활로 공격합니다.");
    }
}

