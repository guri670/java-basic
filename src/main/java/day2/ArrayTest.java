package day2;

public class ArrayTest {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.

//        int[] arr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr[i] = (i + 1) * 10;
//        }
//        for (int i = 0; i < 10; i++)
//            System.out.println(arr[i]);

//        int[] arr = new int[10];
//        for(int i= 0 ; i < 10 ; i++){
//            arr[i] = (i + 1) * 10;
//        }
//        for(int i = 0 ; i < 10 ; i ++){
//            System.out.println(arr[i]);
//        }
//        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for (int i = 0 ; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//      }
        // 배열을 두번 출력해주세요.
//        int[] arr = {1,2,3,4,5};
//
//        for(int j = 0; j < 2; j++) {
//            for(int i = 0; i < 5; i++) {
//                System.out.println(arr[i]);

// 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
//        int[] arr = {1, 2, 3, 4, 5};
//        for(int i = arr.length -1 ; i >= 0 ; i--){
//            System.out.println(arr[i]);


        int[] arr = {10, 20, 30, 40, 50};

		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/
        System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
    }
}