package com.dunkelhai.javaspringcache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(value = "myCache", key = "#key") // Define um cache chamado "myCache" e uma chave dinâmica
    public String getValue(String key) {
        // Simule uma consulta demorada ou obtenha dados do banco de dados aqui
        return "Valor para " + key;
    }

    @CacheEvict(value = "myCache", allEntries = true) // Limpa todo o cache "myCache"
    public void clearCache() {
    }
}

