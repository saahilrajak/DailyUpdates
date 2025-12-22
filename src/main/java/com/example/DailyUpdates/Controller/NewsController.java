package com.example.DailyUpdates.Controller;

import com.example.DailyUpdates.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public ResponseEntity getNewsByCountry(@RequestParam(value = "country", required = false, defaultValue = "us")
                                               String countryCode){
        newsService.getNewsByCountry(countryCode);
    }
}
