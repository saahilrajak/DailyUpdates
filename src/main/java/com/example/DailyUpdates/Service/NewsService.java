package com.example.DailyUpdates.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();

    private final String BASE_URL = "https://newsapi.org/v2";
    private final String API_KEY = "0ac5f1b1f74d4f8a9b5cb5ecca2e47fd";

    // get News by countyCode
    public void getNewsByCountry(String countyCode){
        String url = BASE_URL + "/top-headlines?country="+countyCode+"&apiKey"+API_KEY;
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
    }



}
