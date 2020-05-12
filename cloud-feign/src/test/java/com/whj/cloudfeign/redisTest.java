package com.whj.cloudfeign;


import com.whj.cloudfeign.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class redisTest {


    @Test
    public void redisString() {
        RedisUtils.setValueTimeout("name", "whj", 10);
        System.out.println(RedisUtils.getValue("name"));
    }

    @Test
    public void redisList() {
        RedisUtils.listPush("userNameList", "李四");
        RedisUtils.listPush("userNameList", "张三");
        RedisUtils.expire("userNameList",10000);
    }
}
