package com.naveen.backend.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try {
            String username = "Mr-Naveen007";

            URL url = new URL("https://api.github.com/users/" + username);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();

            System.out.println("Response Code: " + responseCode);

            BufferedReader reader;

            if (responseCode >= 200 && responseCode < 300) {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            String json = response.toString();

            int startIndex = json.indexOf("\"login\"");
            int colonIndex = json.indexOf(":", startIndex);
            int firstQuote = json.indexOf("\"", colonIndex + 1);
            int secondQuote = json.indexOf("\"", firstQuote + 1);

            String login = json.substring(firstQuote + 1, secondQuote);

            int repoIndex = json.indexOf("\"public_repos\"");
            int colonIndex2 = json.indexOf(":", repoIndex);

// find end of number (comma or closing brace)
            int endIndex = json.indexOf(",", colonIndex2);
            if (endIndex == -1) {
                endIndex = json.indexOf("}", colonIndex2);
            }

            String publicRepos = json.substring(colonIndex2 + 1, endIndex).trim();


            System.out.println("Response Body:");

            System.out.println("Login: " + login);
            System.out.println("Public Repos: " + publicRepos);

            reader.close();


            //System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}