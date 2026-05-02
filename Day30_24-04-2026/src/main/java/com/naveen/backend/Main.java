package com.naveen.backend;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static String fakeApi(String requestJson) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // 1. JSON → Object
        Product product = mapper.readValue(requestJson, Product.class);

        // 2. BUSINESS LOGIC (THIS IS WHERE YOUR 10% GOES)
        product.setPrice(product.getPrice() * 1.1);

        // 3. Object → JSON (response)
        return mapper.writeValueAsString(product);
    }

    public static void main(String[] args) throws Exception {

        String inputJson = "{\"name\":\"Santoor\",\"price\":30}";

        String response = fakeApi(inputJson);

        System.out.println(response);
    }
}