package com.example.sensors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {
    private final SensorReadingRepository repository;

    public SensorController(SensorReadingRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<String> reseiveData(@RequestBody SensorReading reading){
        repository.save(reading);
        return ResponseEntity.ok("Data saved");
    }
}
