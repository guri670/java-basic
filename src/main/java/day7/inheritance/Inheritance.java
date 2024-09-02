package day7.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        //상속
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.meow();
        c1.breathe();

        Person p1 = new Person();
        p1.breathe();
    }
}

