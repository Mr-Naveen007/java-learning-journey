package com.naveen.backend.model;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main1 {

    public static void main(String[] args) throws Exception {

        String json = """
                {
                   "companyName": "OpenAI",
                   "employees": [
                     {
                       "name": "Alice",
                       "age": 28
                     },
                     {
                       "name": "Bob",
                       "age": 35
                     }
                   ]
                 }
                """;

        ObjectMapper mapper = new ObjectMapper();

        Company company = mapper.readValue(json, Company.class);

        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.getName());
        }
    }
}