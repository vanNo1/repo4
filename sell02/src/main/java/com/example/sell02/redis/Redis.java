package com.example.sell02.redis;

import redis.clients.jedis.Jedis;

public class Redis {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("182.61.17.101",6379);
        System.out.println(jedis.ping());
    }
}
