package com.tester.sgame.console.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@ControllerAdvice
public class ExceptionConfigController {
    /*@ExceptionHandler
    public ModelAndView exceptionHandler(Exception e){
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        mv.addObject("success",false);
        mv.addObject("mesg","请求发生了异常，请稍后再试");
        return mv;
    }*/

    // 专门用来捕获和处理Controller层的空指针异常
    @ExceptionHandler(NullPointerException.class)
    public ModelAndView nullPointerExceptionHandler(NullPointerException e){
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        /*mv.addObject("success",false);
        mv.addObject("mesg","请求发生了空指针异常，请稍后再试");*/

        mv.addObject("error_message","empty or wrong params");
        mv.addObject("refrene","111");
        mv.addObject("error_code","21");
        mv.addObject("detail_msg",e.getMessage());
        return mv;
    }

    // 专门用来捕获和处理Controller层的运行时异常
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView runtimeExceptionHandler(RuntimeException e){
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        /*mv.addObject("success",false);
        mv.addObject("mesg","请求发生了运行时异常，请稍后再试");
        mv.addObject("errorMsg",e.getMessage());*/
        mv.addObject("error_message","empty or wrong params");
        mv.addObject("refrene","111");
        mv.addObject("error_code","21");
        mv.addObject("detail_msg",e.getMessage());
        return mv;
    }

    // 专门用来捕获和处理Controller层的异常
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception e){
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        /*mv.addObject("success",false);
        mv.addObject("mesg","请求发生了异常，请稍后再试");
        mv.addObject("errorMsg",e.getMessage());*/
        mv.addObject("error_message","empty or wrong params");
        mv.addObject("refrene","111");
        mv.addObject("error_code","11");
        mv.addObject("detail_msg",e.getMessage());

        return mv;
    }

}

