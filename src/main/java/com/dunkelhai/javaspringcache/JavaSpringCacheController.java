package com.dunkelhai.javaspringcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JavaSpringCacheController {

    private final JavaSpringCacheService javaSpringCacheService;

    @Autowired
    public JavaSpringCacheController(JavaSpringCacheService javaSpringCacheService) {
        this.javaSpringCacheService = javaSpringCacheService;
    }

    @GetMapping("/getCacheValue")
    public String getCacheValue(@RequestParam String key) {
        return javaSpringCacheService.getValue(key);
    }

    @PostMapping("/clearCache")
    public void clearCache() {
        javaSpringCacheService.clearCache();
    }
}


