package com.dunkelhai.javaspringcache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(value = "myCache", key = "#key")
    public String getValue(String key) {
        return "Valor para " + key;
    }

    @CacheEvict(value = "myCache", allEntries = true)
    public void clearCache() {
    }
}

