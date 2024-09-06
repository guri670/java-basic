package day8.accessModifier;

//접근 제어자
public class AccessModifier {
    public static void main(String[] args) {
    // 자원(변수 + 메서드)에 접근할 수 있는 권한.

    // public : 모두 사용 가능
    // protected : 상속 관계 + 같은 폴더 안에있는 개체끼리 사용가능
    // default : 같은 폴더 안에 있는 객체끼리 사용 가능
    // private : 자신만 사용가능

        Calculator c1 = new Calculator();
        c1.divide();
        //c1.num1 =0; // 여기서 0을 넣은게 문제의 원인. 누구나 접근해서 바꿔버릴 수 있음.
                      // private를 이용해 Calculator의 데이터를 보호할 수 있다.
        c1.setNum1(0); // setNum1() 메서드는 public이라 접근 가능
        c1.setNum2(0); // 메서드 내에서 로직을 새로 짤 수 있다


        c1.divide();

        System.out.println(c1.getNum1());

        // 객체 변수는 객체 내 모든 메서드에 영향을 주므로 외부의 접근을 일반적으로 private로 막는다.
        // 변수에 접근이 필요하면 getter와 setter 메서드를 만들어서 사용한다.
    }


}

