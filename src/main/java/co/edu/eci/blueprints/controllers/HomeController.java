package co.edu.eci.blueprints.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
                "status", "ok",
                "message", "Blueprints API running",
                "endpoints", Map.of(
                        "login", "/auth/login",
                        "blueprints", "/api/v1/blueprints"
                )
        );
    }
}
