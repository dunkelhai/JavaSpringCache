package com.dunkelhai.javaspringcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CacheController {

    private final CacheService cacheService;

    @Autowired
    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("/getCacheValue")
    public String getCacheValue(@RequestParam String key) {
        return cacheService.getValue(key);
    }

    @PostMapping("/clearCache")
    public void clearCache() {
        cacheService.clearCache();
    }
}


