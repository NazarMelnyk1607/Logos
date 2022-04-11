package com.logos.Lesson_24.Convertator;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeService {
    private final String apiUrl;

    public ExchangeService(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public Exchange[] sentGetRequest() throws IOException {
        URL url = new URL(this.apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setConnectTimeout(3000);
        connection.setReadTimeout(2000);

        System.out.println(connection.getResponseCode() + " - " + connection.getResponseMessage());
        Exchange[] result = readDataFromConnection(connection);
        connection.disconnect();
        return result;
    }

    private Exchange[] readDataFromConnection(HttpURLConnection connection) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null){
            content.append(inputLine);
        }
        in.close();
        return convertJSONString(content.toString());
    }

    private Exchange[] convertJSONString(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Exchange[].class);
    }
}
