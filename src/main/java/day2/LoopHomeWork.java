package day2;

public class LoopHomeWork { // DoubleLoop
    public static void main(String[] args) {

//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                if (j % 2 == 0) {
//                    System.out.println(i + "X" + j + "=" + (i * j));
//                }
//            }
//            System.out.println();
//        }
//        for (int n = 4; n <= 20; n++) {
//            if (n % 2 == 1) {
//                for (int limit = 2; limit <= 10; limit++) {
//                    if (limit % 2 == 0) {
//                        System.out.println(n + "X" + limit + " = " + (n * limit));
//                    }
//                }
//                System.out.println();
//            }
//

        // 출력
//
//    높이 : [3]
//    *
//    **
//    ***
//
//
//        int row = 2;
//        for (int h = 0 ; h <= row ; h++) {
//            for (int w = 0 ; w <= h; w++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//    높이 : [5]
//    *
//    **
//    ***
//    ****
//    *****

//        int row = 4;
//        for (int h = 0 ; h <= row ; h++){
//            for (int w = 0 ; w <= h ; w++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//    높이 : [7]
//
//    *
//    **
//    ***
//    ****
//    *****
//    ******
//    *******


//        int row = 6;
//        for (int h = 0; h <= row; h++) {
//            for (int w = 0; w <= h; w++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // 출력

//    높이 : [3]

//      *
//     **
//    ***

    int rows = 3;
    for(int h = 1 ; h <= rows ; h++){ //공백출력
        for(int w = 1 ; w <= rows-h ; w++){
            System.out.print(" ");
        }
        for(int a = 1 ; a <= h ; a++){ // *출력
            System.out.print("*");
        }
        System.out.println();
    }
//    높이 : [5]
//
//        *
//       **
//      ***
//     ****
//    *****

//        int rows = 4;
//        for (int h = 0; h <= rows; h++) {
//            for (int w = 0; w <= rows - h; w++) {
//                System.out.print(" ");
//            }
//            for (int a = 0; a <= h; a++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//    높이 : [7]
//
//          *
//         **
//        ***
//       ****
//      *****
//     ******
//    *******
//        int rows = 6;
//        for (int h = 0; h <= rows; h++) {
//            for (int w = 0; w <= rows - h ; w++) {
//                System.out.print(" ");
//            }
//            for (int a = 0; a <= h; a++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        print_tri(3);
        // 출력
//         *
//         **
//         *
//        int rows = 2;
//        for(int h = 0 ; h<=rows ; h++){
//            for(int w = 1 ; w <=rows-h ; w++){
//                System.out.print("*");
//            }
//        }




//        print_tri(5);
        // 출력
        /*


         *
         **
         ***
         **
         *


         */

//        print_tri(6);
        // 출력
        /*


         *
         **
         ***
         ***
         **
         *


         */

    }
}