package com.dunkelhai.javaspringcache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class JavaSpringCacheService {

    @Cacheable(value = "teste", key = "#key")
    public String getValue(String key) {
        return "Valor para " + key;
    }

    @CacheEvict(value = "teste", allEntries = true)
    public void clearCache() {
    }
}

