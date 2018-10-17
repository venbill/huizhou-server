package com.superstar;

import com.superstar.config.Constants;
import com.superstar.util.GsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:13 2018/10/17.
 */

    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class RedisTest {
        @Autowired
        private RedisTemplate redisTemplate;

        @Test
        public void test() {
            Object o = redisTemplate.opsForValue().get( Constants.MSG_NO_PREFIX.toString()+"15856687612");
            Integer msgNo = o==null?0:(int)o;
            System.out.println(msgNo);
            String  key = Constants.MSG_NO_PREFIX.toString()+"15856687612";
            redisTemplate.opsForValue().get(key);
            redisTemplate.opsForValue().set(key,0);
            System.out.println(redisTemplate.opsForValue().get(key));
            System.out.println(redisTemplate.opsForValue().increment(key,1L));

            String codeKey = Constants.MSG_CODE_PREFIX.toString() + "15856687612";
            System.out.println(redisTemplate.opsForValue().get(codeKey));
            ValueOperations<String, Object> valueOperate = redisTemplate.opsForValue();
            valueOperate.set(codeKey, "hhjnn", 3600,TimeUnit.SECONDS);
        }

    }
