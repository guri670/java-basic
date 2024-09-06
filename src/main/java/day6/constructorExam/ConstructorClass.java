package day6.constructorExam;

import day6.constructor.Person;

public class ConstructorClass {
    int age;
    String name;

    public ConstructorClass(int ageParam, String nameParam){
        System.out.println("사람이 태어납니다.");
        age = ageParam;
        name = nameParam;
    }
    public void introduce(){
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
    }
}
