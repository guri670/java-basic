package day1;

public class Condition {
    public static void main(String[] args) {
        // 조건
        if (false) {
            System.out.println("안녕");
        }

        if (true) {
            System.out.println("바이");
        }

        int num;
        num = 5;

        if (num > 10) {
            System.out.println("num이 10보다 크다.");
        }

        int money;
        money = 10000;

        if (money >= 10000) {
            System.out.println("치킨을 먹어요");
        }
        if (money < 10000) {
            System.out.println("떡볶이를 먹어요");
        }

        int weather;// 1. 맑음, 2.흐림, 3. 비, 4. 눈
        weather = 2;
        if(weather == 1){
            System.out.println("날씨가 맑습니다. 나들이 나가세요");
        }
        if(weather == 2){
            System.out.println("날씨가 흐립니다. 집에 계세요");
        }
        if(weather == 3) {
            System.out.println("날씨가 비가 옵니다. 우산을 챙기세요.");
        }
        if(weather == 4) {
            System.out.println("날씨가 눈이 옵니다. 눈사람 만들어보세요.");
        }

        // 나이에 따른 학적표현 (초,중,고,성)
        // 13살 이하 초등학생, 16살 이하 중학생 19살 이하 고등학생 20살 이상 성인

        int age;
        age = 16;

        if (age <= 13) {
            System.out.println("초등학생 입니다.");
        }
        if (age <= 16) {
            if (age >13) {
            System.out.println("중학생 입니다.");
            }
        }
        if (age <= 19) {
            if (age > 16) {
            System.out.println("고등학생 입니다.");
            }
        }
        if (age >= 20) {
            System.out.println("성인 입니다.");
        }

        }
    }

