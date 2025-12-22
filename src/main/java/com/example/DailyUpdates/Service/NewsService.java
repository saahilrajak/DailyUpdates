package com.example.DailyUpdates.Service;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();

    private static final String BASE_URL = "https://newsapi.org/v2";
    private static final String API_KEY = "YOUR_NEWS_API_KEY";;

    public ResponseEntity<Object> getNewsByCountry(String countryCode) {

        String url = BASE_URL + "/top-headlines?country=" + countryCode + "&apiKey=" + API_KEY;
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        return response;
    }


    public ResponseEntity<Object> getNewsByCategory(String category) {
        String categoryUrl = BASE_URL + "/top-headlines?category=" + category + "&apiKey=" + API_KEY;
        ResponseEntity<Object> response = restTemplate.getForEntity(categoryUrl, Object.class);
        return response;
    }
}
