package com.v5ent.rapid4j.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 购物车视图控制器
 * 
 * @author Mignet
 * @since 2014年4月15日 下午4:16:34
 **/
@Controller
@RequestMapping("/cart")
public class CartController {
    /**
     * 购物车首页
     * 
     * @param request
     * @return
     */
    @RequestMapping("")
    public String index(HttpServletRequest request) {
        return "cart";
    }
    
    /**
     * 购物车买单页
     * 
     * @param request
     * @return
     */
    @RequestMapping("/checkout")
    public String checkout(HttpServletRequest request) {
    	return "checkout";
    }

}