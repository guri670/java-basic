package day15.file;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FileDeserialzable {
    public static void main(String[] args) throws Exception {

        String jsonString = "{\"id\":1,\"title\":\"aa\",\"body\":\"aaaaa\",\"writeDate\":\"20240912\",\"hit\":0}";

        ObjectMapper mapper = new ObjectMapper();
        Post post = mapper.readValue(jsonString, Post.class);

        System.out.println(post.id);
        System.out.println(post.title);
        System.out.println(post.body);
        System.out.println(post.writeDate);
        System.out.println(post.hit);

    }
}
