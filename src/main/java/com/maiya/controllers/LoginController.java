/**
 * 
 */
/**
 * @author cx
 *
 */
package com.maiya.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController extends AuthModule{
    private static Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping(value="/value", method=RequestMethod.GET)
    public @ResponseBody String getTest(HttpServletRequest request){
        String token = request.getParameter("token");
        boolean isAuth = this.isAuthSuccess(token);
        if (!isAuth) {
            return "验证失败，token错误";
        }

        return "你好啊，测试成功!!!";
    }
    
    @RequestMapping(value="/sayHello",method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public @ResponseBody
    String sayHello(){
        return "你好啊，测试成功!!!";
    }
}