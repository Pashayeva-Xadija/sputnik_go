package com.sputnikgo.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Demo Controller", description = "Sadə test əməliyyatları")
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @Operation(summary = "Status yoxlaması", description = "API-nin işləyib-işləmədiyini göstərir")
    @GetMapping("/status")
    public String status() {
        return "SputnikGo API işləyir ✅";
    }
}

