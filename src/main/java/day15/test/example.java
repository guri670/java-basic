package day15.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class example {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = new Person("John", 30, false);
        try {
            // 객체를 JSON 문자열로 변환
            String jsonString = objectMapper.writeValueAsString(person);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


