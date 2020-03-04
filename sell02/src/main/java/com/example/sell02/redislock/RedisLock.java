package com.example.sell02.redislock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisLock {
    @Autowired
    private StringRedisTemplate redisTemplate;
    public Boolean lock(String key,String value){
        if (redisTemplate.opsForValue().setIfAbsent(key,value)){
            return true;
        }
//        .........time out
        String current=redisTemplate.opsForValue().get(key);
        if (Long.parseLong(current)<System.currentTimeMillis()){
            if (current.equals(redisTemplate.opsForValue().getAndSet(key,value))){
                return true;

            }
        }
//        .........................
        return false;
    }
    public void unlock(String key){
        redisTemplate.delete(key);
    }
}
