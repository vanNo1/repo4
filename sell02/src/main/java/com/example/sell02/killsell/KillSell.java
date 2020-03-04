package com.example.sell02.killsell;

import com.example.sell02.redislock.RedisLock;
import org.omg.CORBA.TIMEOUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KillSell {
    private static int count=1000000;
    private static int selled;
    @Autowired
    private RedisLock redisLock;
    private static final int TIMEOUT=10*1000;
    @RequestMapping("/kill")
    public  void kill(){
        Long time=System.currentTimeMillis()+TIMEOUT;
        redisLock.lock("chips",String.valueOf(time));
        if (count<=0){
            System.out.println("already sell out!!!!");
        }else {
            count=count-1;
            selled=1000000-count;
            System.out.println("count="+count+"  "+"selled="+selled);
        }
        redisLock.unlock("chips");
    }
}
