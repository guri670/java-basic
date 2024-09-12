package day15;

public class ExceptionHandle2 {
    public static void main(String[] args) {
        try {
            test(1);
        } catch (Exception e){

        }
    }

    public static void test(int flag) throws Exception {
        // 예외 직접 발생시키기 -> 테스트 용도 /
        // 어떤 상황에서는 프로그램 진행되는것 보다 강제로 종료시키고 바로 고치는게 나을 수 있다.
//        if (flag == 1) {
//            try {
//                throw new Exception(); // unhandle exception, checked exception => 무조건 try - catch 예외처리 강제한다.
//
//            } catch (Exception e) {
//
//            }
        if(flag == 1){
            throw new Exception();
        }else if(flag == 2){
            throw new RuntimeException(); // runtime exception, unchecked exception => try catch 예외처리 안해도 됨
        }
            System.out.println("hihi");
        }
    }
