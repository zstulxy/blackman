/**
 * 
 */
/**
 * @author cx
 *
 */
package maiya.blackman.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/testController")
public class LoginController {

    @RequestMapping(value="/login", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getTest(HttpServletRequest request){
        return "你好啊，测试成功!!!";
    }
    
    @RequestMapping(value="/sayHello",method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public @ResponseBody
    String sayHello(){
        return "你好啊，测试成功!!!";
    }
}