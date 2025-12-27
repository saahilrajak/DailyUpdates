package com.example.DailyUpdates.Controller;

import com.example.DailyUpdates.Service.NewsService;
import com.example.DailyUpdates.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public ResponseEntity<NewsResponse> getNewsByCountry(
            @RequestParam(value = "country", defaultValue = "us") String countryCode) {

        NewsResponse response = newsService.getNewsByCountry(countryCode);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<Object> getNewsByCategory(@PathVariable String category){
        return newsService.getNewsByCategory(category);
    }

}
