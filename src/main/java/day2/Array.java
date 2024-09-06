package day2;

public class Array {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //변수가 많아지면 변수를 관리하는 것도 힘들고 사용하는 것도 힘들다.
        //1. 변수명이 많아져서 힘들다. -> 변수명을 한개만 쓰면 됨.
        //2. 변수가 많아서 다 사용하기 힘듦. -> 반복문을 사용하면 됨.

        // 결론 : 배열을 사용하면 됨.

        int[] arr = {10, 20, 30, 40, 50}; //배열의 표현 방법
        System.out.println(arr[3]);

        System.out.println("====================================");
        System.out.println(arr[2]);
        arr[2] = 100; //배열의 특정 위치의 값을 새로운 값으로 대입 가능.
        System.out.println(arr[2]);
        System.out.println("====================================");

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        for(int i = 0 ; i <= 4 ; i++){
//            System.out.println(arr[i]);


//        int[] arr=  {10,20,30,40,50,60,70,80,90,100};
//        for(int j = 0 ; arr[]; j++){
//            System.out.println(arr[j]);
//        }
//        System.out.println(arr.length);//배열의 길이 정보 확인
//      확인  //내가 저장할 값이 몇개인지 모를 때. 개수를 알아도 구체적인 값을 모를 떄.
        //비어있는 배열을 만들어 놓고 나중에 값을 저장 할 수도 있어야함.

        //10개짜리 비어있는 배열 만들기
        int[] arr3 = {0,0,0,0,0,0,0,0,0,0};
        int[] arr4 = new int[10];
        System.out.println(arr3.length);//배열의 길이 정보 확인
        System.out.println(arr4.length);

        arr4[4] = 10;
    // 숫자 배열 => 숫자만 저장 가능, 다른 타입은 불가능 (boolean, double, String, ..)
        String[] arr6 = {"apple", "banana","orange"};
        boolean[] arr7 = {true, false, true, true};
        double[] arr8 = {3.14, 3.11, 5.22, 3.22};
    }

}
