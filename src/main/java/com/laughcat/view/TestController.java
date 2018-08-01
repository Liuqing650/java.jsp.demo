package com.laughcat.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.Date;

/**
 * @Author:lizhuoqi
 * @Description:
 * @Date: Created in 20:17 2018/8/1
 */
@Controller
public class TestController {
    // 从 application.yml 中读取配置，如取不到默认值为Hello Jsp
    @Value("${application.hello:Hello Jsp}")
    private String hello = "Hello Jsp";

    @RequestMapping(value = {"/", "/index"})
    public String index(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", this.hello);
        return "index";
    }
    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("content", hello);
        return mav;
    }
}
