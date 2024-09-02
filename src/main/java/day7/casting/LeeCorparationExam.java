package day7.casting;

public class LeeCorparationExam {
    public static void main(String[] args) {
        // kildong이와 kilsoon이를 고용해서 leeCorp가 java와 python 수주가 가능하도록
        // class 수정 없이 자바 개발자를 교체 할 수 있도록 해보자.
        LeeCorp leeCorp = new LeeCorp();
        leeCorp.jdeveloper = new Jison();
        leeCorp.pdeveloper = new Jiwo();

        leeCorp.java(); // 자바 프로그래밍
        leeCorp.python(); // 파이썬 프로그래밍
    }
}
class LeeCorp {
    JavaDeveloper jdeveloper;
    PythonDeveloper pdeveloper;
    public void java() {
        jdeveloper.java();
    }
    public void python() {
        pdeveloper.python();
    }
}
class JavaDeveloper {
    public void java() {
        System.out.println("자바 프로그래밍");
    }
}
class PythonDeveloper {
    public void python() {
        System.out.println("파이썬 프로그래밍");
    }
}
class Kildong extends JavaDeveloper {
    public void java() {
        System.out.println("자바 25버전 프로그래밍");
    }
}

class Kilsoon extends PythonDeveloper {
    public void python() {
        System.out.println("파이썬 프로그래머");

    }
}

class Jison extends JavaDeveloper {
    public void java() {
        System.out.println("매우 대단한 자바 프로그래머");

    }
}

class Jiwo extends PythonDeveloper {
    public void python() {
        System.out.println("매우 대단한 파이썬 프로그래머");
    }
}