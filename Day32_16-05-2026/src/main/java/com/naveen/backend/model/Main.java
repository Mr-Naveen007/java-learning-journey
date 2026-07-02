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

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        ObjectMapper mapper = new ObjectMapper();

        GitHubUser user = mapper.readValue(
                response.body(),
                GitHubUser.class
        );

        System.out.println("<- GitHub User Details ->");
        System.out.println("Username     : " + user.getLogin());
        System.out.println("Public Repos : " + user.getPublicRepos());

        String convertedJson = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(user);

        System.out.println("\n<- Converted JSON ->");
        System.out.println(convertedJson);
    }
}