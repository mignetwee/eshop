package com.v5ent.rapid4j.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 顶层视图控制器
 * 
 * @author Mignet
 * @since 2014年4月15日 下午4:16:34
 **/
@Controller
public class CommonController {
    /**
     * 首页
     * 
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "index";
    }
    
    @RequestMapping("shop")
    public String shop(HttpServletRequest request) {
    	return "shop";
    }
    
    @RequestMapping("product-details")
    public String productDetails(HttpServletRequest request) {
    	return "product-details";
    }
    
    /**
     * contact-us
     */
    @RequestMapping("/contact-us")
    public String contactus() {
    	return "contact-us";
    }

}