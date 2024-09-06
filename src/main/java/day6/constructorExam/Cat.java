package day6.constructorExam;

import day6.constructor.Person;

public class Cat {
    String name;
    int age;
    String kind;

    public Cat(String nameParam, int ageParam, String kindParam){
        System.out.println("고양이가 태어납니다.");
        name = nameParam;
        age = ageParam;
        kind = kindParam;
    }
    public void meow(){
        System.out.println(age + "살 " +kind+" 고양이 "+name+"가 야옹하고 웁니다.");
    }
}
