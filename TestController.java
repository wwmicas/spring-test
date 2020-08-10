package com.tester.sgame.console.controller;

import com.alibaba.fastjson.JSONObject;
//import com.sun.org.slf4j.internal.LoggerFactory;
import com.tester.sgame.console.utils.CommonInterface;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
//import java.util.logging.Logger;

@Controller
//@RequestMapping("shopee")
public class TestController {

    /*private static final Logger logger = LoggerFactory.getLogger(TestController.class);*/

    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
    public String taskTest(HttpServletRequest request, @RequestParam(value="a",required = false)Integer a, @RequestParam(value="b",required = true)String b){
        JSONObject jb = new JSONObject();
        if(StringUtils.isEmpty(b)){
            jb.put(CommonInterface.error_code,"21");
            jb.put(CommonInterface.error_message,"empty or wrong params");
            jb.put(CommonInterface.reference,"111");
        }else {
            jb.put(CommonInterface.error_code,"0");
            jb.put(CommonInterface.error_message,"success");
            jb.put(CommonInterface.reference,"111");
        }
        //System.out.println("test is :" + jb.toString());
        return jb.toString();
    }
}
