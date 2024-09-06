package day4.methodReturn;

public class Return {
    public static void main(String[] args) {

        // 메서드는 값을 표현할 수도 있고 아닐 수도 있다.
        // 메서드는 값을 리턴할 수 있는데 리턴 값이 필요한 이유는 메서드가 리턴한 값을 다양하게 2차 작업을 할 수 있기때문에
        // 클래스 ~ plus(int num1, int num2){
        Test t1 = new Test();
//        t1.plus(10,20); // 30

        //10, 20 더한 값에서 2로 나누고 싶다.



        //10, 20 더한 값에서 2를 곱하고 싶다.
        int num = t1.plus(10,20);
        System.out.println(num);
        System.out.println(num *2);

        // 문제 Test에 원의 넓이를 구하는 메서드 만들기
        // 원의 넓이 : 반지름 * 반지름 * 3.14

        // 내가 풀어본 문제
        Test t2 = new Test();
        double pi = t1.pi(5,5,3.14);
        System.out.println(pi / 3);

        double pi2 = t2.pi(10,10,3.14);
        System.out.println(pi * 2);

        // 반지름이 5인 원의 넓이
        double result = t1.circleArea(5);
        System.out.println(result);
        // 반지름이 10인 원의 넓이
        double result2 = t1.circleArea(10);
        System.out.println(result2);
        // 반지름이 5인 원의 넓이를 3으로 나눈 값
        System.out.println(result/3);
        System.out.println(t1.circleArea(5)/3);
        // 반지름이 10인 원의 넓이를 2로 곱한 값
        System.out.println(result2*2);
        System.out.println(t2.circleArea(10)*2);
        // t1.circleArea(5) 값 자체가 result 이기 때문에 출력문에서 t1.circleArea(5)으로 작성해도 된다.
    }
}
