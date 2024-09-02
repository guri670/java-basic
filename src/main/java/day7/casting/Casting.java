package day7.casting;

public class Casting {
    public static void main(String[] args) {
        // 자바의 대전제
        // 자료형(타입)이 같은 것만 변수에 저장해준다.

        int number = 10; // 정수 변수
        double number2 = 10.1; // 실수 변수

//        num = num2; // double 타입이 int 타입에 대입될 수 없다.
        number2 = number;  // num 의 값을 num2 에 대입 / int 타입이 double타입에 대입되었다(x)
        // int 타입이 double타입으로 모습을 바꿔서 대입되었다.(형변환)
//        System.out.println(number2);

        //위험한 형변환은 자바에서 막는다 10.3 -> 10 // 0.3의 데이터 소실이 있음
        number = (int)number2; //개발자가 강제로 형변환을 할 수 있다.


        int num1 = 10;
        int num2 = 4;

        System.out.println((double)num1 / (double)num2); // 출력 : 2.5

    }
}
