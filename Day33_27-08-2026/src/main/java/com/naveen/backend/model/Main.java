package com.naveen.backend.model;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws Exception {

        String json = """
                {
                  "name": "Naveen",
                  "age": 31,
                  "address": {
                    "city": "Ballari",
                    "state": "Karnataka"
                  },
                  "skills": [
                    "Java",
                    "Spring Boot",
                    "MySQL"
                  ]
                }
                """;

        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(json, User.class);

        System.out.println(user.getName());
        System.out.println(user.getAddress().getCity());
        System.out.println(user.getSkills());
    }
}