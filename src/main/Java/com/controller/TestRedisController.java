package com.controller;

import com.pojo.RedisTest;
import com.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * Author:17
 * Date:2021-02-21 19:00
 * Description:<描述>
 */
@Controller
public class TestRedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/redisTest")
    public void redisTest(){
        basic();
    }

    public void basic(){
        RedisTest test = new RedisTest();
        test.setId(UUID.randomUUID().toString());
        test.setName("测试");
        redisUtil.set("Test",test);
        redisUtil.set("redisTest","存入Redis");

        System.out.println(redisUtil.get("redisTest"));

    }

}
