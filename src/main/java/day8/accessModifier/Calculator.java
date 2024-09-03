package day8.accessModifier;

public class Calculator {
    private int num1 = 10;
    private int num2 = 2;

    // 메서드는 변수를 사용해서 작동하는게 대부분이다.
    // 객체의 변수에 잘못된 데이터가(정보) 들어오면 메서드가 고장난다.
    // 객체의 변수는 함부로 바꾸면 안된다.
    public void divide(){
        System.out.println(num1/num2);
    }
    // setter 보내주기 위한
    // 명령규칙 set변수명() -> 카멜표기법 적용(첫글자 대문자)
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        if(num2 == 0){
            System.out.println("0은 나눌 수 없습니다. 기본값인 1로 초기화 합니다.");
            num2 = 1;
        }
        this.num2 = num2;
    }
    // getter 가져오기 위한
    // 명명 규칙 -> get변수명() -> 카멜표기법 적용
    public int getNum1(){
        return num1;
    }
}
