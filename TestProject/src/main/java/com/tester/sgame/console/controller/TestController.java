package com.tester.sgame.console.controller;

import com.alibaba.fastjson.JSONObject;
//import com.sun.org.slf4j.internal.LoggerFactory;
import com.tester.sgame.console.utils.CommonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
//import java.util.logging.Logger;

@Controller
//@RequestMapping("test")
public class TestController {

    /*private static final Logger logger = LoggerFactory.getLogger(TestController.class);*/
    /*@Autowired
    StringRedisTemplate testExclusiveClusterRedisTemplate;*/

    @Resource(name = "testExclusiveClusterRedisTemplate")
    protected StringRedisTemplate testExclusiveClusterRedisTemplate;

    @Resource(name = "redisTemplate")
    private StringRedisTemplate redisTemplate;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String taskTest(HttpServletRequest request, @RequestParam(value = "a", required = false) Integer a, @RequestParam(value = "b", required = true) String b) {
        JSONObject jb = new JSONObject();
        if (StringUtils.isEmpty(b)) {
            jb.put(CommonInterface.error_code, "21");
            jb.put(CommonInterface.error_message, "empty or wrong params");
            jb.put(CommonInterface.reference, "111");
        } else {
            jb.put(CommonInterface.error_code, "0");
            jb.put(CommonInterface.error_message, "success");
            jb.put(CommonInterface.reference, "111");
        }
        //System.out.println("test is :" + jb.toString());
        return jb.toString();
    }

    @RequestMapping(value = "redisOp", method = RequestMethod.GET)
    @ResponseBody
    public String test(HttpServletRequest request) {
        HashOperations<String, String, String> hashOps = testExclusiveClusterRedisTemplate.opsForHash();
        Map<String,String> map = hashOps.entries("test");

        return "";
    }

    @RequestMapping(value = "redisOp2", method = RequestMethod.GET)
    @ResponseBody
    public String test2(HttpServletRequest request) {
        //HashOperations<String, String, String> hashOps = redisTemplate.opsForHash();
        redisTemplate.opsForValue().set("test","reslut");
        //Map<String,String> map = hashOps.entries("test");
        String stringValue = redisTemplate.opsForValue().get("test");
        return stringValue;
    }
}
