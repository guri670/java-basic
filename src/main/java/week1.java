public class week1 {
    public static void main(String[] args) {

        Warrior warrior1 = new Warrior();

        String name = "홍길동";
        warrior1.name = name;
        warrior1.age = 20;
        warrior1.introduce();

        warrior1.weapon = new Sword();
        warrior1.attack();
        warrior1.skill();

        warrior1.weapon = new Bow();
        warrior1.attack();
        warrior1.skill();

    }
}

class Warrior {
    String name;
    int age;
    void introduce(){
        System.out.println("안녕하세요. 저는 "+age+ "살 "+name+"입니다." );
    }
    Weapon weapon;
//    Skill skill;
    void attack(){
        System.out.println(name + "이/가 " + weapon.weaponName + "로 " + weapon.weaponDamage + "의 데미지를 입힙니다.");
    }
    void skill(){
        System.out.println(name + "이/가 " + weapon.skillName + "스킬을 사용합니다." + weapon.skillDamage + "의 피해를 입힙니다.");

    }
}

class Weapon{
    String weaponName;
    int weaponDamage;
    String skillName;
    String skillDamage;
}

class Sword extends Weapon{
    Sword(){
        weaponName = "칼";
        weaponDamage = 15;
        skillName = "연속 베기";
        skillDamage = "2배(30)";
    }
}
class Bow extends Weapon{
    Bow(){
        weaponName = "활";
        weaponDamage = 10;
        skillName = "불화살";
        skillDamage = "1.5배(15)";
    }
}
