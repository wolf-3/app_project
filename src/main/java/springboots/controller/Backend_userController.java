package springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springboots.pojo.Backend_user;
import springboots.service.Backend_userService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

/**
 * @Description:用户表控制器
 * @Date Created in 14:23   2018/4/25
 */

@Controller
public class Backend_userController {

    @Autowired
    private Backend_userService backend_userService;

    @Autowired
    private Backend_user backend_user;

    @RequestMapping("/backlogin.html")
    public String backEndLogin(String userCode, String userPassword,HttpSession httpSession , HttpServletRequest httpServletRequest){
        String error = "";
        if(userCode != null && userCode != "" && userPassword != null && userPassword != ""){
            backend_user = backend_userService.backLognin(userCode,userPassword);
            if(backend_user != null) {
                httpSession.setAttribute("userSession",backend_user);
                return "forward:/backmain.html";
            }else{
                error = "用户名或密码错误";
            }
        }
        httpServletRequest.setAttribute("error",error);
        return "backendlogin";
    }

    @RequestMapping("/backmain.html")
    public String backEndMain(){
        return "backend/main";
    }

    @RequestMapping("/backapplist.html")
    public String backEndAppList(){

        return "backend/applist";
    }

    @RequestMapping("/backappcheck.html")
    public String backEndAppCheck( HttpServletRequest httpServletRequest){

        return "backend/appcheck";
    }

    @RequestMapping("/backexit.html")
    public String backEndExit(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/backlogin.html";
    }
}
