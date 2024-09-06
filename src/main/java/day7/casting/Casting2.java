package day7.casting;

public class Casting2 {
    public static void main(String[] args) {
        // 형변환은 유사한 타입에서만 가능.

//        String str = "hihi";
//        int num = 10;

//        num = int(str); <= 불가능
        // 객체간의 형 변환

        Dog d1 = new Dog();
        d1.bark();

        Cat c1 = new Cat();
        c1.moew();

        // d1 = c1 ; // Dog변수에 Cat이 대입될 수 없다.


        // 객체간 자동 형변환
        Animal a1 = d1; // Animal 타입 변수에 Dog가 대입되었다 (x) Dog가 Animal로 모습을 바꿔서 대입되었다 (o)
        a1 = c1;

        //객체간의 형 변환은 상속 관계에서만 허용.

        c1 = (Cat)a1; // Animal을 Cat으로 강제 수동형변환. => 위험한 형변환

    }
}

class Animal{
    public void eat(){
        System.out.println("먹다");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public void moew(){
        System.out.println("야옹");
    }
}