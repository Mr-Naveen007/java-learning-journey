package com.naveen.backend;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        String json = "{\"name\":\"Naveen\",\"age\":22}";

        User user = mapper.readValue(json, User.class);

        System.out.println(user.getName()); // correct
    }
}