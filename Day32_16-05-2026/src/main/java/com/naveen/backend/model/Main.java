package com.naveen.backend.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/Mr-Naveen007"))
                .build();

        HttpResponse<String> response =
                client.send(request,
                        HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        ObjectMapper mapper = new ObjectMapper();

        GitHubUser user =
                mapper.readValue(json, GitHubUser.class);

        System.out.println(user.getLogin());
        System.out.println(user.getPublic_repos());

        String convertedJson =
                mapper.writeValueAsString(user);

        System.out.println(convertedJson);
    }
}