package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User("Naveen", 22);

        String json = mapper.writeValueAsString(user);

        System.out.println(json);
    }
}