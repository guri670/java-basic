package day5.arrayList;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {

        // 생성
        // 배열
        int[] arr = new int[10]; // 길이 5인 숫자 배열 생성

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>(); //비어있는 배열

        // =================================

        // 추가
        list.add(1);
        list.add(2);

        // =================================
        // 조회
        // 배열
//        System.out.println(arr[0]); // arr 배열의 0번방 조회
//        System.out.println(arr[1]); // arr 배열의 1번방 조회
//        System.out.println(arr[2]); // arr 배열의 2번방 조회
//
//        // ArrayList
//        System.out.println(list.get(0)); // list 배열의 0번방 조회
//        System.out.println(list.get(1)); // list 배열의 0번방 조회
//        System.out.println(list.get(2)); // list 배열의 0번방 조회 -> 2번방이 존재하지 않기 떄문에 에러가 난다.

        // =================================

        // 수정

        // 배열
        arr[0] = 10; // arr배열의 0번 방의 값 10으로 수정
        System.out.println(arr[0]);

        // ArrayList
        list.set(0, 10);
        System.out.println(list.get(0));

        //삭제

        // 배열 -> 삭제는 지원하지 않음.

        // ArrayList
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove(0); // 0번방의 값을 삭제.
        System.out.println(list.get(0));

        // 데이터 개수 확인
        // 배열 -> lenght를 제공하지만 데이터 개수랑은 무관, 따로 내가 변수에 직접보관의 필요

        // ArrayList
        System.out.println(list.size());
        list.add(2);
        list.add(3);
        System.out.println(list.size());
    }
}
