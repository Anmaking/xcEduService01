package com.xuecheng.auth;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRedis {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    //创建jwt令牌
    @Test
    public void testRedis(){
        //定义key
        String key = "user_token:1622e0ad-5479-463f-945e-b1c545577da2";
        //定义value
        Map<String,String> value = new HashMap<>();
        value.put("jwt","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6IlhjV2ViQXBwIiwic2NvcGUiOlsiYXBwIl0sIm5hbWUiOm51bGwsInV0eXBlIjpudWxsLCJpZCI6bnVsbCwiZXhwIjoxNTgxNTMyMjI2LCJqdGkiOiIxNjIyZTBhZC01NDc5LTQ2M2YtOTQ1ZS1iMWM1NDU1NzdkYTIiLCJjbGllbnRfaWQiOiJYY1dlYkFwcCJ9.hJjZ8qlfThLwvDaN1zJCzf0KsVHsQ6VlhLyF7CPV-_IdiwAVB2GSJ5P1q3MiwH5yMT1Gxxwm08k29h0xEj-NqFHqxyikvcrkw4Mna-yKhgZCt4silgalPGIiMnM8q1V5g2h7U_rlq-g_RPOkynH4NM3BRwMs0OTYMe7Nk5UnFLyu_Zn9-gBu4umlIi-qM-HD_8s09RXScZwx1KhGQ_Jn8FcCgjjJHXiStWyYwwEVbO5bG66sEdOXxFrTpVvXBKY888bouMu53Lnaxqycer2j5x-PvcERmbwcrid_XDw-qBpsxXHrNXtyhZ9yJCdGTBeUlEoU-EH4fGD-e8YRogHzow");
        value.put("refresh_token","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6IlhjV2ViQXBwIiwic2NvcGUiOlsiYXBwIl0sImF0aSI6IjE2MjJlMGFkLTU0NzktNDYzZi05NDVlLWIxYzU0NTU3N2RhMiIsIm5hbWUiOm51bGwsInV0eXBlIjpudWxsLCJpZCI6bnVsbCwiZXhwIjoxNTgxNTMyMjI2LCJqdGkiOiJiYjNkNWVmNS1mYjBjLTQyZmMtYWY2OC1hZDYyMWVmYmU5ZDEiLCJjbGllbnRfaWQiOiJYY1dlYkFwcCJ9.Q0YAj5djqPsf7PBVkAcarc1XEg34si-9-6BghYgEHJ9S3sHs1p23VUEh_RGzSUPHWNMgTbDUELXGkuwLx2_ydFyNIgMAo4-ZbOqjhUwwwxbK5AaTxcO4m8-G8_3m2lAopaoTBnA2RTT7I2TTeUjtRIv_nHfJziMwZgr78Y9RFmt02GrsbePKiYTa--EXdr6B5GgG8lVWaPl1P8gEkq7fMg0r4A7CNn0JSXM9aBCK6vN1UciJjUGRDJyazddo1uf32K29GVWJm5mSoLrxC3TojDr457FaTRG6NZchha65xWd6OvxRLoNmlLupu4o0Cc5X5qnGbt6YJHFuk1L4ZVY4Bw");
        String jsonString = JSON.toJSONString(value);
        //校验key是否存在，如果不存在则返回-2
        Long expire = stringRedisTemplate.getExpire(key, TimeUnit.SECONDS);
        System.out.println(expire);
        //存储数据
        stringRedisTemplate.boundValueOps(key).set(jsonString,30, TimeUnit.SECONDS);
        //获取数据
        String string = stringRedisTemplate.opsForValue().get(key);
        System.out.println(string);


    }


}
