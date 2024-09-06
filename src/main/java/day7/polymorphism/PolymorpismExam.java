package day7.polymorphism;

public class  PolymorpismExam {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();

        String name = "홍길동";
        warrior1.name = name;
        warrior1.age = 20;
        warrior1.introduce();

        warrior1.weapon = new Bow();
        warrior1.attack();

        warrior1.weapon = new Sword();
        warrior1.attack();

    }
}

class Warrior {
    String name;
    int age;
    void introduce(){
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
    }
    Weapon weapon;
    void attack(){
        System.out.println(name + "이/가" + weapon.weaponName + "로 공격합니다.");
    }
}

class Weapon {
    String weaponName;
}
class Sword extends Weapon{
    Sword(){
        weaponName = "칼";
    }
}
class Bow extends Weapon{
    Bow(){
        weaponName = "활";
    }
}

