package com.laughcat.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:lizhuoqi
 * @Description:
 * @Date: Created in 20:17 2018/8/1
 */
@Controller
public class TestController {
    @RequestMapping(value = {"/","/index"})
    public String index(){
        return "index";
    }
}
