package com.smartstock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class ApiStatusController {
    @GetMapping("/")
    public Map<String, String> status() {
        return Map.of("service", "SmartStockAI API", "status", "UP");
    }
}