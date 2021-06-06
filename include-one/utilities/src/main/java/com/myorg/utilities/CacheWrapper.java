package com.myorg.utilities;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

public class CacheWrapper {

    private Cache<String, String> cache = CacheBuilder.newBuilder().expireAfterAccess(5, TimeUnit.MINUTES).build();

    public String getCachedValue(String key) {
        return cache.getIfPresent(key);
    }

    public void putValue(String key, String value) {
        cache.put(key, value);
    }
}
