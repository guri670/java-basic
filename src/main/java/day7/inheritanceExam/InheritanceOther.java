package day7.inheritanceExam;

public class InheritanceOther {
    public void main(String[] args) {
        Duck d1 = new Duck();
        d1.fly();
        d1.swim();

        ChungD d2 = new ChungD();
        d2.fly();
        d2.swim();

        WhiteD d3 = new WhiteD();
        d3.fly();
        d3.swim();

        KomuD d4 = new KomuD();
        d4.fly();
        d4.swim();

        KomuD2 d5 = new KomuD2();
        d5.fly();
        d5.swim();

        AsuD d6 = new AsuD();
        d6.fly();
        d6.swim();
    }


    class Duck {
        public void fly() {
            System.out.println("오리가 날개로 날아갑니다.");
        }
        public void swim() {
            System.out.println("오리가 오리발로 헤엄칩니다.");
        }
    }

    class ChungD extends Duck{

    }

    class WhiteD extends Duck {

    }
    class KomuD extends Duck {
        public void fly(){
            System.out.println("저는 날 수 없어요 ㅜㅠ");
        }
        public void swim(){
            System.out.println("오리가 둥둥 떠다닙니다.");
        }
    }
    class KomuD2 extends KomuD{

    }
    class  AsuD extends Duck {
        public void swim(){
            System.out.println("오리가 둥둥 떠다닙니다.");
        }
    }

}
