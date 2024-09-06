package day5.arrayList;

import java.util.ArrayList;

public class Bogi {
    public static void main(String[] args) {

        // 데이터 추가
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        int [] arr1 = new int[10];
        // 데이터 삭제
//        System.out.println(arr.remove(0));
//        System.out.println(arr.remove(1));

        // 조회
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));

        // 갯수 확인
        System.out.println(arr.size());

        // 데이터 수정
        arr.set(0, 10);
        System.out.println(arr.get(0));

        System.out.println(arr1.length);


    }

}
