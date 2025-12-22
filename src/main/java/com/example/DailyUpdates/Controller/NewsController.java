package com.example.DailyUpdates.Controller;

import com.example.DailyUpdates.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public ResponseEntity<Object> getNewsByCountry(
            @RequestParam(value = "country", defaultValue = "us") String countryCode) {

        return newsService.getNewsByCountry(countryCode);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<Object> getNewsByCategory(@PathVariable String category){
        return newsService.getNewsByCategory(category);
    }

}
