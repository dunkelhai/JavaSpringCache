package com.dunkelhai.javaspringcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @GetMapping("/getCacheValue")
    @Cacheable("senacCache")
    public String getCacheValue(@RequestParam String key) {
        return "Valor para " + key;
    }
}

