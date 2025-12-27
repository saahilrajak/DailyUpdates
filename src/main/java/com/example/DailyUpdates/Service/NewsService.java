package com.example.DailyUpdates.Service;

import com.example.DailyUpdates.dto.NewsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();

    private static final String BASE_URL = "https://newsapi.org/v2";
    private static final String API_KEY = "0ac5f1b1f74d4f8a9b5cb5ecca2e47fd";

    public NewsResponse getNewsByCountry(String countryCode) {
        String url = BASE_URL + "/top-headlines?country=" + countryCode + "&apiKey=" + API_KEY;
        NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
        return response;
    }


    public ResponseEntity<Object> getNewsByCategory(String category) {
        String categoryUrl = BASE_URL + "/top-headlines?category=" + category + "&apiKey=" + API_KEY;
        ResponseEntity<Object> response = restTemplate.getForEntity(categoryUrl, Object.class);
        return response;
    }
}
