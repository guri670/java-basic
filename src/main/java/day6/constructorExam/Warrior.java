package day6.constructorExam;

public class Warrior {
    String name;
    int attack;
    int defense;
    public Warrior(String nameParam, int attackParam, int defenseParam){
        System.out.println("전사가 태어납니다.");
        name = nameParam;
        attack = attackParam;
        defense = defenseParam;
    }
    public void status() {
        System.out.println("이름 : " + name + ", 공격력 : " + attack + ", 방어력 : "+defense);
    }

    public void attack(){
        System.out.println(name + "이 "+attack+ "의 데미지를 입힙니다.");
    }
    public void defense(){
        System.out.println(name+"이 "+defense+"데미지를 방어합니다.");
    }
}
