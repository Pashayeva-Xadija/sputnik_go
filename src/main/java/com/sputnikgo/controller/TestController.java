package com.sputnikgo.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/test")
@Tag(name = "Test", description = "⚠️ İnkişaf mərhələsindədir — yalnız demo/test məqsədlidir")
public class TestController {

    @GetMapping("/ping")
    @Operation(
            summary = "Ping endpoint",
            description = "Backend-in işlək olduğunu yoxlamaq üçün sadə cavab qaytarır. " +
                    "**Qeyd:** Bu endpoint yalnız demo və test məqsədlidir."
    )
    public ResponseEntity<Map<String, Object>> ping() {
        return ResponseEntity.ok(Map.of(
                "status", "ok",
                "service", "sputnik-go",
                "endpoint", "/api/test/ping"
        ));
    }
}

