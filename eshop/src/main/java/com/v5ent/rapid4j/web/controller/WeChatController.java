package com.v5ent.rapid4j.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * WeChat视图控制器
 * 
 * @author Mignet
 * @since 2014年4月15日 下午4:16:34
 **/
@Controller
@RequestMapping("/wx")
public class WeChatController {
    /**
     * check
     * 
     * @param request
     * @return
     */
    @RequestMapping("")
    public String check(HttpServletRequest request) {
        return "wx-check";
    }
    
}