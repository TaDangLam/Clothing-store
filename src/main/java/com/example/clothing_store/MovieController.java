package com.example.clothing_store;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @GetMapping("/all")
    public ResponseEntity<String> allMovies() {
//        return ResponseEntity.status(200).body("test");
        return new ResponseEntity<String>("All Movie123", HttpStatus.OK);
    }


}
